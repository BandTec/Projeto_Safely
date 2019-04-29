/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituradedados;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.Baseboard;
//import oshi.hardware.Baseboard;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.Firmware;
//import oshi.hardware.Firmware;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HWPartition;
//import oshi.hardware.HWPartition;
//import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;
import oshi.software.os.NetworkParams;
import oshi.software.os.OSProcess;
//import oshi.software.os.FileSystem;
//import oshi.software.os.NetworkParams;
import oshi.software.os.OperatingSystem;
//import oshi.software.os.OperatingSystemVersion;
import oshi.util.FormatUtil;

/**
 *
 * @author Aluno
 */
public class Coletor {
    public static void main(String[] args)  {
                
       
       //instanciando os objetos
       SystemInfo system = new SystemInfo();
    
       OperatingSystem os = system.getOperatingSystem();
       HardwareAbstractionLayer hardware = system.getHardware();
       ComputerSystem maquina = hardware.getComputerSystem();         
       CentralProcessor cpu = hardware.getProcessor();
       GlobalMemory memoria = hardware.getMemory();
   

        System.out.println("");
        
       //Informações do sistema operacional
       System.out.println("Sistema operacional: ");
       System.out.println(os);
       
       // Informações da maquina
   
       //so.getProcessCount();
       // Thread = so.getThreadCount();
       NetworkParams net = os.getNetworkParams();
       
        System.out.println("");
        System.out.println("Informações da máquina " + "\n");

        System.out.println("Network parameters:");
        System.out.format(" Host name: %s%n", net.getHostName());
        System.out.format(" Domain name: %s%n", net.getDomainName());
        System.out.format(" DNS servers: %s%n", Arrays.toString(net.getDnsServers()));
        System.out.format(" IPv4 Gateway: %s%n", net.getIpv4DefaultGateway());
        System.out.format(" IPv6 Gateway: %s%n", net.getIpv6DefaultGateway());
    
        System.out.println("");
        
        System.out.println("manufacturer: " + maquina.getManufacturer());
        System.out.println("model: " + maquina.getModel());
        System.out.println("serialnumber: " + maquina.getSerialNumber());
       
        System.out.println("");
        
        final Firmware firmware = maquina.getFirmware();
        System.out.println("firmware:");
        System.out.println("  manufacturer: " + firmware.getManufacturer());
        System.out.println("  name: " + firmware.getName());
        System.out.println("  description: " + firmware.getDescription());
        System.out.println("  version: " + firmware.getVersion());
        System.out.println("");
        final Baseboard baseboard = maquina.getBaseboard();
        System.out.println("baseboard:");
        System.out.println("  manufacturer: " + baseboard.getManufacturer());
        System.out.println("  model: " + baseboard.getModel());
        System.out.println("  version: " + baseboard.getVersion());
        System.out.println("  serialnumber: " + baseboard.getSerialNumber());
       
        //Informações da máquinas virtuais na rede
        
        System.out.println("");
        
        NetworkIF[] net2 = hardware.getNetworkIFs();
        printNetworkInterfaces(hardware.getNetworkIFs());
          
        
       //Informações da cpu 
        
       System.out.println(""); 
       System.out.println("CPU: " + "\n");
       System.out.println("ID: " + cpu.getProcessorID() +"\n"
                          +"Identificador: " + cpu.getIdentifier() +"\n"
                          + "Nome da CPU: " + cpu.getName() + "\n"
                          + "Modelo: " + cpu.getModel() + "\n"
                          +"Familia: " + cpu.getFamily() +"\n"
                          +"Fornecedor: " + cpu.getVendor()  +"\n"
                          +"Stepping: " + cpu.getStepping() + "\n"
                          +"Uptime: " + FormatUtil.formatElapsedSecs(cpu.getSystemUptime()) +"\n"
       );    
       
       //Dados do uso da CPU
       
       System.out.println("USO CPU ");

       // nucleo_logico = cpu.getLogicalProcessorCount();
       // nucleo_fisico = cpu.getPhysicalProcessorCount();
       // pacote_fisico = cpu.getPhysicalPackageCount();
       
       
  
        System.out.println("Processes: " + os.getProcessCount() +  ", Threads: " + os.getThreadCount() +"\n" 
                           + "ContextSwitches/Interrupções: " + cpu.getContextSwitches() + "/" + cpu.getInterrupts());
        cpu.getSystemCpuLoad();
        
        System.out.println("");
        //CARGA DA CPU
        
        System.out.format("CPU load: %.1f%% (counting ticks)%n", cpu.getSystemCpuLoadBetweenTicks() * 100);
        System.out.format("CPU load: %.1f%% (OS MXBean)%n", cpu.getSystemCpuLoad() * 100);
        double[] loadAverage = cpu.getSystemLoadAverage(3);
        System.out.println("CPU load averages:" + (loadAverage[0] < 0 ? " N/A" : String.format(" %.2f", loadAverage[0]))
                + (loadAverage[1] < 0 ? " N/A" : String.format(" %.2f", loadAverage[1]))
                + (loadAverage[2] < 0 ? " N/A" : String.format(" %.2f", loadAverage[2])));
        // per core CPU
        StringBuilder procCpu = new StringBuilder("CPU load per processor:");
        double[] load = cpu.getProcessorCpuLoadBetweenTicks();
        for (double avg : load) {
            procCpu.append(String.format(" %.1f%%", avg * 100));
        }
        System.out.println(procCpu.toString());
        
        System.out.println("");
        // USo DA CPU POR PROCESSOS
        printProcesses(os, hardware.getMemory());
        
        //Instanciando objetos para o alerta
        AlertaComponentes alertaCPU = new AlertaComponentes();
       
        alertaCPU.usoCPU(cpu.getSystemCpuLoadBetweenTicks(), cpu.getSystemCpuLoad());
        
        System.out.println("");
        
        // Uso da Memória
        
        System.out.println("Memória RAM e SWAP: ");

        long usoRAM = memoria.getTotal() - memoria.getAvailable(); // para usar no alerta, mesmo valor do RAM_usado
        //long pageSize = memoria.getPageSize();
        //long swapPagesIn = memoria.getSwapPagesIn();
        //long swapPagesOut = memoria.getSwapPagesOut();
        
        System.out.println("");
        System.out.println("RAM: " + FormatUtil.formatBytes(memoria.getTotal() - memoria.getAvailable()) + "/" + FormatUtil.formatBytes(memoria.getTotal()) + "\n"
                           +"Disponível: " + FormatUtil.formatBytes(memoria.getAvailable())
                           +"\n" + "\n"
                           +"SWAP: " + FormatUtil.formatBytes(memoria.getTotal()) + "/" + FormatUtil.formatBytes(memoria.getTotal()) + "\n"
                           +"Disponível: " + FormatUtil.formatBytes(memoria.getSwapTotal() - memoria.getSwapUsed()));

        //Instanciando objetos para alerta memoria RAM
        AlertaComponentes alertaRAM = new AlertaComponentes();
        alertaRAM.usoRAM(memoria.getTotal(),usoRAM);
        
        //Instanciando objetos para alerta memoria SWAP
        AlertaComponentes alertaSwap = new AlertaComponentes();
        alertaSwap.usoSwap(memoria.getSwapTotal(),memoria.getSwapUsed());
       
        System.out.println("");
        // Disco -- arrumar
        System.out.println("Disco: ");
        
        printDisks(hardware.getDiskStores());
      
      
    }
    // Interfaces virtuais
    public static void printNetworkInterfaces(NetworkIF[] networkIFs) {
     System.out.println("Network interfaces:");
        for (NetworkIF net2 : networkIFs) {
            System.out.format(" Name: %s (%s)%n", net2.getName(), net2.getDisplayName());
            System.out.format("   MAC Address: %s %n", net2.getMacaddr());
            System.out.format("   MTU: %s, Speed: %s %n", net2.getMTU(), FormatUtil.formatValue(net2.getSpeed(), "bps"));
            System.out.format("   IPv4: %s %n", Arrays.toString(net2.getIPv4addr()));
            System.out.format("   IPv6: %s %n", Arrays.toString(net2.getIPv6addr()));
            boolean hasData = net2.getBytesRecv() > 0 || net2.getBytesSent() > 0 || net2.getPacketsRecv() > 0
                    || net2.getPacketsSent() > 0;
        }
    }
    
