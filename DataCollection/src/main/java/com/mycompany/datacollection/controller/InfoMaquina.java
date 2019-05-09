/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.controller;

import com.mycompany.datacollection.model.Componente;
import com.mycompany.datacollection.model.MaquinaFisica;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.NetworkParams;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author ntborges
 */
public class InfoMaquina {
    
    SystemInfo system = new SystemInfo();
    
    //sistema operacional
     OperatingSystem os = system.getOperatingSystem();
     NetworkParams net = os.getNetworkParams();
     
     //hardware - informações da máquina
     HardwareAbstractionLayer hardware = system.getHardware(); 
     ComputerSystem maquina = hardware.getComputerSystem(); 
     // informações do processador
       CentralProcessor cpu = hardware.getProcessor();
       // informações da memória 
       GlobalMemory memoria = hardware.getMemory();
    
    MaquinaFisica fisica = new MaquinaFisica();
    
    Componente compCPU = new Componente();
    
    public void InfoCompCPU(){
       compCPU.setNome(cpu.getName());    
    }
   
}
