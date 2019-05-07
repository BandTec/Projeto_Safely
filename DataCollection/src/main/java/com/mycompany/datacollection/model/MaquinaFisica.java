/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.model;

import java.util.Arrays;
import oshi.SystemInfo;
import oshi.hardware.ComputerSystem;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.NetworkParams;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author ntborges
 */
public class MaquinaFisica {
    
       //instanciando os objetos
     SystemInfo system = new SystemInfo();
     
     //sistema operacional
     OperatingSystem os = system.getOperatingSystem();
     NetworkParams net = os.getNetworkParams();
     
     //hardware - informações da máquina
     HardwareAbstractionLayer hardware = system.getHardware(); 
     ComputerSystem maquina = hardware.getComputerSystem();  
    
     private String SistemaOperacional, hostName, domain, dnsServers, IPv4, IPv6;
     private String manufacturer, model, serialNumber; 
     private int idMaquinaFisica;

     public MaquinaFisica(){
   
     }
     
     public int getIdMaquinaFisica(){
         return idMaquinaFisica;
     }
     
     public void setIdMaquinaFisica(int id){
         this.idMaquinaFisica = id;
     }
     
     public String setSitemaOperacional(){
         return SistemaOperacional;
     }
     
     public String getSitemaOperacional(){
         return SistemaOperacional;
     }
     
      public String setHostName(){
         return hostName;
     }
     
     public String getHostName(){
         return hostName;
     }
     
      public String setDomain(){
         return domain;
     }
     
     public String getDomain(){
         return domain;
     }
     
     public String setIPv4(){
         return IPv4;
     }
     
     public String getIPv4(){
         return IPv4;
     }
     
     public String setIPv6(){
         return IPv6;
     }
     
     public String getIPv6(){
         return IPv6;
     }
    
     public String setManufacturer(){
         return manufacturer;
     }
     
     public String getManufacturer(){
         return manufacturer;
     }
     
     public String setModel(){
         return model;
     }
     
     public String getModel(){
         return model;
     }
     
      public String setSerialNumber(){
         return serialNumber;
     }
     
     public String getSerialNumber(){
         return serialNumber;
     }    
    
}
