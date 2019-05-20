package Model;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String username;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nome, String username, String email, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
