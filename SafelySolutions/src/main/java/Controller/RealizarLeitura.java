package Controller;

import Model.CapturaHardware;
import Model.Leitura;
import Model.Maquina;
import Model.Memoria;
import Model.Processador;
import Model.Memoria;
import java.awt.SystemColor;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;

public class RealizarLeitura {

    public static void main(String[] args) throws SQLException {

<<<<<<< HEAD
// fazer a leitura dos metodos INSERT NA VDD TODOS ELES !!! ( os metodos estao na package MODEL ) fazer sobre todos eles no caso
=======
        //instanciando os objetos
>>>>>>> febae58fb5d7863092548c756c2b76feafe637e9
        SystemInfo system = new SystemInfo();
        
        EnvioBanco eb = new EnvioBanco();
        //getLogicalProcessorCount() = numero da maquina 
        //sistema operacional
        OperatingSystem os = system.getOperatingSystem();
        //hardware - informações da máquina
        HardwareAbstractionLayer hardware = system.getHardware();
        ComputerSystem maquina = hardware.getComputerSystem();
        // informações do processador
        CentralProcessor cpu = hardware.getProcessor();
<<<<<<< HEAD
        //memoria
        //GlobalMemory memory = hardware.getMemory();
        
       //Aqui estou capturando o tamanho da minha memoria Ram que instanciei da classe CapturaHardware
        CapturaHardware capturaMemoria = new CapturaHardware();
        eb.insereMemoria(capturaMemoria.dadosMemoria());
       
        
       // estou pegando o nome do processador que instanciei da classe CapturaHardware
        Processador p = new Processador(cpu.getName());
        System.out.println(p.toString());
        eb.insereDados(cpu.getName());
        
        
       //aqui estou capturando o nome do Disco e o Tamanho do Disco que instanciei da classe CapturaHardware
       CapturaHardware capturaDisco = new CapturaHardware();  
       capturaDisco.retornaDisco();
        
=======
        // informações da memória
        GlobalMemory memoria = hardware.getMemory();
        Conexao.executeQuery("select * from usuario");
        System.out.println("aqui");

        Leitura leitura = new Leitura()

                cpu
>>>>>>> febae58fb5d7863092548c756c2b76feafe637e9
    }
}
