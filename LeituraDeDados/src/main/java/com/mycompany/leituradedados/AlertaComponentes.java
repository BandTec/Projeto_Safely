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
 
    public void usoCPU(double processos){
        //Estabelendo o valor máximo de uso
        double maximo = (80 * processos) / 100;
        //processos = (100 * processos) / 100;
        
        //Condição para o alerta
        if (processos >= maximo) {
            System.out.println("Sua CPU atingiu está com muitos processos em fila e pode passar por uma instabilidade ou lentidão");
        } 
    }  
    
    public void usoRAM(long total, long usado){
        double maximo = (80 * total) / 100;     
        //total = (100 * total) / 100;
        
        if (usado >= maximo) {
            System.out.println("Sua memória RAM atingiu " + usado + "GB/" + total + "GB");
        } 
    } 
    
    public void usoSwap(long total, long usado){
        double maximo = (80 * total) / 100;   
         //total = (100 * total) / 100;
        
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