    // Disco
    private static void printDisks(HWDiskStore[] diskStores) {
        System.out.println("Disks:");
        for (HWDiskStore disk : diskStores) {
            boolean readwrite = disk.getReads() > 0 || disk.getWrites() > 0;
            System.out.format(" %s: (model: %s - S/N: %s) size: %s, reads: %s (%s), writes: %s (%s), xfer: %s ms%n",
                    disk.getName(), disk.getModel(), disk.getSerial(),
                    disk.getSize() > 0 ? FormatUtil.formatBytesDecimal(disk.getSize()) : "?",
                    readwrite ? disk.getReads() : "?", readwrite ? FormatUtil.formatBytes(disk.getReadBytes()) : "?",
                    readwrite ? disk.getWrites() : "?", readwrite ? FormatUtil.formatBytes(disk.getWriteBytes()) : "?",
                    readwrite ? disk.getTransferTime() : "?");
            HWPartition[] partitions = disk.getPartitions();
            if (partitions == null) {
                // TODO Remove when all OS's implemented
                continue;
            }
            for (HWPartition part : partitions) {
                System.out.format(" |-- %s: %s (%s) Maj:Min=%d:%d, size: %s%s%n", part.getIdentification(),
                        part.getName(), part.getType(), part.getMajor(), part.getMinor(),
                        FormatUtil.formatBytesDecimal(part.getSize()),
                        part.getMountPoint().isEmpty() ? "" : " @ " + part.getMountPoint());
            }
            
        //Instanciando objeto para alerta DISCO
        System.out.println("");
        AlertaComponentes alertaDisco = new AlertaComponentes();
        alertaDisco.usoDisco(disk.getSize(), disk.getReads());
        }
    }
    
    //Não é necessário gravar no banco, é apenas para repesentar na página web 
    private static void printProcesses(OperatingSystem os, GlobalMemory memory) {
        // Ordenado pela CPU mais alta
        List<OSProcess> procs = Arrays.asList(os.getProcesses(5, OperatingSystem.ProcessSort.CPU));

        System.out.println("   PID  %CPU %MEM       VSZ       RSS Name");
        for (int i = 0; i < procs.size() && i < 5; i++) {
            OSProcess p = procs.get(i);
            System.out.format(" %5d %5.1f %4.1f %9s %9s %s%n", p.getProcessID(),
                    100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
                    100d * p.getResidentSetSize() / memory.getTotal(), FormatUtil.formatBytes(p.getVirtualSize()),
                    FormatUtil.formatBytes(p.getResidentSetSize()), p.getName());
        }
    }
}

