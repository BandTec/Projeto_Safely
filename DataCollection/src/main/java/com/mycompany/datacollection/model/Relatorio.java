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
public class Relatorio {
    private int idRelatorio;
    private double perdaLucro; 
    private String describe;
    private String tipoIndisponibilidade;
    private String maquinaAfetada;

    public Relatorio() {
    }

    public Relatorio(int idRelatorio, double perdaLucro, String describe, String tipoIndisponibilidade, String maquinaAfetada) {
        this.idRelatorio = idRelatorio;
        this.perdaLucro = perdaLucro;
        this.describe = describe;
        this.tipoIndisponibilidade = tipoIndisponibilidade;
        this.maquinaAfetada = maquinaAfetada;
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public double getPerdaLucro() {
        return perdaLucro;
    }

    public String getDescribe() {
        return describe;
    }

    public String getTipoIndisponibilidade() {
        return tipoIndisponibilidade;
    }

    public String getMaquinaAfetada() {
        return maquinaAfetada;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public void setPerdaLucro(double perdaLucro) {
        this.perdaLucro = perdaLucro;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setTipoIndisponibilidade(String tipoIndisponibilidade) {
        this.tipoIndisponibilidade = tipoIndisponibilidade;
    }

    public void setMaquinaAfetada(String maquinaAfetada) {
        this.maquinaAfetada = maquinaAfetada;
    }
    
}
