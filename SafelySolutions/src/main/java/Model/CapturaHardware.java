/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.EnvioBanco;
import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public class CapturaHardware {
    private SystemInfo sy;
    private HardwareAbstractionLayer hardware;
    
    public int dadosMemoria() {
        //valor total da memoria, não existe tipo de memoria
        sy = new SystemInfo();
        
        hardware = sy.getHardware();
        
        GlobalMemory memory = hardware.getMemory();
        
        int ram = (int) (memory.getTotal() / 1000000);
        
        return ram;
    }
    
    public void retornaDisco(){
        EnvioBanco enviar = new EnvioBanco();
        
        sy = new SystemInfo();
        
        hardware = sy.getHardware();
        
        HWDiskStore[] disco = hardware.getDiskStores();
        
        String nome;
        long tamanho;
        
        if (disco != null){
            for(int i = 0;i < disco.length; i++){
                nome = disco[i].getName();
                tamanho = disco[i].getSize() / 1000000000;
                System.out.println( "Nome Disco :" + nome + " Tamanho " + tamanho + " MB");
                enviar.insereDisco(nome, tamanho);
            }
        }
        
        
    }
}
