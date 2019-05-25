package Model;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;

public class Memoria {
    private Integer idMemoria;
    private String tipo;
    private long tamanho;
    private String ultimaModificacao;
    
    public void Memoria(){
    }
    
    public void Memoria(String tipo, long tamanho){
    this.tipo = tipo;
    this.tamanho = tamanho;
    }

    public String toString(String getTipo, long getTamanho) {
        return "Memoria{ " + "tipo=" + getTipo + ", tamanho=" + getTamanho + '}';
    }

    
    public Memoria(Integer idMemoria, String tipo, long tamanho, String ultimaModificacao) {
        this.idMemoria = idMemoria;
        this.tipo = tipo;
        this.tamanho =  tamanho;
        this.ultimaModificacao = ultimaModificacao;
    }

    public Integer getIdMemoria() {
        return idMemoria;
    }

    public void setIdMemoria(Integer idMemoria) {
        this.idMemoria = idMemoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getTamanho() {
        return tamanho;
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
