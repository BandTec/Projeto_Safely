package Model;

public class Leitura {
    private int idMaquina;
    private int idServico;
    private int utilizado;
    private int disponivel;
    private int processos;
    private int threads;
    private int interrupcoes;
    private int velocidadeDeLeitura;


    public Leitura() {
    }

    public Leitura(int idMaquina, int idServico, int utilizado, int disponivel, int processos, int threads, int interrupcoes, int velocidadeDeLeitura) {
        this.idMaquina = idMaquina;
        this.idServico = idServico;
        this.utilizado = utilizado;
        this.disponivel = disponivel;
        this.processos = processos;
        this.threads = threads;
        this.interrupcoes = interrupcoes;
        this.velocidadeDeLeitura = velocidadeDeLeitura;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public int getUtilizado() {
        return utilizado;
    }

    public void setUtilizado(int utilizado) {
        this.utilizado = utilizado;
    }

    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int disponivel) {
        this.disponivel = disponivel;
    }

    public int getProcessos() {
        return processos;
    }

    public void setProcessos(int processos) {
        this.processos = processos;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getInterrupcoes() {
        return interrupcoes;
    }

    public void setInterrupcoes(int interrupcoes) {
        this.interrupcoes = interrupcoes;
    }

    public int getVelocidadeDeLeitura() {
        return velocidadeDeLeitura;
    }

    public void setVelocidadeDeLeitura(int velocidadeDeLeitura) {
        this.velocidadeDeLeitura = velocidadeDeLeitura;
    }
}
