package Model;

public class Processador {
    private int idProcessador;
    private String nome;
    private String ultimaModificacao;

    public Processador() {
    }  
//isso eu mandei para a classe realizar Leitura mas antes fiz um ToStrig do que eu queria pegar 
    //no caso apenas o nome 
    
    public Processador(String nome) {
        this.nome = nome;
    }
    
    public Processador(int idProcessador, String nome, String ultimaModificacao) {
        this.idProcessador = idProcessador;
        this.nome = nome;
        this.ultimaModificacao = ultimaModificacao;
    }

    public int getIdProcessador() {
        return idProcessador;
    }

    public void setIdProcessador(int idProcessador) {
        this.idProcessador = idProcessador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(String ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }
//fiz o toString e ai manda pro realizar leitura mas fazemos o toString com aquilo que queremos visualizar 
    @Override
    public String toString() {
        return "Processador{ " + "nome=" + getNome() + '}';
    }
}
