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
public class LucroEstabelecimento {
    private int idLucro;
    private double mediaLucro;
    private double hora; 
    private String describe;

    public LucroEstabelecimento() {
    }

    public LucroEstabelecimento(int idLucro, double mediaLucro, double hora, String describe) {
        this.idLucro = idLucro;
        this.mediaLucro = mediaLucro;
        this.hora = hora;
        this.describe = describe;
    }

    public int getIdLucro() {
        return idLucro;
    }

    public double getMediaLucro() {
        return mediaLucro;
    }

    public double getHora() {
        return hora;
    }

    public String getDescribe() {
        return describe;
    }

    public void setIdLucro(int idLucro) {
        this.idLucro = idLucro;
    }

    public void setMediaLucro(double mediaLucro) {
        this.mediaLucro = mediaLucro;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    
}
