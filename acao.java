/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author livia
 */
public class acao {
    public static void alimentar(pou pou , comida comida,status moeda,status fome,int opt){
        double precoDaComida = comida.getPreco();
        int moedasDoJogador = pou.getStatus().getMoedas();
        int fomeAtual = pou.getStatus().getFome();
        System.out.println("Digite o numero do item que voce deseja comprar:\n1-Batata R$10,00(+20 alimentado)\n2-Banana-R$2,00(+10 alimentado)\n3-Frango-R$15(+30 alimentado)");
        switch(opt){
            case 1:
            precoDaComida=10;
            if(fomeAtual!=100 && precoDaComida > moedasDoJogador){
            precoDaComida-=moedasDoJogador;
            fomeAtual+=20;
            System.out.println("-R$10\nMoedas: "+moedasDoJogador+" YUMMM... que delicia!");
            System.out.println("Alimentado: "+fomeAtual);
        }else{
          System.out.println("Moedas insuficiente!");
        }
            break;
            case 2:
        //int fomexp=status.getStatus();
            precoDaComida=2;
            if(fomeAtual!=100 && precoDaComida > moedasDoJogador){
            precoDaComida-=moedasDoJogador;
            fomeAtual+=2;
            System.out.println("-R$2\nMoedas: "+moedasDoJogador+" YUMMM... que delicia!");
            System.out.println("Alimentado: "+fomeAtual);
            
        }else{
          System.out.println("Moedas insuficiente!");
        }
            case 3:
            precoDaComida=2;
            if(fomeAtual!=100 && precoDaComida > moedasDoJogador){
            precoDaComida-=moedasDoJogador;
            fomeAtual+=30;
            System.out.println("-30\nMoedas: "+moedasDoJogador+" YUMMM... que delicia!");
            System.out.println("Alimentado: "+fomeAtual);
            }else{
            
            }
            break;
            default:
                System.out.println("Tente novamente!");
                break;
        }//switch
        if(fomeAtual<0){
           System.out.println("GAME OVER! "+pou.getNome()+"morreu de fome!");
        }if(fomeAtual>100){
            int idadeNova=pou.getIdade();
            idadeNova+=1;
            System.out.println("Parabens "+pou.getNome()+"agora tem "+ pou.getIdade());
        }
    //System.out.println(pou.getNome()+"Alimentando"+"....\nYUMM "+pou.getNome()+"amou a comida");
    
    }//funcao alimentar
    
    public void dormir(status energia){
    int energiaAtual=energia.getEnergia(); 
    if(energiaAtual>0 || energiaAtual<100){
        System.out.println("Dormindo...");
        System.out.println("      .--.      ");
        System.out.println("    ,'      `.  ");
        System.out.println("   /   u  u   \\ ");
        System.out.println("  |     .      |:");
        System.out.println("   \\          /::");
        System.out.println("    `.______,'::: ");
   
    System.out.println("Espere...");
     try {
        Thread.sleep(2000);
        energiaAtual+=20;
    } catch (InterruptedException e) {
        System.out.println("Sono interompido");
    }
    }if(energiaAtual>=100){
    System.out.println("Energia atual suficiente ");
    }
    System.out.println("Energia Atual: "+energiaAtual);
   
    }//funcao dormir
    
    public void jogar(pou pou){
    minigames Jogos = new minigames();
    System.out.println("Voltando do menu de jogos.");
    int fomeAtual = pou.getStatus().getFome();
    int higieneAtual = pou.getStatus().getHigiene();

    if (fomeAtual < 50) {
        System.out.println("\n" + pou.getNome() + " está com muita fome para jogar. Alimente-o primeiro!");
        return; 
    }

    if (higieneAtual < 50) {
        System.out.println("\n" + pou.getNome() + " está muito sujo para jogar. Dê um banho nele!");
        return; 
    }

 
    System.out.println("Indo para a sala de jogos...");
    Jogos.jogar(pou);

    }
    
    public void tomarBanho(status higiene){
    int higieneAtual=higiene.getHigiene();
    if(higieneAtual<100){
     try {
        System.out.println("Tomando Banho...: ");
        Thread.sleep(2000);
        higieneAtual+=20;
    } catch (InterruptedException e) {
        System.out.println("Banho interompido");
    }
    }if(higieneAtual>=100){
    System.out.println("Higiene atual suficiente ");
    }
    System.out.println("Higiene Atual: "+higieneAtual);
        
    }
    }
