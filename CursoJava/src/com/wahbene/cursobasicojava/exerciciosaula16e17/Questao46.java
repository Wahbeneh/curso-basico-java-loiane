package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao46 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         double  media = 0, salto = 0, maiorSalto = 0, menorSalto = 8.95 ;

        System.out.print("Digite o nome do atleta: ");
        String nome = ler.nextLine();

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite o " + i + " valor do salto: ");
            salto = ler.nextDouble();
            media += salto;

            if (salto > maiorSalto) {
                maiorSalto = salto;
            }
            if (salto < menorSalto) {
                menorSalto = salto;
            }

        }
        media = (media  - (maiorSalto + menorSalto)) / 3;

        System.out.print("Resultado do salto: \nNome do atleta: " + nome + "\nMelhor Salto: " + maiorSalto + "\nMenor Salto: " + menorSalto + "\nMedia dos Salto: " + media);
    }
}
