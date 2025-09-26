/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author livia
 */
public class comida {
    private int nutricao;
    private double preco;
        
    public comida(int nutricao, double preco) {
        this.nutricao = nutricao;
        this.preco = preco;
    }

    public int getNutricao() {
        return nutricao;
    }

    public void setNutricao(int nutricao) {
        this.nutricao = nutricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
   
}
