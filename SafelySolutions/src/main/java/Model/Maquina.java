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
    private String ultimaAtualizacao;
    private int idTipo;
    private int idEstabelecimento;

    public Maquina() {
    }


    public Maquina(int idMaquina, String SO, String serialNumber, String versao, String modelo, String dominio, String hotsName, String IPv4, String IPv6, String ultimaAtualizacao, int idProcessador, int idDisco, int idMemoria, int idTipo, int idEstabelecimento) {
        this.idMaquina = idMaquina;
        this.SO = SO;
        this.serialNumber = serialNumber;
        this.versao = versao;
        this.modelo = modelo;
        this.dominio = dominio;
        this.hotsName = hotsName;
        this.IPv4 = IPv4;
        this.IPv6 = IPv6;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.idTipo = idTipo;
        this.idEstabelecimento = idEstabelecimento;
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

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

  
}
