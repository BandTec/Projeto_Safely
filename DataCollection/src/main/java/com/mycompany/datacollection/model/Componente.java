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
    private int idComponente;
    private int particao;
    private String nome;
    private String identificador;
    private String familia;
    private String idProcessador;
    private String fornecedor;
    private String stepping;
    private String modelo;
    private String descricao;

    public Componente() {
    }

    public Componente(int idComponente, int particao, String nome, String identificador, String familia, String idProcessador, String fornecedor, String stepping, String modelo, String descricao) {
        this.idComponente = idComponente;
        this.particao = particao;
        this.nome = nome;
        this.identificador = identificador;
        this.familia = familia;
        this.idProcessador = idProcessador;
        this.fornecedor = fornecedor;
        this.stepping = stepping;
        this.modelo = modelo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public String getFamilia() {
        return familia;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public String getIdProcessador() {
        return idProcessador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNome() {
        return nome;
    }

    public int getParticao() {
        return particao;
    }

    public String getStepping() {
        return stepping;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public void setIdProcessador(String idProcessador) {
        this.idProcessador = idProcessador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setParticao(int particao) {
        this.particao = particao;
    }

    public void setStepping(String stepping) {
        this.stepping = stepping;
    } 
}

