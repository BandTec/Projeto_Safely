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
public class MaquinaVirtual extends MaquinaFisica {
    private int idMaquinaVirtual;
    private boolean estado;
    private String nome;
    private String descricao;
    private String consumo;
    private String alocacao;

    public MaquinaVirtual() {
    }

    public MaquinaVirtual(int idMaquinaVirtual, boolean estado, String nome, String descricao, String consumo, String alocacao) {
        this.idMaquinaVirtual = idMaquinaVirtual;
        this.estado = estado;
        this.nome = nome;
        this.descricao = descricao;
        this.consumo = consumo;
        this.alocacao = alocacao;
    }

    public boolean getEstado() {
        return estado;
    }
    
    public String getAlocacao() {
        return alocacao;
    }

    public String getConsumo() {
        return consumo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdMaquinaVirtual() {
        return idMaquinaVirtual;
    }

    public String getNome() {
        return nome;
    }
     

    public void setAlocacao(String alocacao) {
        this.alocacao = alocacao;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setIdMaquinaVirtual(int idMaquinaVirtual) {
        this.idMaquinaVirtual = idMaquinaVirtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
