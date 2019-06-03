var exibiu_grafico_cpu = false;

function atualizarGraficoCpu() {
  ctx = bigDashboardChart.getContext('2d');

  gradientStroke = ctx.createLinearGradient(500, 0, 100, 0);
  gradientStroke.addColorStop(0, '#80b6f4');
  gradientStroke.addColorStop(1, chartColor);

  gradientFill = ctx.createLinearGradient(0, 170, 0, 50);
  gradientFill.addColorStop(0, "rgba(128, 182, 244, 0)");
  gradientFill.addColorStop(1, "rgba(249, 99, 59, 0.40)");

  obterDadosGraficoCpu();
  setTimeout(atualizarGraficoCpu, 10000);
}

function atualizarGraficoMemoria() {
    ctxMemoria = lineChartExample.getContext("2d");

    gradientStroke = ctxMemoria.createLinearGradient(500, 0, 100, 0);
    gradientStroke.addColorStop(0, '#80b6f4');
    gradientStroke.addColorStop(1, chartColor);

    gradientFill = ctxMemoria.createLinearGradient(0, 170, 0, 50);
    gradientFill.addColorStop(0, "rgba(128, 182, 244, 0)");
    gradientFill.addColorStop(1, "rgba(249, 99, 59, 0.40)");

    obterDadosGraficoMemoria();
    setTimeout(atualizarGraficoMemoria, 10000);
  
}

function atualizarGraficoSwap() {
  ctxSwap = lineChartExampleWithNumbersAndGrid.getContext("2d");

  gradientStroke = ctxSwap.createLinearGradient(500, 0, 100, 0);
  gradientStroke.addColorStop(0, '#18ce0f');
  gradientStroke.addColorStop(1, chartColor);

  gradientFill = ctxSwap.createLinearGradient(0, 170, 0, 50);
  gradientFill.addColorStop(0, "rgba(128, 182, 244, 0)");
  gradientFill.addColorStop(1, hexToRGB('#18ce0f', 0.4));

  obterDadosGraficoSwap();
  setTimeout(atualizarGraficoSwap, 10000);

}

// altere aqui as configurações do gráfico
    // (tamanhos, cores, textos, etc)
function configurarGraficoCpu() {
      var configuracoes = {
        responsive: true,
        animation: exibiu_grafico_cpu ? false : {duration: 1500},
        layout: {
          padding: {
            left: 20,
            right: 20,
            top: 0,
            bottom: 0
          }
        },
        maintainAspectRatio: false,
        tooltips: {
          backgroundColor: '#fff',
          titleFontColor: '#333',
          bodyFontColor: '#666',
          bodySpacing: 4,
          xPadding: 12,
          mode: "nearest",
          intersect: 0,
          position: "nearest"
        },
        legend: {
          position: "bottom",
          fillStyle: "#FFF",
          display: false
        },
        scales: {
          yAxes: [{
            ticks: {
              fontColor: "rgba(255,255,255,0.4)",
              fontStyle: "bold",
              beginAtZero: true,
              maxTicksLimit: 5,
              padding: 10
            },
            gridLines: {
              drawTicks: true,
              drawBorder: false,
              display: true,
              color: "rgba(255,255,255,0.1)",
              zeroLineColor: "transparent"
            }
    
          }],
          xAxes: [{
            gridLines: {
              zeroLineColor: "transparent",
              display: false,
    
            },
            ticks: {
              padding: 10,
              fontColor: "rgba(255,255,255,0.4)",
              fontStyle: "bold"
            }
          }]
        }
      };
      exibiu_grafico_cpu = true;
      return configuracoes;
  }

