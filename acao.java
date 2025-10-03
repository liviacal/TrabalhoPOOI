/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/* NOME: LiVIA SILVEIRA CALDEIRA E THAMILY SILVA NOGUEIRA
 * TURMA: CC3M
 * MATRÍCULA: 202526272 E 202422800
 */
public class acao {
    
    public static void alimentar(pou pou , comida comida, int opt){
        int moedasDoJogador = pou.getStatus().getMoedas();
        int fomeAtual = pou.getStatus().getFome();
        
        double precoDaComida = 0;
        int nutricaoComida = 0;

        System.out.println("Digite o numero do item que voce deseja comprar:\n1-Batata R$10,00(+20 alimentado)\n2-Banana-R$2,00(+10 alimentado)\n3-Frango-R$15(+30 alimentado)");
        
        switch(opt){
            case 1:
                precoDaComida = 10;
                nutricaoComida = 25;
                break;
            case 2:
                precoDaComida = 2;
                nutricaoComida = 15; 
                break;
            case 3:
                precoDaComida = 15;
                nutricaoComida = 35;
                break;
            default:
                System.out.println("Opção de comida inválida! Tente novamente.");
                return; 
        }

      
        if (fomeAtual >= 100) {
            System.out.println(pou.getNome() + " não está com fome agora. (Fome: 100)");
            return;
        }
        
        if(precoDaComida <= moedasDoJogador){
            int novasMoedas = moedasDoJogador - (int)precoDaComida;
            pou.getStatus().setMoedas(novasMoedas);
            int novaFome = fomeAtual + nutricaoComida;
            if (novaFome > 100) {
                novaFome = 100; 
            }
            pou.getStatus().setFome(novaFome);
            
            
            System.out.println("-R$" + (int)precoDaComida);
            System.out.println("Moedas: " + pou.getStatus().getMoedas() + "\nYUMMM... que delícia!");
            System.out.println("Alimentado: " + pou.getStatus().getFome());

        } else {
            System.out.println("Moedas insuficiente! Você precisa de R$" + (int)precoDaComida + ".");
            
        }
    }
    
    public void dormir(status energia){
        int energiaAtual = energia.getEnergia(); 
        
        if(energiaAtual >= 100){
            System.out.println("Energia atual suficiente. " + energiaAtual + ".");
            return;
        }

        if(energiaAtual < 100){
            System.out.println("Dormindo...");
            System.out.println("     .--.      ");
            System.out.println("   ,'    `.  ");
            System.out.println("  /   u  u   \\ ");
            System.out.println(" |     .    |");
            System.out.println("  \\         /");
            System.out.println("   `.______,' ");
        
            System.out.println("Espere...");
            try {
                Thread.sleep(2000);
                energiaAtual += 20;
                if (energiaAtual > 100) {
                    energiaAtual = 100;
                }
            
                energia.setEnergia(energiaAtual); 
            } catch (InterruptedException e) {
                System.out.println("Sono interrompido");
            }
        }
        System.out.println("Energia Atual: "+energia.getEnergia());
    }
    
    public void jogar(pou pou){
        minigames Jogos = new minigames(); 
        System.out.println("Indo para a sala de jogos...");
        Jogos.jogar(pou); 
    }
    
    public void tomarBanho(status higiene){
        int higieneAtual = higiene.getHigiene();
        
        if(higieneAtual >= 100){
            System.out.println("Higiene atual suficiente. " + higieneAtual + ".");
            return;
        }
        
        if(higieneAtual < 100){
            try {
                System.out.println("Tomando Banho...: ");
                Thread.sleep(2000);
                higieneAtual += 20;
                if(higieneAtual > 100) {
                    higieneAtual = 100;
                }
          
                higiene.setHigiene(higieneAtual);
            } catch (InterruptedException e) {
                System.out.println("Banho interrompido");
            }
        }
        System.out.println("Higiene Atual: "+higiene.getHigiene());
    }

}
