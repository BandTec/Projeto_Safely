/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.controller;

import com.mycompany.datacollection.model.LogUso;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author Natalia Tayoane
 */
public class LeituraDeDados {

    SystemInfo system = new SystemInfo();

    //sistema operacional
    OperatingSystem os = system.getOperatingSystem();
    //hardware - informações da máquina
    HardwareAbstractionLayer hardware = system.getHardware();
    // informações do processador
    CentralProcessor cpu = hardware.getProcessor();

    public LogUso LeituraDeDados() {
        LogUso logCpu = new LogUso();

        logCpu.setUse((float) cpu.getSystemCpuLoad());
        logCpu.setProcesses(os.getProcessCount());
        logCpu.setThreads(os.getThreadCount());
        logCpu.setInterrupts(cpu.getInterrupts());
        logCpu.setUptime(cpu.getSystemUptime());
        logCpu.setContextSwitches(cpu.getContextSwitches());

        logCpu.getProcesses();
        return logCpu;
    }

}
