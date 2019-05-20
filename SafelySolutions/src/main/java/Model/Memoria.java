package Model;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;

public class Memoria {
    private int idMemoria;
    private String tipo;
    private double tamanho;
    private String ultimaModificacao;

    public Memoria() {
    }

    public Memoria(int idMemoria, String tipo, double tamanho, String ultimaModificacao) {
        this.idMemoria = idMemoria;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.ultimaModificacao = ultimaModificacao;
    }

    public int getIdMemoria() {
        return idMemoria;
    }

    public void setIdMemoria(int idMemoria) {
        this.idMemoria = idMemoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(String ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }


}
