package Controller;

import Model.Disco;
import Model.Leitura;
import Model.Memoria;
import Model.Processador;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.OperatingSystem;


public class RealizarLeitura {

    public static Leitura pegaLeitura(){
        Leitura leituraMaquina = new Leitura();

        //instanciando os objetos
        SystemInfo system = new SystemInfo();
        //sistema operacional
        OperatingSystem os = system.getOperatingSystem();
        //hardware - informações da máquina
        HardwareAbstractionLayer hardware = system.getHardware();
        ComputerSystem maquina = hardware.getComputerSystem();
        // Processador
        CentralProcessor cpu = hardware.getProcessor();
        // Memória
        GlobalMemory memoria = hardware.getMemory();
        // Disco
        HWDiskStore[] diskStores = hardware.getDiskStores();

        for (HWDiskStore disk : diskStores) {
            System.out.println(disk.getSize());
            leituraMaquina.setUsoDisco((int)disk.getWrites());
        }
     
        leituraMaquina.setQtdProcessos(os.getProcessCount());
        leituraMaquina.setQtdInterrupcoes((int)cpu.getInterrupts());
        leituraMaquina.setUsoCpu((int) (cpu.getSystemCpuLoad() * 100));
        leituraMaquina.setUsoMemoria((int) (memoria.getTotal() - memoria.getAvailable()));

        return leituraMaquina;
    }
    
    public static Memoria pegaMemoria(){
        Memoria leituraMemoria = new Memoria();
        SystemInfo system = new SystemInfo();
        HardwareAbstractionLayer hardware = system.getHardware();
        GlobalMemory memoria = hardware.getMemory();
        
        leituraMemoria.setTamanho((int)memoria.getAvailable());
        Alerta alertaMemoria = new Alerta((int)memoria.getAvailable());
        alertaMemoria.ComponenteMemoria();
        return leituraMemoria;
        
    }   
    
    public static Processador pegaCpu() {
        Processador leituraCpu = new Processador();
        SystemInfo system = new SystemInfo();
        HardwareAbstractionLayer hardware = system.getHardware();
        CentralProcessor cpu = hardware.getProcessor();
        leituraCpu.setNome(cpu.getName());
        return leituraCpu;
    }
    
    public static Disco pegaDisco(){
        Disco leituraDisco = new Disco();
        SystemInfo system = new SystemInfo();
        HardwareAbstractionLayer hardware = system.getHardware();
        HWDiskStore[] diskStores = hardware.getDiskStores();
        
        for (HWDiskStore disk : diskStores) {
            System.out.println(disk.getSize());
            leituraDisco.setNome(disk.getName());
            leituraDisco.setTamanho((int)disk.getSize());
        }
        
        return leituraDisco;
    }
    
         
}