function configurarGraficoMemoria() {
  var configuracoes = {
    maintainAspectRatio: false,
    legend: {
      display: false
    },
    tooltips: {
      bodySpacing: 4,
      mode: "nearest",
      intersect: 0,
      position: "nearest",
      xPadding: 10,
      yPadding: 10,
      caretPadding: 10
    },
    responsive: true,
    scales: {
      yAxes: [{
        display: 0,
        // gridLine mudado pra pie
        pie: 0,
        ticks: {
          display: false
        },
        // gridLine mudado pra pie
        pie: {
          zeroLineColor: "transparent",
          drawTicks: false,
          display: false,
          drawBorder: false
        }
      }],
      xAxes: [{
        display: 0,
        // gridLine mudado pra pie
        pie: 0,
        ticks: {
          display: false
        },
        // gridLine mudado pra pie
        pie: {
          zeroLineColor: "transparent",
          drawTicks: false,
          display: false,
          drawBorder: false
        }
      }]
    },
    layout: {
      padding: {
        left: 0,
        right: 0,
        top: 15,
        bottom: 15
      }
    }
  };
  return configuracoes;
}

function configurarGraficoSwap() {
  var configuracoes = {
    maintainAspectRatio: false,
    legend: {
      display: false
    },
    tooltips: {
      bodySpacing: 4,
      mode: "nearest",
      intersect: 0,
      position: "nearest",
      xPadding: 10,
      yPadding: 10,
      caretPadding: 10
    },
    responsive: true,
    scales: {
      yAxes: [{
        display: 0, // Essa linha tem a função de retirar as linhas do gráfico de pizza
        gridLines: 0,
        gridLines: {
          zeroLineColor: "transparent",
          drawBorder: false
        }
      }],
      xAxes: [{
        display: 0,
        gridLines: 0,
        ticks: {
          display: false
        },
        gridLines: {
          zeroLineColor: "transparent",
          drawTicks: false,
          display: false,
          drawBorder: false
        }
      }]
    },
    layout: {
      padding: {
        left: 0,
        right: 0,
        top: 15,
        bottom: 15
      }
    }
  };
  return configuracoes;
}
// altere aqui como os dados serão exibidos
// e como são recuperados do BackEnd
function obterDadosGraficoCpu() {
  // neste JSON tem que ser 'labels', 'datasets' etc, 
  // porque é o padrão do Chart.js
  var dados = {
      labels: [],
      datasets: [
        {
          label: "Data",
          borderColor: chartColor,
          pointBorderColor: chartColor,
          pointBackgroundColor: "#1e3d60",
          pointHoverBackgroundColor: "#1e3d60",
          pointHoverBorderColor: chartColor,
          pointBorderWidth: 1,
          pointHoverRadius: 7,
          pointHoverBorderWidth: 2,
          pointRadius: 5,
          fill: true,
          backgroundColor: gradientFill,
          borderWidth: 2,
          data: []
        }
      ]
  };
  fetch('/leituras/ultimas', { cache: 'no-store' }).then(function (response) {
      if (response.ok) {
          response.json().then(function (resposta) {
              console.log(`Dados recebidos: ${JSON.stringify(resposta)}`);
              resposta.reverse();
              for (i = 0; i < resposta.length; i++) {
                  var registro = resposta[i];
              
                  // aqui, após 'registro.' use os nomes 
                  // dos atributos que vem no JSON 
                  // que gerou na consulta ao banco de dados
                  dados.labels.push(registro.data_hora);
                  dados.datasets[0].data.push(registro.utilizado);
              }
              console.log(JSON.stringify(dados));
              plotarGraficoCpu(dados);
          });
      } else {
          console.error('Nenhum dado encontrado ou erro na API');
      }
  }).catch(function (error) {
      console.error(`Erro na obtenção dos dados p/ gráfico: ${error.message}`);
  });
}

function obterDadosGraficoMemoria() {
  // neste JSON tem que ser 'labels', 'datasets' etc, 
  // porque é o padrão do Chart.js
  var dados = {
    labels: ["Utilizado","Disponível"],
      datasets: [
        {
          borderColor: "#f96332",
          pointBorderColor: "#FFF",
          pointBackgroundColor: "#f96332",
          pointBorderWidth: 2,
          pointHoverRadius: 4,
          pointHoverBorderWidth: 1,
          pointRadius: 4,
          fill: true,
          backgroundColor: gradientFill,
          borderWidth: 2,
          data: []
        }
      ]
  };
  fetch('/leituras/tempo-real-memoria', { cache: 'no-store' }).then(function (response) {
      if (response.ok) {
          response.json().then(function (resposta) {
              console.log(`Dados recebidos: ${JSON.stringify(resposta)}`);
              
              
              
                  // aqui, após 'registro.' use os nomes 
                  // dos atributos que vem no JSON 
                  // que gerou na consulta ao banco de dados
                  dados.datasets[0].data.push(resposta.utilizado);
                  dados.datasets[0].data.push(resposta.disponivel);

                  var porcentagem = (Number(resposta.utilizado) / (Number(resposta.disponivel) + Number(resposta.utilizado)))*100;
                  porcentagem_memoria.innerHTML = `${porcentagem}%`;
              
              console.log(JSON.stringify(dados));
              plotarGraficoMemoria(dados);
          });
      } else {
          console.error('Nenhum dado encontrado ou erro na API');
      }
  }).catch(function (error) {
      console.error(`Erro na obtenção dos dados p/ gráfico: ${error.message}`);
  });
}

