package Model;

public class Disco {
    private int idDisco;
    private  String nome;
    private String ultimaModificacao;
    private long tamanho;
    private int idMaquina;

    public Disco() {
    }

    public Disco(int idDisco, String nome, String ultimaModificacao, long tamanho, int idMaquina) {
        this.idDisco = idDisco;
        this.nome = nome;
        this.ultimaModificacao = ultimaModificacao;
        this.tamanho = tamanho;
        this.idMaquina = idMaquina;
    }

    public void setTamanho(long tamanho) {
        this.tamanho = tamanho;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
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

    public long getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
