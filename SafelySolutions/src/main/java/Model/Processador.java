package Model;

public class Processador {
    private int idProcessador;
    private String nome;
    private String ultimaModificacao;

    public Processador() {
    }

    //construtor para inicializar os dados com o oshi
    public Processador(String nome) {
        this.nome = nome;
    }

    //construtor completo
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
}
