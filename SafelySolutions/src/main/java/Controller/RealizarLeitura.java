package Controller;

import Model.Leitura;
import Model.Memoria;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import java.sql.SQLException;

public class RealizarLeitura {
    public static void main(String[] args) throws SQLException {

        //instanciando os objetos
        SystemInfo system = new SystemInfo();

        //sistema operacional
        OperatingSystem os = system.getOperatingSystem();
        //hardware - informações da máquina
        HardwareAbstractionLayer hardware = system.getHardware();
        ComputerSystem maquina = hardware.getComputerSystem();
        // informações do processador
        CentralProcessor cpu = hardware.getProcessor();
        // informações da memória
        GlobalMemory memoria = hardware.getMemory();
        Conexao.executeQuery("select * from usuario");
        System.out.println("aqui");

        Leitura leitura = new Leitura();
    }

}
