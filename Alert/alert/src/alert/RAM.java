package alert;

import java.util.*;
import javax.swing.JOptionPane;

public class RAM {

    float tamanhoRAM;
    float usadoRAM;
    float restoRAM;

    public void definirTamanhoRam() {
        this.tamanhoRAM = Float.parseFloat(JOptionPane.showInputDialog("pergunta ram1"));

    }

    public void definirQtndUsadoRam() {
        this.usadoRAM = Float.parseFloat(JOptionPane.showInputDialog("pergunta ram2"));

    }

    public void definirRestoRam() {
        this.restoRAM = Float.parseFloat(JOptionPane.showInputDialog("pergunta ram3"));

    }

    public void alert() {
        float metade = tamanhoRAM / 2;
        if (usadoRAM <= metade) {
            System.out.println("Ainda está tudo bem com a sua RAM !");
        } else {
            System.out.println("está utilizando d mais da sua RAM");
        }

    }
}
