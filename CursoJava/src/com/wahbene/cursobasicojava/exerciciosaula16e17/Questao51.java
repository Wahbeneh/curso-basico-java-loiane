package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao51 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int termo, fracao = 1;
        double soma = 0;

        System.out.print("Digite o termo: ");
        termo = ler.nextInt();

        System.out.print("s = ");
        for (int i = 1; i <= termo; i++) {
            if (i == termo) {
                System.out.print(i + "/" + fracao );
            } else {
                System.out.print(i + "/" + fracao + " + ");
            }
            soma += (double) i/fracao;
            fracao += 2;

        }

        System.out.println("\nResultado da Soma: " + soma);
    }
}
