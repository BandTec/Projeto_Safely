package Model;

public class TempoDeAtividade {
    private int idTempoDeAtividade;
    private int idMaquina;
    private String data;
    private String hora;

    public TempoDeAtividade() {
    }

    public TempoDeAtividade(int idTempoDeAtividade, int idMaquina, String data, String hora) {
        this.idTempoDeAtividade = idTempoDeAtividade;
        this.idMaquina = idMaquina;
        this.data = data;
        this.hora = hora;
    }

    public int getIdTempoDeAtividade() {
        return idTempoDeAtividade;
    }

    public void setIdTempoDeAtividade(int idTempoDeAtividade) {
        this.idTempoDeAtividade = idTempoDeAtividade;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
