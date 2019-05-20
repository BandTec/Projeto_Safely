package Model;

public class Servico extends Maquina {
    private int idServico;
    private int idMaquina;
    private String nome;
    private String descricao;
    private boolean estado;

    public Servico(int idServico, int idMaquina, String nome, String descricao, boolean estado) {
        this.idServico = idServico;
        this.idMaquina = idMaquina;
        this.nome = nome;
        this.descricao = descricao;
        this.estado = estado;
    }

    public Servico(int idMaquina, String SO, String serialNumber, String versao, String modelo, String dominio, String hotsName, String IPv4, String IPv6, String descricao, String ultimaAtualizacao, String idProcessador, String idDisco, String idMemoria, int idServico, int idMaquina1, String nome, String descricao1, boolean estado) {
        super(idMaquina, SO, serialNumber, versao, modelo, dominio, hotsName, IPv4, IPv6, descricao, ultimaAtualizacao, idProcessador, idDisco, idMemoria);
        this.idServico = idServico;
        this.idMaquina = idMaquina1;
        this.nome = nome;
        this.descricao = descricao1;
        this.estado = estado;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    @Override
    public int getIdMaquina() {
        return idMaquina;
    }

    @Override
    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
