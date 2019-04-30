/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituradedados;

import java.text.DecimalFormat;
import oshi.util.FormatUtil;

/**
 *
 * @author ntborges
 */
public class AlertaComponentes {
    
    public double maximoCPU;
    public long total, usado;
    
     public AlertaComponentes() {
        maximoCPU = 70;
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
        
        long MaxRAM = (long) (total * 0.7);
        
        if (usado >= MaxRAM) {
            System.out.println("Sua memória RAM atingiu o limite de 70% " + (FormatUtil.formatBytes(usado))+ "bytes" );
        } 
    }
    
    public void usoSwap(){ 
        
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(1);
        
        long MaxSwap = (long) (total * 0.7);
         
        if (usado >= MaxSwap) {
            System.out.println("Sua memória Swap atingiu o limite de 70% " + (FormatUtil.formatBytes(usado))+ "bytes" );
        } 
    }
    
    public void usoDisco(){
        
        long Maxdisk = (long) (total * 0.7);

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(1);
     
        if (usado >= Maxdisk) {
            System.out.println("Sua memória Swap atingiu o limite de 70%" + (FormatUtil.formatBytes(usado))+ "bytes" );
        } 
    }   
}
