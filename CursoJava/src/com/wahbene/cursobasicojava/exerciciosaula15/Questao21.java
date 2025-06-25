package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, n100, n50, n10, n5, n1;

        System.out.print("------- BANCO DO CANXO -------\n" +
                "Digite o valor que queira sacar: R$");
        num = ler.nextInt();

        if (num >= 10 && num <= 600) {

            n100 = num / 100;
            num = num % 100;
            n50 = num / 50;
            num = num % 50;
            n10 = num / 10;
            num = num % 10;
            n5 = num / 5;
            num = num % 5;
            n1 = num / 1;

            System.out.print("Sacando...\n" + n100 + " nota(s) de 100\n" + n50 + " nota(s) de 50\n" + n10 + " nota(s) de 10\n" + n5 + " nota(s) de 5\n" + n1 + " nota(s) de 1\n");
        } else {
            System.out.println("Valores somente entre R$10 e R$600");
        }

    }
}
