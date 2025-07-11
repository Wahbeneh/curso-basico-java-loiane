package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao52 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int h = 1, n;
        double soma = 0;
        System.out.print("Digite o termo N: ");
        n = ler.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(i + " + ");
                soma += (double) h / i;
            } else if (i == n) {
                System.out.print(h + "/" + i);
                soma += (double) h / i;
            } else {
                System.out.print(h + "/" + i + " + ");
                soma += (double) h / i;
            }
        }

        System.out.println("\nResultado: " + soma);
    }
}
