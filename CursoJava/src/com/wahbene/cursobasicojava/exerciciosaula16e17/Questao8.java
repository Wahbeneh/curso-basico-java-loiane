package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int soma = 0, a = 0, media;

        for (int b = 1; b <= 5; b++) {
            System.out.print("Digite um número: ");
            a = ler.nextInt();
            soma += a;
        }
            media = soma/5;

        System.out.println("\nSOMA dos números: " + soma);
        System.out.println("MÉDIA dos números: " + media);
    }
}
