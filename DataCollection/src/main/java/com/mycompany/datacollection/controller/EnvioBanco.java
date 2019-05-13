/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.controller;
import com.mycompany.datacollection.model.Componente;
import com.mycompany.datacollection.model.LogUso;
import java.sql.Connection;

/**
 *
 * @author Natalia Tayoane 
 */


public class EnvioBanco {
    
   
    public static void main(String[] args){
        try {
            LeituraDeDados nat = new LeituraDeDados();
            System.out.println(nat.LeituraDeDados());
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }
    
}    
   

