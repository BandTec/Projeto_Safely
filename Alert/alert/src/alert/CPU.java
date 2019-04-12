package alert;

import java.util.*;
import javax.swing.JOptionPane;

public class CPU {

    float tamanhoCPU;
    float usadoCPU;
    float restoCPU;
    int porcentagemCPU;

    public void definirTamanhoCPU() {
        this.tamanhoCPU = Float.parseFloat(JOptionPane.showInputDialog("pergunta cpu1 "));

    }

    public void definirQtndUsadoCPU() {
        this.usadoCPU = Float.parseFloat(JOptionPane.showInputDialog("pergunta cpu2"));

    }

    public void definirRestoCPU() {
        this.restoCPU = Float.parseFloat(JOptionPane.showInputDialog("pergunta cpu"));

    }

    public void alert() {
        float metade = tamanhoCPU / 2;
        if (usadoCPU <= metade) {
            System.out.println("Ainda está tudo bem  com a sua CPU! ");
        } else {
            System.out.println("está utilizando d mais da sua CPU, talvez voce precise pensar em adiquirir outra");
        }
        porcentagemCPU = (int) (tamanhoCPU - usadoCPU);
        System.out.println("SOBROU...." + porcentagemCPU + " % DE MEMORIA RAM");
    }

}
