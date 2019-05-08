/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.model;

/**
 *
 * @author Natalia Borges
 */
public class LogUso {
    
    private float uptime, load, speed, contextSwitches, size, use, availabre;
    private int threads;
    private long processes, interrupts;
    
    public float getUptime(){
        return uptime;
    }
    
    public void setUptime(float uptime){
        this.uptime = uptime;
    }
    
     public long getProcesses(){
        return processes;
    }
    
   public void setProcesses(int processCount) {
        processes = processCount;
    }
    
     public int getThreads(){
        return threads;
    }
    
     public void setThreads(int threadCount) {
       this.threads = threadCount;
    }
    
     public float getLoad(){
        return load ;
    }
    
    public void setLoad(float load ){
        this.load = load ;
    }
    
       public float getSpeed(){
        return speed ;
    }
    
    public void setSpeed(float speed ){
        this.speed = speed ;
    }
    
       public long getInterrupts(){
        return interrupts ;
    }
    
    public void setInterrupts(long interrupts ){
        this.interrupts = interrupts;
    }
    
       
    public float getContextSwitches(){
        return contextSwitches;
    }
    
    public void setContextSwitches(float contextSwitches ){
        this.contextSwitches = contextSwitches;
    }
    
    public float getSize(){
        return size ;
    }
    
    public void setSize(float size ){
        this.size = size ;
    }
    
      public float getUse(){
        return use ;
    }
    
    public void setUse(float use ){
        this.use = use ;
    }
    
    public float getAvailabre(){
        return availabre;
    }
    
     public void setAvailabre(float availabre){
        this.availabre =  availabre ;
    }

    

    
}
