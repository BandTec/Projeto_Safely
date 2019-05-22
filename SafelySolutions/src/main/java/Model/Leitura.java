package Model;

public class Leitura {
    private int idMaquina;
    private int idServico;
    private long utilizado;
    private long disponivel;
    private long processos;
    private long threads;
    private long interrupcoes;
    private long velocidadeDeLeitura;


    public Leitura() {
    }

    //Construtor para inicializar os dados do oshi
    public Leitura(long utilizado, long disponivel, long processos, long threads, long interrupcoes, long velocidadeDeLeitura) {
        this.utilizado = utilizado;
        this.disponivel = disponivel;
        this.processos = processos;
        this.threads = threads;
        this.interrupcoes = interrupcoes;
        this.velocidadeDeLeitura = velocidadeDeLeitura;
    }

    //construtor completo

    public Leitura(int idMaquina, int idServico, long utilizado, long disponivel, long processos, long threads, long interrupcoes, long velocidadeDeLeitura) {
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

    public long getUtilizado() {
        return utilizado;
    }

    public void setUtilizado(long utilizado) {
        this.utilizado = utilizado;
    }

    public long getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(long disponivel) {
        this.disponivel = disponivel;
    }

    public long getProcessos() {
        return processos;
    }

    public void setProcessos(long processos) {
        this.processos = processos;
    }

    public long getThreads() {
        return threads;
    }

    public void setThreads(long threads) {
        this.threads = threads;
    }

    public long getInterrupcoes() {
        return interrupcoes;
    }

    public void setInterrupcoes(long interrupcoes) {
        this.interrupcoes = interrupcoes;
    }

    public long getVelocidadeDeLeitura() {
        return velocidadeDeLeitura;
    }

    public void setVelocidadeDeLeitura(long velocidadeDeLeitura) {
        this.velocidadeDeLeitura = velocidadeDeLeitura;
    }
}
