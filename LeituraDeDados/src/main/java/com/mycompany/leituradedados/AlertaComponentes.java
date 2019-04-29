/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituradedados;

/**
 *
 * @author ntborges
 */
public class AlertaComponentes {
 
    public void usoCPU(double cpuLoad1, double cpuLoad2){        
        
        
        //Condição para o alerta
        
        double cpu1 = cpuLoad1 * 100;
        double cpu2 = cpuLoad2 * 100;

        if (cpu1 >= cpu1 * 0.8 ) {
            System.out.println("Sua CPU atingiu o limite de 80%");
        }
        if(cpu2 >= cpu2 * 0.2) {
            System.out.println("Sua CPU atingiu o limite de 80%");
        }
    }  
    
    public void usoRAM(long total, long usado){
        double maximo = (8.0 * total);    
        //total = (100 * total) / 100;
        
        if (usado >= maximo) {
            System.out.println("Sua memória RAM atingiu " + usado + "GB/" + total + "GB");
        } 
    }
    
    public void usoSwap(long total, long usado){
        double maximo = (80 * total) / 100;   
         //total = (100 * total) / 100
        
        if (usado >= maximo) {
            double PorcentUsado = (usado * 100) / total;
            System.out.println("Sua memória Swap atingiu " + PorcentUsado + "%" + total + "GB");
        } 
    }
    
    public void usoDisco(long total, long usado){        
        double maximo = (80 * total) / 100;
        //total = (100 * total) / 100;
       
        if (usado >= maximo) {
            System.out.println("O seu HD atingiu " + usado + "GB/" + total + "GB");
        } 
    }  
   
}
