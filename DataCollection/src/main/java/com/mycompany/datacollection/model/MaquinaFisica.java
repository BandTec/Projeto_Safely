/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.model;

/**
 *
 * @author Natalia Tayoane
 */
public class MaquinaFisica {
        
     private String SistemaOperacional;
     private String hostName;
     private String dominio;
     private String dnsServers;
     private String IPv4;
     private String IPv6;
     private String manufacturer;
     private String modelo;
     private String serialNumber; 
     private int idMaquinaFisica;

     public MaquinaFisica(){
   
     }

     public MaquinaFisica(String sistemaOperacional, String hostName, String dominio, String dnsServers, String IPv4, String IPv6, String manufacturer, String modelo, String serialNumber, int idMaquinaFisica) {
          SistemaOperacional = sistemaOperacional;
          this.hostName = hostName;
          this.dominio = dominio;
          this.dnsServers = dnsServers;
          this.IPv4 = IPv4;
          this.IPv6 = IPv6;
          this.manufacturer = manufacturer;
          this.modelo = modelo;
          this.serialNumber = serialNumber;
          this.idMaquinaFisica = idMaquinaFisica;
     }


     public String getSistemaOperacional() {
          return SistemaOperacional;
     }

     public String getHostName() {
          return hostName;
     }

     public String getDominio() {
          return dominio;
     }

     public String getDnsServers() {
          return dnsServers;
     }

     public String getIPv4() {
          return IPv4;
     }

     public String getIPv6() {
          return IPv6;
     }

     public String getManufacturer() {
          return manufacturer;
     }

     public String getModelo() {
          return modelo;
     }

     public String getSerialNumber() {
          return serialNumber;
     }

     public int getIdMaquinaFisica() {
          return idMaquinaFisica;
     }

     public void setSistemaOperacional(String sistemaOperacional) {
          SistemaOperacional = sistemaOperacional;
     }

     public void setHostName(String hostName) {
          this.hostName = hostName;
     }

     public void setDominio(String dominio) {
          this.dominio = dominio;
     }

     public void setDnsServers(String dnsServers) {
          this.dnsServers = dnsServers;
     }

     public void setIPv4(String IPv4) {
          this.IPv4 = IPv4;
     }

     public void setIPv6(String IPv6) {
          this.IPv6 = IPv6;
     }

     public void setManufacturer(String manufacturer) {
          this.manufacturer = manufacturer;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public void setSerialNumber(String serialNumber) {
          this.serialNumber = serialNumber;
     }

     public void setIdMaquinaFisica(int idMaquinaFisica) {
          this.idMaquinaFisica = idMaquinaFisica;
     }
}
