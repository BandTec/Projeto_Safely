/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.model;

/**
 *
 * @author ntborges
 */
public class MaquinaFisica {
        
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

    public void setHostName(String hostName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
