/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.model;

/**
 *
 * @author ntborges
 */
public class Componente {
    private int idComponente, particao;
    private String nome, identificador, familia, idProcessador, 
                   fornecedor, stepping, model, descricao;
    
    public int getIdComponente(){
        return idComponente;
    }
    
    public void setIdComponente(int id){
        this.idComponente = id;
    }
    
    public int getParticao(){
        return particao;
    }
    
    public void setParticao(int particao){
        this.particao = particao;
    }
    
        
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getIdentificador(){
        return identificador;
    }
    
     public void setIdentificador(String identificador ){
        this.identificador = identificador;
    }
    
     public String getfamilia(){
        return familia;
    }
    
     public void setFamilia(String familia ){
        this.familia = familia;
    }
     
    public String getIdProcessador(){
        return idProcessador;
    }
    
     public void setIdProcessador(String idProcessador ){
        this.idProcessador = idProcessador;
    }
     
     public String getFornecedor(){
        return fornecedor;
    }
    
     public void setFornecedor(String fornecedor ){
        this.fornecedor = fornecedor;
    }
     
     public String getStepping(){
        return stepping;
    }
    
     public void setStepping(String stepping ){
        this.stepping = stepping;
    }
     
     public String getModel(){
         return model;
     }
    
     public void setModel( String model){
         this.model = model;
     }
     
     public String getDescricao(){
         return descricao;
     }
     
      public void setDescricao(String descricao){
         this.descricao = descricao;
     }
}
