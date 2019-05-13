package com.mycompany.datacollection.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ntborges
 */
public class ConexaoBanco {
    private static String PATH_SQL = "jdbc:sqlserver://safely.database.windows.net:1433;database=Safely;user=s_adm@safely;password=@Bestlab;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    
    public Connection getInstance() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                System.out.println("passou aqui");
                return DriverManager.getConnection(PATH_SQL);
            } // Handle any errors that may have occurred.
            catch (SQLException e) {
                System.out.print("ERRO SQL0001: ");
                return null;
            }
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            System.out.print("ERRO SQL0002: ");
            return null;
        }
    }
}


