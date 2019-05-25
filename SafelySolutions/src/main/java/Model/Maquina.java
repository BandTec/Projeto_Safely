package Model;

public class Maquina {
    private int idMaquina;
    private String SO;
    private String serialNumber;
    private String versao;
    private String modelo;
    private String dominio;
    private String hotsName;
    private String IPv4;
    private String IPv6;
    private String descricao;
    private String ultimaAtualizacao;
    private int idProcessador;
    private int idDisco;
    private int idMemoria;

    public Maquina() {
    }


    //construtor completo - iniciar coma leitura do oshi, apenas o idMaquina não será utilizado durante a inserção no banco
    public Maquina(int idMaquina, String SO, String serialNumber, String versao, String modelo, String dominio, String hotsName, String IPv4, String IPv6, String descricao, String ultimaAtualizacao, String idProcessador, String idDisco, String idMemoria) {
        this.idMaquina = idMaquina;
        this.SO = SO;
        this.serialNumber = serialNumber;
        this.versao = versao;
        this.modelo = modelo;
        this.dominio = dominio;
        this.hotsName = hotsName;
        this.IPv4 = IPv4;
        this.IPv6 = IPv6;
        this.descricao = descricao;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.idProcessador = idProcessador();
        this.idDisco = idDisco;
        this.idMemoria = idMemoria;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getHotsName() {
        return hotsName;
    }

    public void setHotsName(String hotsName) {
        this.hotsName = hotsName;
    }

    public String getIPv4() {
        return IPv4;
    }

    public void setIPv4(String IPv4) {
        this.IPv4 = IPv4;
    }

    public String getIPv6() {
        return IPv6;
    }

    public void setIPv6(String IPv6) {
        this.IPv6 = IPv6;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public String getIdProcessador() {
        return idProcessador;
    }

    public void setIdProcessador(String idProcessador) {
        this.idProcessador = idProcessador;
    }

    public String getIdDisco() {
        return idDisco;
    }

    public void setIdDisco(String idDisco) {
        this.idDisco = idDisco;
    }

    public String getIdMemoria() {
        return idMemoria;
    }

    public void setIdMemoria(String idMemoria) {
        this.idMemoria = idMemoria;
    }
}
