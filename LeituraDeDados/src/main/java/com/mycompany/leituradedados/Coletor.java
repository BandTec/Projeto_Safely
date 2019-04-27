/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituradedados;

import java.text.DecimalFormat;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author Aluno
 */
public class Coletor {
    public static void main(String[] args)  {
        
       SystemInfo system = new SystemInfo();
        
       HardwareAbstractionLayer hardware = system.getHardware();
       
       CentralProcessor cpu = hardware.getProcessor();
 
       
       //Informações da cpu 
       
       String nomeCPU = cpu.getName();
       String modelo = cpu.getModel();
       String familia =  cpu.getFamily();
       String id = cpu.getProcessorID();
       String identificador = cpu.getIdentifier();
       String stepping = cpu.getStepping();
       String vendor = cpu.getVendor();
       double uptime = cpu.getSystemUptime();
        
       
       System.out.println("ID: " + id +"\n"
                          + "Nome da CPU: " + nomeCPU + "\n"
                          + "Modelo: " + modelo + "\n"
                          +"Familia: " + familia +"\n"
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
        
    }
}