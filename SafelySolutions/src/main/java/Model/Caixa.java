package Model;

public class Caixa {
    private int idCaixa;
    private float entrada;
    private String hora;
    private String data;

    public Caixa() {
    }

    // Construtor completo
    public Caixa(int idCaixa, float entrada, String hora, String data) {
        this.idCaixa = idCaixa;
        this.entrada = entrada;
        this.hora = hora;
        this.data = data;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
