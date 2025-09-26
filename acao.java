/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * NOME: LÍVIA E THAMILY SILVA NOGUEIRA
 * TURMA: CC3M
 * MATRÍCULA: E 202422800
 */
public class acao {
    public static void alimentar(pou pou , comida comida,status moeda,status fome,int opt){
        double precoDaComida = comida.getPreco();
        int moedasDoJogador = pou.getStatus().getMoedas();
        System.out.println("Digite o numero do item que voce deseja comprar:\n1-Batata R$10,00\n2-Banana-R$2,00\n3-Frango");
        switch(opt){
            case 1:
            System.out.println("Opcao");
        //int fomexp=status.getStatus();
        if(precoDaComida > moedasDoJogador){
            
            System.out.println("Voce nao tem moedas suficiente, jogue jogos para ganhar moedas");
        }else{
            precoDaComida-=moedasDoJogador;
         
            System.out.println("YUMMM... que delicia!");
        }
        }//switch
    //System.out.println(pou.getNome()+"Alimentando"+"....\nYUMM "+pou.getNome()+"amou a comida");
    
    }//funcao alimentar
    
    public void dormir(){
    
    }
    
    public void jogar(){
    
    }
    
    public void tomarBanho(){
    
    }
}

