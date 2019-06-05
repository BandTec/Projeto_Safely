package Model;

public class Caixa {
    private int idCaixa;
    private float entrada;
    private String dataHora;
    private int idEstabelecimento;

    public Caixa() {
    }

    public Caixa(int idCaixa, float entrada, String dataHora, int idEstabelecimento) {
        this.idCaixa = idCaixa;
        this.entrada = entrada;
        this.dataHora = dataHora;
        this.idEstabelecimento = idEstabelecimento;
    }

    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

  

    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public float getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