function obterDadosGraficoSwap() {
  // neste JSON tem que ser 'labels', 'datasets' etc, 
  // porque é o padrão do Chart.js
  var dados = {
    labels: ["Utilizado","Disponível"],
    datasets: [{
      label: "Email Stats",
      borderColor: "#18ce0f",
      pointBorderColor: "#FFF",
      pointBackgroundColor: "#18ce0f",
      pointBorderWidth: 2,
      pointHoverRadius: 4,
      pointHoverBorderWidth: 1,
      pointRadius: 4,
      fill: true,
      backgroundColor: gradientFill,
      borderWidth: 2,
      data: [100, 100]
    }]
  };
  fetch('/leituras/tempo-real-memoria', { cache: 'no-store' }).then(function (response) {
      if (response.ok) {
          response.json().then(function (resposta) {
              console.log(`Dados recebidos: ${JSON.stringify(resposta)}`);
              
              
              
                  // aqui, após 'registro.' use os nomes 
                  // dos atributos que vem no JSON 
                  // que gerou na consulta ao banco de dados
                  //dados.datasets[0].data.push(resposta.utilizado);
                  //dados.datasets[0].data.push(resposta.disponivel);

                  //var porcentagem = (Number(resposta.utilizado) / (Number(resposta.disponivel) + Number(resposta.utilizado)))*100;
                  //porcentagem_memoria.innerHTML = `${porcentagem}%`;
              
              console.log(JSON.stringify(dados));
              plotarGraficoSwap(dados);
          });
      } else {
          console.error('Nenhum dado encontrado ou erro na API');
      }
  }).catch(function (error) {
      console.error(`Erro na obtenção dos dados p/ gráfico: ${error.message}`);
  });
}


// só altere aqui se souber o que está fazendo!
function plotarGraficoCpu(dados) {
  console.log('iniciando plotagem do gráfico...');
  
  window.grafico_linha = Chart.Line(ctx, {
      data: dados,
      options: configurarGraficoCpu()
  });
}

function plotarGraficoMemoria(dados) {
  console.log('iniciando plotagem do gráfico...');
  
  window.grafico_memoria = new Chart(ctxMemoria, {
    // gráfico de pizza alterado
    type: 'pie',
    responsive: true,
    data: dados,
    options: configurarGraficoMemoria()
  });
  
  /*Chart.Pie(ctx, {
      data: dados,
      options: configurarGraficoMemoria()
  });*/
}

function plotarGraficoSwap(dados) {
  console.log('iniciando plotagem do gráfico...');
  
  window.grafico_swap = new Chart(ctxSwap, {
    // gráfico de pizza alterado
    type: 'pie',
    responsive: true,
    data: dados,
    options: configurarGraficoSwap()
  });
}

