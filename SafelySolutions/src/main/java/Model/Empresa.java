package Model;

public class Empresa {
    private int idEmpresa;
    private String nome;
    private String CNPJ;

    public Empresa() {
    }

    public Empresa(int idEmpresa, String nome, String CNPJ) {
        this.idEmpresa = idEmpresa;
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
