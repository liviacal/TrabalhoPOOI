/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author livia
 */
public class pou {
    private String nome;
    private status status;
    private int idade;

    public pou(String nome, status status, int idade) {
        this.nome = nome;
        this.status = status;
        this.idade = idade;
    }

    public  String getNome() {
        return nome;
    }

    public status getStatus() {
        return status;
    }

    public int getIdade() {
        return idade;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
