package Controller;


public class Alerta {
    private int usoMaximo;
    private int usoAtual;

     Alerta() {
       
    }
     
    public Alerta(int usoAtual) {
        this.usoAtual = usoAtual;
        usoMaximo = (int) (this.usoAtual * 0.80);
    }
   
   
    public void ComponenteMemoria(){ 
        if(usoAtual >= usoMaximo){
            System.out.println("O espaço em memória está acabando!");
        }

    }
    public void ComponenteDisco(){ 
        if(usoAtual >= usoMaximo){
            System.out.println("O espaço em disco está acabando!");
        }
        
    }

}
