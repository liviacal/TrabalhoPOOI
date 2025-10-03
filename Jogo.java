/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.jogo;

/* NOME: LiVIA SILVEIRA CALDEIRA E THAMILY SILVA NOGUEIRA
 * TURMA: CC3M
 * MATRÍCULA: 202526272 E 202422800
 */
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do seu Pou: ");
        String nomePou = scanner.nextLine();
        status statusInicial = new status(50, 50, 50, 50);
        pou Pou = new pou(nomePou, statusInicial, 1, 0);
        minigames mg = new minigames();
        acao acoes = new acao(); 
        int opcao;
        boolean gameOver = false;
        
        do {
            System.out.println("\nMENU PRINCIPAL:");
            System.out.println("1 - Jogar Minigames");
            System.out.println("2 - Alimentar seu Pou");
            System.out.println("3 - Deixar o pou descansar");
            System.out.println("4 - Dar banho no Pou");
            System.out.println("5 - Ver os status do seu Pou");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    acoes.jogar(Pou);
                    break;
                case 2:
                    System.out.println("\nO que você quer dar para o " + Pou.getNome() + " comer?");
                    System.out.println("1-Batata R$10,00 (+20 alimentado)");
                    System.out.println("2-Banana-R$2,00 (+10 alimentado)");
                    System.out.println("3-Frango-R$15 (+30 alimentado)");
                    System.out.print("Escolha uma opção: ");
                    int optComida = scanner.nextInt();
                    scanner.nextLine();
                    comida comidaEscolhida = new comida(0, 0); 
                    acao.alimentar(Pou, comidaEscolhida, optComida); 
                    break;
                case 3:
                    acoes.dormir(Pou.getStatus());
                    break;
                case 4:
                    acoes.tomarBanho(Pou.getStatus());
                    break;
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
                    System.out.println("Ops, opção inválida! Tente novamente.");
            }
            
            if (Pou.getStatus().getFome() <= 0) {
                System.out.println("\nGAME OVER! " + Pou.getNome() + " morreu de fome!");
                gameOver = true; 
            } else if (Pou.getStatus().getEnergia() <= 0) {
                System.out.println("\nGAME OVER! " + Pou.getNome() + " desmaiou de cansaço!");
                gameOver = true;
            } else if (Pou.getStatus().getHigiene() <= 0) {
                System.out.println("\nGAME OVER! " + Pou.getNome() + " está tão sujo que ficou doente!");
                gameOver = true;
            }

        } while (opcao != 0 && !gameOver);
        scanner.close();
    }
}