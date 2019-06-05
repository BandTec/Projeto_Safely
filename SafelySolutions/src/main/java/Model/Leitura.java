package Model;

public class Leitura {
   private int idLeitura;
   private int idMaquina;
   private int qtdProcessos;
   private int qtdInterrupcoes;
   private int velocidadeDeLeituraCpu;
   private double usoCpu;
   private int usoMemoria;
   private int usoDisco;
   private String dataHora;


    public Leitura() {
    }

    public Leitura(int idLeitura, int idMaquina, int qtdProcessos, int qtdInterrupcoes, int velocidadeDeLeituraCpu, double usoCpu, int usoMemoria, int usoDisco, String dataHora) {
        this.idLeitura = idLeitura;
        this.idMaquina = idMaquina;
        this.qtdProcessos = qtdProcessos;
        this.qtdInterrupcoes = qtdInterrupcoes;
        this.velocidadeDeLeituraCpu = velocidadeDeLeituraCpu;
        this.usoCpu = usoCpu;
        this.usoMemoria = usoMemoria;
        this.usoDisco = usoDisco;
        this.dataHora = dataHora;
    }

    public int getIdLeitura() {
        return idLeitura;
    }

    public void setIdLeitura(int idLeitura) {
        this.idLeitura = idLeitura;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public int getQtdProcessos() {
        return qtdProcessos;
    }

    public void setQtdProcessos(int qtdProcessos) {
        this.qtdProcessos = qtdProcessos;
    }

    public int getQtdInterrupcoes() {
        return qtdInterrupcoes;
    }

    public void setQtdInterrupcoes(int qtdInterrupcoes) {
        this.qtdInterrupcoes = qtdInterrupcoes;
    }

    public int getVelocidadeDeLeituraCpu() {
        return velocidadeDeLeituraCpu;
    }

    public void setVelocidadeDeLeituraCpu(int velocidadeDeLeituraCpu) {
        this.velocidadeDeLeituraCpu = velocidadeDeLeituraCpu;
    }

    public double getUsoCpu() {
        return usoCpu;
    }

    public void setUsoCpu(double usoCpu) {
        this.usoCpu = usoCpu;
    }

    public int getUsoMemoria() {
        return usoMemoria;
    }

    public void setUsoMemoria(int usoMemoria) {
        this.usoMemoria = usoMemoria;
    }

    public int getUsoDisco() {
        return usoDisco;
    }

    public void setUsoDisco(int usoDisco) {
        this.usoDisco = usoDisco;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
