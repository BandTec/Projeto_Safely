package Model;

public class Estabelecimento {
    private int idEstabelecimento;
    private String CNPJ;
    private String nome;

    public Estabelecimento() {
    }

    public Estabelecimento(int idEstabelecimento, String CNPJ, String nome) {
        this.idEstabelecimento = idEstabelecimento;
        this.CNPJ = CNPJ;
        this.nome = nome;
    }

    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
