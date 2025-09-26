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

import java.util.Scanner;
import java.util.Random;

public class minigames {

    Scanner scanner = new Scanner(System.in); 
    Random random = new Random();

public void jogar(pou Pou) {
    int opcao;

    do {
        System.out.println("\nMINIGAME");
        System.out.println("1 - Acerte o Número");
        System.out.println("2 - Jogo do Milhão");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção: ");

        opcao = scanner.nextInt();

        switch(opcao) {
            case 1:
                if (Pou.getStatus().getEnergia() < 40) {
                    System.out.println("O/a " + Pou.getNome() + " tá cansado demais! Bora dormir?");
                } else {
                    adivinharNumero(Pou);
                    Pou.getStatus().setFome(Pou.getStatus().getFome() - 15);     
                    Pou.getStatus().setHigiene(Pou.getStatus().getHigiene() - 5); 
                    Pou.getStatus().setEnergia(Pou.getStatus().getEnergia() - 10);
                    System.out.println(Pou.getNome() + " gastou 10 de energia\n-20 fome atual\n-10 higiene");
                }
                break;

            case 2:
                if (Pou.getStatus().getEnergia() < 20) {
                    System.out.println("O/a " + Pou.getNome() + " tá cansado demais! Bora dormir?");
                } else {
                    jogoDoMilhao(Pou);
                    Pou.getStatus().setEnergia(Pou.getStatus().getEnergia() - 20);
                    Pou.getStatus().setFome(Pou.getStatus().getFome() - 10);
                    Pou.getStatus().setHigiene(Pou.getStatus().getHigiene() - 10);
                    System.out.println(Pou.getNome() + " gastou 20 de energia\n-10 fome atual\n-10 higiene");
                }
                break;

            case 0:
                System.out.println("Ok... Saindo do minigame :(");
                break;

            default:
                System.out.println("Opção inválida!");
        }

    } while (opcao != 0);
}

    public void adivinharNumero(pou Pou) {
        int numero = random.nextInt(10) + 1;
        int tentativas = 3;
        int tentativaAtual = 1;
        int chute;

        System.out.println("\nAdivinhe o Número!");
        System.out.println("Tente adivinhar o número de 1 a 10! Você tem " + tentativas + " tentativas.");

        do {
            System.out.print("Tentativa " + tentativaAtual + ": ");
            chute = scanner.nextInt();

            if (chute == numero) {
                System.out.println("Parabéns! Você acertou e ganhou +20 moedas");
                Pou.getStatus().setMoedas(Pou.getStatus().getMoedas() + 20);
                break;
            } else if (chute < numero) {
                System.out.println("Errou! Dica: o número é maior que " + chute);
            } else { 
                System.out.println("Errou! Dica: o número é menor que " + chute);
            }

            tentativaAtual++;
        } while (tentativaAtual <= tentativas);

        if (chute != numero) {
            System.out.println("Aw, que pena, você perdeu! O número era " + numero);
        }

        System.out.println("Agora você tem " + Pou.getStatus().getMoedas() + " moedas.");
    }

    public void jogoDoMilhao(pou Pou) {
        System.out.println("\nVai começaaaar, o Jogo do Milhão!");
        int premio = random.nextInt(50);
        Pou.getStatus().setMoedas(Pou.getStatus().getMoedas() + premio);

        System.out.println("Você ganhou " + premio + " moedas!");
        System.out.println("Agora você tem " + Pou.getStatus().getMoedas() + " moedas!");
    }
}
