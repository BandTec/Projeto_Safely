package Model;

public class Disco {
    private int idDisco;
    private  String nome;
    private String ultimaModificacao;
    private int tamanho;

    public Disco() {
    }

    public Disco(int idDisco, String nome, String ultimaModificacao, int tamanho) {
        this.idDisco = idDisco;
        this.nome = nome;
        this.ultimaModificacao = ultimaModificacao;
        this.tamanho = tamanho;
    }

    public int getIdDisco() {
        return idDisco;
    }

    public void setIdDisco(int idDisco) {
        this.idDisco = idDisco;
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

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
