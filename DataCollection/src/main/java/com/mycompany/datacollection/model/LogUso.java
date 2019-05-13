/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacollection.model;

/**
 *
 * @author Natalia Borges
 */
public class LogUso {
    private double tempoDeAtividade;
    private double cargaCPU;
    private double velocidadeDeLeitura;
    private double interruptores;
    private double tamanho;
    private double ocupado;
    private double disponivel;
    private double processos;
    private double interrupcoes;
    private int topicos;

    public double getCargaCPU() {
        return cargaCPU;
    }

    public double getDisponivel() {
        return disponivel;
    }

    public double getInterrupcoes() {
        return interrupcoes;
    }

    public double getInterruptores() {
        return interruptores;
    }

    public double getOcupado() {
        return ocupado;
    }

    public double getProcessos() {
        return processos;
    }

    public double getTamanho() {
        return tamanho;
    }

    public double getTempoDeAtividade() {
        return tempoDeAtividade;
    }

    public int getTopicos() {
        return topicos;
    }

    public double getVelocidadeDeLeitura() {
        return velocidadeDeLeitura;
    }

    public void setCargaCPU(double cargaCPU) {
        this.cargaCPU = cargaCPU;
    }

    public void setDisponivel(double disponivel) {
        this.disponivel = disponivel;
    }

    public void setInterrupcoes(double interrupcoes) {
        this.interrupcoes = interrupcoes;
    }

    public void setInterruptores(double interruptores) {
        this.interruptores = interruptores;
    }

    public void setOcupado(double ocupado) {
        this.ocupado = ocupado;
    }

    public void setProcessos(double processos) {
        this.processos = processos;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setTempoDeAtividade(double tempoDeAtividade) {
        this.tempoDeAtividade = tempoDeAtividade;
    }

    public void setTopicos(int topicos) {
        this.topicos = topicos;
    }

    public void setVelocidadeDeLeitura(double velocidadeDeLeitura) {
        this.velocidadeDeLeitura = velocidadeDeLeitura;
    }

    public void getInterrupcoes(long interrupts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}