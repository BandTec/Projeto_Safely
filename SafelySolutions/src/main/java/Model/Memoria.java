package Model;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;

public class Memoria {
    private int idMemoria;
    private long tamanho;
    private String ultimaModificacao;
    private int idMaquina;

    public Memoria() {
    }

    //construtor para inicilizar os dados com o oshi


    public Memoria(int idMemoria, long tamanho, String ultimaModificacao, int idMaquina) {
        this.idMemoria = idMemoria;
        this.tamanho = tamanho;
        this.ultimaModificacao = ultimaModificacao;
        this.idMaquina = idMaquina;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public int getIdMemoria() {
        return idMemoria;
    }

    public void setIdMemoria(int idMemoria) {
        this.idMemoria = idMemoria;
    }

    public long getTamanho() {
        return tamanho / 1024 / 1024;
    }

    public void setTamanho(long tamanho) {
        this.tamanho = tamanho;
    }

    public String getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(String ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }
}
