package Model;

public class Franquia {
    private int idFranquia;
    private int idEmpresa;
    private String nome;
    private String usuario;
    private String idMaquina;

    public Franquia() {
    }

    public Franquia(int idFranquia, int idEmpresa, String nome, String usuario, String idMaquina) {
        this.idFranquia = idFranquia;
        this.idEmpresa = idEmpresa;
        this.nome = nome;
        this.usuario = usuario;
        this.idMaquina = idMaquina;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdFranquia() {
        return idFranquia;
    }

    public void setIdFranquia(int idFranquia) {
        this.idFranquia = idFranquia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(String idMaquina) {
        this.idMaquina = idMaquina;
    }
}
