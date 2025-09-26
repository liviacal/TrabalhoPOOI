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

public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu Pou: ");
        String nomePou = scanner.nextLine();

        status statusInicial = new status(50, 50, 50, 50);
        pou Pou = new pou(nomePou, statusInicial, 1);

        minigames mg = new minigames();

        int opcao;
        do {
            System.out.println("\nMENU PRINCIPAL:");
            System.out.println("1 - Jogar Minigames");
            //System.out.println("2 - Alimentar seu Pou");
            //System.out.println("3 - Deixar o pou descansar");
            //System.out.println("4 - Dar banho no Pou");
            System.out.println("5 - Ver os status do seu Pou");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    mg.jogar(Pou);
                    break;

                /*case 2, 3, 4: terminar depois que tiver tudo pronto pra adicionar*/

                case 5:
                    System.out.println("\nStatus do seu Pou:");
                    System.out.println("Nome: " + Pou.getNome());
                    System.out.println("Idade: " + Pou.getIdade());
                    System.out.println("Fome: " + Pou.getStatus().getFome());
                    System.out.println("Energia: " + Pou.getStatus().getEnergia());
                    System.out.println("Higiene: " + Pou.getStatus().getHigiene());
                    System.out.println("Moedas: " + Pou.getStatus().getMoedas());
                    break;

                case 0:
                    System.out.println("Fim de jogo.");
                    break;

                default:
                    System.out.println("Ops, ocorreu algum erro! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
