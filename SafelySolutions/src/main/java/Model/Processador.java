package Model;

public class Processador {
    private int idProcessador;
    private String nome;
    private double clock;
    private String ultimaModificacao;

    public Processador() {
    }

    public Processador(int idProcessador, String nome, double clock, String ultimaModificacao) {
        this.idProcessador = idProcessador;
        this.nome = nome;
        this.clock = clock;
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

    public double getClock() {
        return clock;
    }

    public void setClock(double clock) {
        this.clock = clock;
    }

    public String getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(String ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }
}
