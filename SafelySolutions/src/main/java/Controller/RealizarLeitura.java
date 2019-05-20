package Controller;

import Model.Leitura;
import Model.Memoria;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import java.sql.SQLException;

public class RealizarLeitura {
    public static void main(String[] args) throws SQLException {

        SystemInfo system = new SystemInfo();

        //sistema operacional
        OperatingSystem os = system.getOperatingSystem();
        //hardware - informações da máquina
        HardwareAbstractionLayer hardware = system.getHardware();
        // informações do processador
        CentralProcessor cpu = hardware.getProcessor();
        //memoria
        GlobalMemory memory = hardware.getMemory();

        Conexao.executeQuery("select * from usuario");
        System.out.println("aqui");

        Leitura leitura = new Leitura();
    }

}
