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
public class Estabelecimento {
    private int idEstabelecimento;
    private String nome;
    private int qtdAlertas;

    public Estabelecimento() {
    }

    public Estabelecimento(int idEstabelecimento, String nome, int qtdAlertas) {
        this.idEstabelecimento = idEstabelecimento;
        this.nome = nome;
        this.qtdAlertas = qtdAlertas;
    }

    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAlertas() {
        return qtdAlertas;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAlertas(int qtdAlertas) {
        this.qtdAlertas = qtdAlertas;
    }
    
    
}
