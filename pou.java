/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * NOME: LiVIA SILVEIRA CALDEIRA E THAMILY SILVA NOGUEIRA
 * TURMA: CC3M
 * MATRÍCULA: 202526272 E 202422800
 */
public class pou {
    private String nome;
    private status status;
    private int idade;
    private int contadorDeAcoes;
    public pou(String nome, status status, int idade,int contadorDeAcoes) {
        this.nome = nome;
        this.status = status;
        this.idade = idade;
        this.contadorDeAcoes= contadorDeAcoes;
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
    
     public int getContadorDeAcoes() {
        return contadorDeAcoes;
    }
    
    public void setContadorDeAcoes(int contadorDeAcoes) {
        this.contadorDeAcoes = contadorDeAcoes;
    }

    public void incrementarContadorDeAcoes() {
        this.contadorDeAcoes++;
    }

}
