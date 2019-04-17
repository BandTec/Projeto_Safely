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
public class Componentes {
    
    public double total, ocupado;
    public double disponivel;


    public void usoCPU(){
        //Estabelendo o valor máximo de uso
        double maximo = (80 * this.total) / 100;
        //convertendo o valor ocupado para porcetagem
        double porcentOcupado = (this.ocupado * 100) / total;
        //calculando o valor disponivel
        this.disponivel = this.total - this.ocupado;
        //convertendo o valor disponível para porcentagem
        double porcentDisponivel = (this.disponivel * 100) / this.total;
        
        //Condição para o alerta
        if (this.ocupado >= maximo) {
            System.out.println("Sua CPU atingiu " + porcentOcupado + "%/" + this.total);
            System.out.println("Disponível: " + porcentDisponivel + "%");
        } 
    }  
    
    public void usoRAM(){
        double maximo = (80 * this.total) / 100;
        double porcentOcupado = (this.ocupado * 100) / total;
        this.disponivel = this.total - this.ocupado;
        double porcentDisponivel = (this.disponivel * 100) / this.total;
        
        if (this.ocupado >= maximo) {
            System.out.println("Sua memória RAM atingiu " + porcentOcupado + "%/" + this.total);
            System.out.println("Disponível: " + porcentDisponivel + "%");
        } 
    } 
    
    public void usoDisco(){
        double maximo = (80 * this.total) / 100;
        double porcentocupado = (this.ocupado * 100) / total;
        this.disponivel = this.total - this.ocupado;
        double porcentDisponivel = (this.disponivel * 100) / this.total;
        
        if (this.ocupado >= maximo) {
            System.out.println("O seu HD atingiu " + porcentocupado + "%/" + this.total);
            System.out.println("Disponível: " + porcentDisponivel + "%");
        } 
    }  
}
