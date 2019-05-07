/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.controller;

/**
 *
 * @author Natalia Tayoane
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class ConexaoBanco {
    
    // URL do banco de dados                             
    static final String DATABASE_URL = "jdbc:sqlserver://189.86.41.19/database=Safely";
   
    public static void main(String[] args){
        Connection conexao = null; // gerencia a conexao
        Statement comando = null; // comando de consulta
        ResultSet resultado = null; // gerencia os resultados
        
        // conecta-se ao banco de dados e realiza consultas
      try 
      {
         // estabelece conexao ao banco de dados
    	 // parametros são: URL, nome do usuario e senha  
         conexao = DriverManager.getConnection( 
			 DATABASE_URL, "s_adm@safely", "@Bestlab" );

         // cria Statement para consultar o banco de dados
         comando = conexao.createStatement();
         
         // consulta ao banco de dados
         // resultado da consulta é atribuido a resultSet
         resultado = comando.executeQuery(            
            "SELECT * FROM USUARIO" );
         
         // processa resultados da consulta
         // obtem o número e o nome das colunas da tabela
         ResultSetMetaData metaData = resultado.getMetaData();
         int numeroDeColunas = metaData.getColumnCount();     
         System.out.println( "Resultado da consulta:\n" );
         
         /* exibe o nome das colunas da tabela */
         for ( int i = 1; i <= numeroDeColunas; i++ )
            System.out.printf( "%-8s\t", metaData.getColumnName( i ) );
         System.out.println();
         
         while ( resultado.next() ) 
         {
            for ( int i = 1; i <= numeroDeColunas; i++ )
               System.out.printf( "%-8s\t", resultado.getObject( i ) );
            System.out.println();
         } // fim do while
      }  // fim do try

      catch ( SQLException sqlException )                                
      {                                                                  
         sqlException.printStackTrace();
      } // fim do catch                                                     
      finally // assegura que resultado, comando e conexao sejam fechados
      {                                                             
         try                                                        
         {                                                          
            if (resultado != null) {
                resultado.close();
            }
            if (comando != null) {                                              
                comando.close();
            }
            if (conexao != null) {
                conexao.close();
            }                                     
         } // fim do try                                               
         catch ( Exception exception )                              
         {                                                          
            exception.printStackTrace();                            
         } // fim do catch                                             
      } // fim do finally                                              
   } // fim do main
} // fim da classe AcessaBanco

    

