/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.controller;

import java.text.DecimalFormat;
import oshi.util.FormatUtil;

/**
 *
 * @author Natalia Tayoane
 */
public class Alerta {
    private double maximoCPU;
    private double total;
    private double usado;
    
    public Alerta(){
    }
    

    public Alerta(double total, double usado) {
        this.maximoCPU = 70;
        this.total = total;
        this.usado = usado;
    }
    
    
    public void usoCPU(){  
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(1);

        //Condição para o alerta
        if (usado >= maximoCPU) {
            System.out.println("Sua CPU load atingiu o limite de 70% ! " + "Uso: " + (Math.round(usado)) + "%" );
        } 
    }  

   
    public void usoRAM(){ 
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(1);
        
        double MaxRAM = (total * 0.7);
        
        if (usado >= MaxRAM) {
            System.out.println("Sua memória RAM atingiu o limite de 70% " + (FormatUtil.formatBytes((long) usado))+ "bytes" );
        } 
    }
    
    public void usoSwap(){ 
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(1);
        
        double MaxSwap =  (total * 0.7);
         
        if (usado >= MaxSwap) {
            System.out.println("Sua memória Swap atingiu o limite de 70% " + (FormatUtil.formatBytes((long) usado))+ "bytes" );
        } 
    }
    
    public void usoDisco(){
        double Maxdisk = (total * 0.7);

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(1);
     
        if (usado >= Maxdisk) {
            System.out.println("Sua memória Swap atingiu o limite de 70%" + (FormatUtil.formatBytes((long) usado))+ "bytes" );
        } 
    }

    public double getMaximoCPU() {
        return maximoCPU;
    }

    public double getTotal() {
        return total;
    }

    public double getUsado() {
        return usado;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setUsado(double usado) {
        this.usado = usado;
    }   
}
