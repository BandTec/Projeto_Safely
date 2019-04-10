package alert;

import java.util.*;
import javax.swing.JOptionPane;

public class Alert {

    public static void main(String[] args) {
        RAM();
        HD();
        CPU();
    }

    public static void RAM() {

        RAM ram = new RAM();
        ram.definirTamanhoRam();
        ram.definirQtndUsadoRam();
        ram.alert();
    }

    public static void HD() {

        HD hd = new HD();
        hd.definirTamanhoHD();
        hd.definirQtndUsadoHD();
        hd.alert();

    }
    
    public static void CPU() {

        CPU cpu = new CPU();
        cpu.definirTamanhoCPU();
        cpu.definirQtndUsadoCPU();
        cpu.alert();

    }
}
