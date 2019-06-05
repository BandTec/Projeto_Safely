package Model;

public class TempoDeAtividade {
    private int idTempoDeAtividade;
    private int idMaquina;
    private String dataInicio;
    private String dataFim;

    public TempoDeAtividade() {
    }

    public TempoDeAtividade(int idTempoDeAtividade, int idMaquina, String dataInicio, String dataFim) {
        this.idTempoDeAtividade = idTempoDeAtividade;
        this.idMaquina = idMaquina;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
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

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
