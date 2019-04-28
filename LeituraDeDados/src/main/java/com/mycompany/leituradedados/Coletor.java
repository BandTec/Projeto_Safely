/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituradedados;

//import java.util.Arrays;
import oshi.SystemInfo;
import oshi.hardware.Baseboard;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.Firmware;
import oshi.hardware.GlobalMemory;
//import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.FileSystem;
//import oshi.software.os.NetworkParams;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystemVersion;

/**
 *
 * @author Aluno
 */
public class Coletor {
    public static void main(String[] args)  {
        
       SystemInfo system = new SystemInfo();
    
       HardwareAbstractionLayer hardware = system.getHardware();
       OperatingSystem so = system.getOperatingSystem();
   
       ComputerSystem maquina = hardware.getComputerSystem();         
       CentralProcessor cpu = hardware.getProcessor();
       GlobalMemory memoria = hardware.getMemory();
       // HWDiskStore[] disco = hardware.getDiskStores();
        
       // Informações do sistema operacional
       
       String SO_familia = so.getFamily();
       FileSystem fileSystem = so.getFileSystem();
       OperatingSystemVersion versao = so.getVersion();
       String SO_manufacturer = so.getManufacturer();
       int bitness =  so.getBitness();
       //so.getProcessCount();
       int PIB = so.getProcessId();
       //int Thread = so.getThreadCount();
       
       System.out.println("");
       
       System.out.println("Familia: " + SO_familia + "\n"
                          + "FileSystem:  " + fileSystem + "\n" //arrumar
                          + "Versão: " + versao + "\n"
                          + "ManuFacturer: " + SO_manufacturer + "\n"
                          + "Bitness: " + bitness + "\n"
                          + "PIB: " + PIB); 
       
        System.out.println("");
       
       //Informações da máquina
       
       String serialNumber = maquina.getSerialNumber();
       String modelo = maquina.getModel();
       Firmware firmware = maquina.getFirmware();
       String manufacturer = maquina.getManufacturer();
       Baseboard baseboard = maquina.getBaseboard();
       
        System.out.println("Serial Number: " + serialNumber  + "\n"
                            + "Modelo:" + modelo + "\n"
                            + "Firmware: " + firmware + "\n"  
                            + "ManuFacturer: " + manufacturer + "\n"
                            + "Baseboard: " + baseboard);
        
        System.out.println("");

       
       //Informações da cpu 
       
       String CPU_nome = cpu.getName();
       String CPU_modelo = cpu.getModel();
       String CPU_familia =  cpu.getFamily();
       String id = cpu.getProcessorID();
       String identificador = cpu.getIdentifier();
       String stepping = cpu.getStepping();
       String vendor = cpu.getVendor();
       double uptime = cpu.getSystemUptime();
        
       
       System.out.println("ID: " + id +"\n"
                          + "Nome da CPU: " + CPU_nome + "\n"
                          + "Modelo: " + CPU_modelo + "\n"
                          +"Familia: " + CPU_familia +"\n"
                          + "Identificador: " + identificador +"\n"
                          + "Fornecedor: " + vendor  +"\n"
                          +"Stepping: " + stepping + "\n"
                          +"Uptime: " + uptime +"\n"
       );    
       
       //Dados do uso da CPU
       
       long  interrupts = cpu.getInterrupts();
       double carga_CPU = cpu.getSystemCpuLoad();
       double processos_na_fila =  cpu.getSystemLoadAverage();  
       double velocidade_exe = cpu.getSystemCpuLoadBetweenTicks();
       double context = cpu.getContextSwitches();

       //int nucleo_logico = cpu.getLogicalProcessorCount();
       //int nucleo_fisico = cpu.getPhysicalProcessorCount();
       //int pacote_fisico = cpu.getPhysicalPackageCount();
  
        System.out.println("Interrupções: " + interrupts + "\n"
                           + "Carga da CPU: " + carga_CPU + "\n"
                           + "Processos na fila: " + processos_na_fila + "\n"
                           + "Velocidade de execução: " + velocidade_exe + "\n"
                           + "Context Switches: " + context);
     
      // Uso da Memória
        long swapTotal = memoria.getSwapTotal(); // swap == memoria virtual
        long swapUsado = memoria.getSwapUsed();
        long total = memoria.getTotal();
        long disponivel = memoria.getAvailable();
        //long pageSize = memoria.getPageSize();
        //long swapPagesIn = memoria.getSwapPagesIn();
        //long swapPagesOut = memoria.getSwapPagesOut();
                
        System.out.println("Total: " + total + "\n"
                            + "Disponível: " + disponivel + "\n"
                            + "Swap total: " + swapTotal + "\n"
                            + "Swap usado: " + swapUsado + "\n"
                            + "");
      // Disco
       
    }
}