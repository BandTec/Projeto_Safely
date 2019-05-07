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
public class MaquinaVirtual {
    private int idMaquinaVirtual;
    private String nome, descricao, consumo, alocacao;
    private boolean estado;
    
    public int getIdmaquinaVirtual(){
        return idMaquinaVirtual;
    }
    
    public void setIdmaquinaVirtual( int id){
        idMaquinaVirtual = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome( String id){
        this.nome = nome;
    }
    
    public String getConsumo(){
        return consumo;
    }
    
    public void setConsumo(String consumo){
        this.consumo = consumo;
    }
    
     public String getDescricao(){
         return descricao;
     }
     
     public void setDescricao(String descricao){
         this.descricao = descricao;
     }
    
     public String getAlocacao(){
         return alocacao;
     }
     
     public void setAlocacao(String alocacao){
         this.alocacao = alocacao;
     }
    
     public boolean getEstado(){
         return estado;
     }
     
     public void setEstado(boolean estado){
         this.estado = estado;
     }
}
