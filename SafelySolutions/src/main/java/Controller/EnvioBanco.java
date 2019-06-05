package Controller;

import Model.Disco;
import Model.Leitura;
import Model.Maquina;
import Model.Memoria;
import Model.Processador;
import java.sql.SQLException;
import oshi.util.FormatUtil;

public class EnvioBanco {

    CadastroMaquina cadastro = new CadastroMaquina();

    public static boolean salvarMaquina(Maquina maquina) throws SQLException {
        String envio = "insert into TB_MAQUINA ("
                + "sistema_operacional,"
                + "serial_number,"
                + "versao,"
                + "modelo,"
                + "dominio,"
                + "hostname,"
                + "IPv4,"
                + "IPv6,"
                + "fk_estabelecimento,"
                + "fk_tipo,"
                + "ultima_atualizacao"
                + ") values ("
                + "'" + maquina.getSO() + "',"
                + "'" + maquina.getSerialNumber() + "',"
                + "'" + maquina.getVersao() + "',"
                + "'" + maquina.getModelo() + "',"
                + "'" + maquina.getDominio() + "',"
                + "'" + maquina.getHotsName() + "',"
                + "'" + maquina.getIPv4() + "',"
                + "'" + maquina.getIPv6() + "',"
                + maquina.getIdEstabelecimento() + "," + maquina.getIdTipo() + ",getdate())";
        boolean m = Conexao.executeCommand(envio);
        return m;
    }

    public static boolean salvarLeitura(Leitura leitura) throws SQLException {

        boolean l = Conexao.executeCommand("insert into TB_LEITURA(qtd_processos,qtd_interrupcoes,uso_processador,uso_ram,uso_disco, data_hora, fk_maquina)"
                + "values (" + leitura.getQtdProcessos() + "," + leitura.getQtdInterrupcoes() + "," + leitura.getUsoCpu() + "," + leitura.getUsoMemoria() + ","
                + leitura.getUsoDisco()+ ",getdate()," + 1 +")");
        return l;
    }
    
    public static boolean salvarMemoria(Memoria memoria ) throws SQLException {
        boolean m = Conexao.executeCommand("insert into TB_MEMORIA_RAM(tamanho,ultima_modificacao,fk_Maquina)"
        + "values (" + memoria.getTamanho() + ",getdate()," + 1 + ")");
        return m;
    }
    
    public static boolean salvarCpu(Processador processador)throws SQLException {
        boolean p = Conexao.executeCommand("insert into TB_PROCESSADOR("
                + "nome,"
                + "ultima_modificacao,"
                + "fk_Maquina"
                + ")values ("
                + "'" + processador.getNome() + "',"
                + "getdate()," +
                + 1 + ")");
        return p;
    }
    
    public static boolean salvarDisco(Disco disco)throws SQLException{
        boolean d = Conexao.executeCommand("insert into TB_DISCO ("
                + "nome,"
                + "tamanho,"
                + "ultima_modificacao,"
                + "fk_Maquina"
                + ") values ("
                + "'" + disco.getNome() + "',"
                + disco.getTamanho() + ","
                + "getdate(),"
                + 1 + ")");
        return d;
    }
}
