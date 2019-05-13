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
    private boolean estado;
    private String nome;
    private String descricao;
    private String consumo;
    private String alocacao;

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
