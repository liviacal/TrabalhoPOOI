/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author livia
 */
public class status {
    private int fome;
    private int energia;
    private int higiene;
    private int moedas;
    public status(int fome, int energia, int higiene,int moedas) {
        this.fome = fome;
        this.energia = energia;
        this.higiene = higiene;
        this.moedas=moedas;
    }
    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }
    public int getMoedas() {
        return moedas;
    }
    
    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }
    
}
