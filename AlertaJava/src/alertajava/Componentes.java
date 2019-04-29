/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertajava;

/**
 *
 * @author Natalia Tayoane
 */
public class Componentes {
    
    //Atributos para memória e disco
    public double total, ocupado, disponivel;

    //atributo para cpu
    public int processos; 


    public void usoCPU(){
        //Estabelendo o valor máximo de uso
        double maximo = (80 * this.processos) / 100;
        
        //Condição para o alerta
        if (this.processos >= maximo) {
            System.out.println("Sua CPU atingiu está com muitos processos em fila e pode passar por uma instabilidade ou lentidão");
        } 
    }  
    
    public void usoRAM(){
        double maximo = (80 * this.total) / 100;       
        
        if (this.ocupado >= maximo) {
            System.out.println("Sua memória RAM atingiu " + ocupado + "GB/" + this.total + "GB");
        } 
    } 
    
    public void usoSwap(){
        double maximo = (80 * this.total) / 100;       
        
        if (this.ocupado >= maximo) {
            System.out.println("Sua memória Swap atingiu " + ocupado + "GB/" + this.total + "GB");
        } 
    }
    
    public void usoDisco(){        
        double maximo = (80 * this.total) / 100;
       
        if (this.ocupado >= maximo) {
            System.out.println("O seu HD atingiu " + ocupado + "GB/" + this.total + "GB");
        } 
    }  
}
