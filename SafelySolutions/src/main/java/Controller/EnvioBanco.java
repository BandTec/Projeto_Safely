package Controller;

import Controller.Conexao;
import Model.CapturaHardware;
import Model.Processador;
import Model.Memoria;
import Model.Disco;
import Model.Maquina;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnvioBanco extends Conexao {
    
    //AQUI É ONDE ESTOU FAZENDO TODOS OS INSERTS DNO BANCO DE DADOS, TUDO QUE FOR COLOCAAR AQUI VAI FUNCIONAR, 
    //SEGUE O SCRIPT

    //INSERT PRO BANCO, POPULAR 
    private Conexao con = new Conexao();
    
    // aqui fazer a inserssao de dados no banco Processador está pronto !
    public void insereDados(String nome) {
        try {
            con.executeCommand("insert into processador (nome) values ('" + nome + "')");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void insereMemoria(int ram){
         try {
            con.executeCommand("insert into memoria (tamanho) values ('" + ram + "')");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void insereDisco(String nome, long tamanho){
        try {
            con.executeCommand("insert into disco (nome, tamanho) values ('" + nome + "', '"+ tamanho + "')");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
