package Model;

public class Processador {
    private int idProcessador;
    private String nome;
    private String ultimaModificacao;
    private int idMaquina;

    public Processador() {
    }

    public Processador(int idProcessador, String nome, String ultimaModificacao, int idMaquina) {
        this.idProcessador = idProcessador;
        this.nome = nome;
        this.ultimaModificacao = ultimaModificacao;
        this.idMaquina = idMaquina;
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

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }
}
