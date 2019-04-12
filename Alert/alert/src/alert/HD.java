package alert;

import javax.swing.JOptionPane;

public class HD {

    float tamanhoHD;
    float usadoHD;
    float restoHD;
    int porcentagemHD;

    public void definirTamanhoHD() {
        this.tamanhoHD = Float.parseFloat(JOptionPane.showInputDialog("pergunta hd1"));

    }

    public void definirQtndUsadoHD() {
        this.usadoHD = Float.parseFloat(JOptionPane.showInputDialog("pergunta hd2"));

    }

    public void definirRestoCPU() {
        this.restoHD = Float.parseFloat(JOptionPane.showInputDialog("pergunta hd3"));

    }

    public void alert() {
        float metade = tamanhoHD / 2;
        if (usadoHD <= metade) {
            System.out.println("Ainda está tudo bem com o seu HD!");
        } else {
            System.out.println("está utilizando d mais do seu HD, talvez voce precise pensar em adiquirir outra");
        }
        porcentagemHD = (int) (tamanhoHD - usadoHD);
        System.out.println("SOBROU...." + porcentagemHD + " % DE MEMORIA RAM");
    }
}
