/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituradedados;

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
       
       String nomeCPU = cpu.getName();
        
       System.out.println(nomeCPU );
       
       
    }
}
