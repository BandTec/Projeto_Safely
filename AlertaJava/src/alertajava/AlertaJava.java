/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertajava;

/**
 *
 * @author jogos
 */
public class AlertaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Instancia dos objetos: CPU, Disco e memória RAM
        Componentes cpu = new Componentes();
        Componentes ram = new Componentes();
        Componentes disco = new Componentes();
       
        /**valores pré definidos temporiariamente, os atributos total e ocupado
        serão preenchidos atráves da leitura de dados**/
       cpu.processos = 100;

        //Chamada dos métodos
        cpu.usoCPU();
        ram.usoRAM();
        disco.usoDisco();
        
    }
    
}