demo = {
  initPickColor: function() {
    $('.pick-class-label').click(function() {
      var new_class = $(this).attr('new-class');
      var old_class = $('#display-buttons').attr('data-class');
      var display_div = $('#display-buttons');
      if (display_div.length) {
        var display_buttons = display_div.find('.btn');
        display_buttons.removeClass(old_class);
        display_buttons.addClass(new_class);
        display_div.attr('data-class', new_class);
      }
    });
  },

  initDocChart: function() {
    chartColor = "#FFFFFF";

    // General configuration for the charts with Line gradientStroke
    gradientChartOptionsConfiguration = {
      maintainAspectRatio: false,
      legend: {
        display: false
      },
      tooltips: {
        bodySpacing: 4,
        mode: "nearest",
        intersect: 0,
        position: "nearest",
        xPadding: 10,
        yPadding: 10,
        caretPadding: 10
      },
      responsive: true,
      scales: {
        yAxes: [{
          display: 0,
          // gridLine mudado pra pie
          pie: 0,
          ticks: {
            display: false
          },
          // gridLine mudado pra pie
          pie: {
            zeroLineColor: "transparent",
            drawTicks: false,
            display: false,
            drawBorder: false
          }
        }],
        xAxes: [{
          display: 0,
          // gridLine mudado pra pie
          pie: 0,
          ticks: {
            display: false
          },
          // gridLine mudado pra pie
          pie: {
            zeroLineColor: "transparent",
            drawTicks: false,
            display: false,
            drawBorder: false
          }
        }]
      },
      layout: {
        padding: {
          left: 0,
          right: 0,
          top: 15,
          bottom: 15
        }
      }
    };

    ctx = document.getElementById('lineChartExample').getContext("2d");

    gradientStroke = ctx.createLinearGradient(500, 0, 100, 0);
    gradientStroke.addColorStop(0, '#80b6f4');
    gradientStroke.addColorStop(1, chartColor);

    gradientFill = ctx.createLinearGradient(0, 170, 0, 50);
    gradientFill.addColorStop(0, "rgba(128, 182, 244, 0)");
    gradientFill.addColorStop(1, "rgba(249, 99, 59, 0.40)");

    myChart = new Chart(ctx, {
      // line mudado pra pie
      type: 'pie',
      responsive: true,
      data: {
        labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
        datasets: [{
          label: "Active Users",
          borderColor: "#f96332",
          pointBorderColor: "#FFF",
          pointBackgroundColor: "#f96332",
          pointBorderWidth: 2,
          pointHoverRadius: 4,
          pointHoverBorderWidth: 1,
          pointRadius: 4,
          fill: true,
          backgroundColor: gradientFill,
          borderWidth: 2,
          data: [542, 480, 430, 550, 530, 453, 380, 434, 568, 610, 700, 630]
        }]
      },
      options: gradientChartOptionsConfiguration
    });
  },

  initDashboardPageCharts: function() {

    chartColor = "#FFFFFF";

    // General configuration for the charts with Line gradientStroke
    gradientChartOptionsConfiguration = {
      maintainAspectRatio: false,
      legend: {
        display: false
      },
      tooltips: {
        bodySpacing: 4,
        mode: "nearest",
        intersect: 0,
        position: "nearest",
        xPadding: 10,
        yPadding: 10,
        caretPadding: 10
      },
      responsive: 1,
      scales: {
        yAxes: [{
          display: 0,
          gridLines: 0,
          ticks: {
            display: false
          },
          gridLines: {
            zeroLineColor: "transparent",
            drawTicks: false,
            display: false,
            drawBorder: false
          }
        }],
        xAxes: [{
          display: 0,
          gridLines: 0,
          ticks: {
            display: false
          },
          gridLines: {
            zeroLineColor: "transparent",
            drawTicks: false,
            display: false,
            drawBorder: false
          }
        }]
      },
      layout: {
        padding: {
          left: 0,
          right: 0,
          top: 15,
          bottom: 15
        }
      }
    };

    // gradientChartOptionsConfigurationWithNumbersAndGrid = {
    //   maintainAspectRatio: false,
    //   legend: {
    //     display: false
    //   },
    //   tooltips: {
    //     bodySpacing: 4,
    //     mode: "nearest",
    //     intersect: 0,
    //     position: "nearest",
    //     xPadding: 10,
    //     yPadding: 10,
    //     caretPadding: 10
    //   },
    //   responsive: true,
    //   scales: {
    //     yAxes: [{
    //       display: 0, // Essa linha tem a função de retirar as linhas do gráfico de pizza
    //       gridLines: 0,
    //       gridLines: {
    //         zeroLineColor: "transparent",
    //         drawBorder: false
    //       }
    //     }],
    //     xAxes: [{
    //       display: 0,
    //       gridLines: 0,
    //       ticks: {
    //         display: false
    //       },
    //       gridLines: {
    //         zeroLineColor: "transparent",
    //         drawTicks: false,
    //         display: false,
    //         drawBorder: false
    //       }
    //     }]
    //   },
    //   layout: {
    //     padding: {
    //       left: 0,
    //       right: 0,
    //       top: 15,
    //       bottom: 15
    //     }
    //   }
    // };

    atualizarGraficoCpu();
    atualizarGraficoMemoria();
    atualizarGraficoSwap();

    /*
    var cardStatsMiniLineColor = "#fff",
      cardStatsMiniDotColor = "#fff";

    ctx = document.getElementById('lineChartExample').getContext("2d");

    gradientStroke = ctx.createLinearGradient(500, 0, 100, 0);
    gradientStroke.addColorStop(0, '#80b6f4');
    gradientStroke.addColorStop(1, chartColor);

    gradientFill = ctx.createLinearGradient(0, 170, 0, 50);
    gradientFill.addColorStop(0, "rgba(128, 182, 244, 0)");
    gradientFill.addColorStop(1, "rgba(249, 99, 59, 0.40)");

    myChart = new Chart(ctx, {
      // gráfico de pizza alterado
      type: 'pie',
      responsive: true,
      data: {
        labels: ["Utilizado", "Disponivel"],
        datasets: [{
          label: "Active Users",
          borderColor: "#f96332",
          pointBorderColor: "#FFF",
          pointBackgroundColor: "#f96332",
          pointBorderWidth: 2,
          pointHoverRadius: 4,
          pointHoverBorderWidth: 1,
          pointRadius: 4,
          fill: true,
          backgroundColor: gradientFill,
          borderWidth: 2,
          data: [80, 20]
        }]
      },
      options: gradientChartOptionsConfiguration
    });
*/
    // Swap
    // ctx = document.getElementById('lineChartExampleWithNumbersAndGrid').getContext("2d");

    // gradientStroke = ctx.createLinearGradient(500, 0, 100, 0);
    // gradientStroke.addColorStop(0, '#18ce0f');
    // gradientStroke.addColorStop(1, chartColor);

    // gradientFill = ctx.createLinearGradient(0, 170, 0, 50);
    // gradientFill.addColorStop(0, "rgba(128, 182, 244, 0)");
    // gradientFill.addColorStop(1, hexToRGB('#18ce0f', 0.4));

    // myChart = new Chart(ctx, {
    //   // gráfico de linha mudado para gráfico de pizza "pie"
    //   type: 'pie',
    //   responsive: true,
    //   data: {
    //     labels: ["12pm,", "3pm", "6pm", "9pm", "12am", "3am", "6am", "9am"],
    //     datasets: [{
    //       label: "Email Stats",
    //       borderColor: "#18ce0f",
    //       pointBorderColor: "#FFF",
    //       pointBackgroundColor: "#18ce0f",
    //       pointBorderWidth: 2,
    //       pointHoverRadius: 4,
    //       pointHoverBorderWidth: 1,
    //       pointRadius: 4,
    //       fill: true,
    //       backgroundColor: gradientFill,
    //       borderWidth: 2,
    //       data: [40, 500, 650, 700, 1200, 1250, 1300, 1900]
    //     }]
    //   },
    //   options: gradientChartOptionsConfigurationWithNumbersAndGrid
    // });

    // disco rigido
    var e = document.getElementById("barChartSimpleGradientsNumbers").getContext("2d");

    gradientFill = ctx.createLinearGradient(0, 170, 0, 50);
    gradientFill.addColorStop(0, "rgba(128, 182, 244, 0)");
    gradientFill.addColorStop(1, hexToRGB('#2CA8FF', 0.6));

    var a = {
      // gráfico de pizza
      type: "pie",
      data: {
        labels: ["Disponível", "Em Uso"],
        datasets: [{
          label: "Active Countries",
          backgroundColor: gradientFill,
          borderColor: "#2CA8FF",
          pointBorderColor: "#FFF",
          pointBackgroundColor: "#2CA8FF",
          pointBorderWidth: 2,
          pointHoverRadius: 4,
          pointHoverBorderWidth: 1,
          pointRadius: 4,
          fill: true,
          borderWidth: 1,
          data: [5, 95]
        }]
      },
      options: {
        maintainAspectRatio: false,
        legend: {
          display: false
        },
        tooltips: {
          bodySpacing: 4,
          mode: "nearest",
          intersect: 0,
          position: "nearest",
          xPadding: 10,
          yPadding: 10,
          caretPadding: 10
        },
        responsive: 1,
        scales: {
          yAxes: [{
            display: 0, // Essa linha tem como função tirar a linha de fundo do gráfico de pizza
            gridLines: 0,
            gridLines: {
              zeroLineColor: "transparent",
              drawBorder: false
            }
          }],
          xAxes: [{
            display: 0,
            gridLines: 0,
            ticks: {
              display: false
            },
            gridLines: {
              zeroLineColor: "transparent",
              drawTicks: false,
              display: false,
              drawBorder: false
            }
          }]
        },
        layout: {
          padding: {
            left: 0,
            right: 0,
            top: 15,
            bottom: 15
          }
        }
      }
    };

    var viewsChart = new Chart(e, a);
  },

  initGoogleMaps: function() {
    var myLatlng = new google.maps.LatLng(40.748817, -73.985428);
    var mapOptions = {
      zoom: 13,
      center: myLatlng,
      scrollwheel: false, //we disable de scroll over the map, it is a really annoing when you scroll through page
      styles: [{
        "featureType": "water",
        "elementType": "geometry",
        "stylers": [{
          "color": "#e9e9e9"
        }, {
          "lightness": 17
        }]
      }, {
        "featureType": "landscape",
        "elementType": "geometry",
        "stylers": [{
          "color": "#f5f5f5"
        }, {
          "lightness": 20
        }]
      }, {
        "featureType": "road.highway",
        "elementType": "geometry.fill",
        "stylers": [{
          "color": "#ffffff"
        }, {
          "lightness": 17
        }]
      }, {
        "featureType": "road.highway",
        "elementType": "geometry.stroke",
        "stylers": [{
          "color": "#ffffff"
        }, {
          "lightness": 29
        }, {
          "weight": 0.2
        }]
      }, {
        "featureType": "road.arterial",
        "elementType": "geometry",
        "stylers": [{
          "color": "#ffffff"
        }, {
          "lightness": 18
        }]
      }, {
        "featureType": "road.local",
        "elementType": "geometry",
        "stylers": [{
          "color": "#ffffff"
        }, {
          "lightness": 16
        }]
      }, {
        "featureType": "poi",
        "elementType": "geometry",
        "stylers": [{
          "color": "#f5f5f5"
        }, {
          "lightness": 21
        }]
      }, {
        "featureType": "poi.park",
        "elementType": "geometry",
        "stylers": [{
          "color": "#dedede"
        }, {
          "lightness": 21
        }]
      }, {
        "elementType": "labels.text.stroke",
        "stylers": [{
          "visibility": "on"
        }, {
          "color": "#ffffff"
        }, {
          "lightness": 16
        }]
      }, {
        "elementType": "labels.text.fill",
        "stylers": [{
          "saturation": 36
        }, {
          "color": "#333333"
        }, {
          "lightness": 40
        }]
      }, {
        "elementType": "labels.icon",
        "stylers": [{
          "visibility": "off"
        }]
      }, {
        "featureType": "transit",
        "elementType": "geometry",
        "stylers": [{
          "color": "#f2f2f2"
        }, {
          "lightness": 19
        }]
      }, {
        "featureType": "administrative",
        "elementType": "geometry.fill",
        "stylers": [{
          "color": "#fefefe"
        }, {
          "lightness": 20
        }]
      }, {
        "featureType": "administrative",
        "elementType": "geometry.stroke",
        "stylers": [{
          "color": "#fefefe"
        }, {
          "lightness": 17
        }, {
          "weight": 1.2
        }]
      }]
    };

    var map = new google.maps.Map(document.getElementById("map"), mapOptions);

    var marker = new google.maps.Marker({
      position: myLatlng,
      title: "Hello World!"
    });

    // To add the marker to the map, call setMap();
    marker.setMap(map);
  }
};