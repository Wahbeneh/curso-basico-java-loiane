package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m, n, soma = 0, maior = 0, menor = 1000;

        System.out.print("Quantos números você quer digitar: ");
        m = ler.nextInt();

        for (int i = 1; i <= m; i++) {
            System.out.print("Digite um número: ");
            n = ler.nextInt();

            while (n < 0 || n > 1000) {
                System.out.print("Número inválido, tente novamente! \nDigite um número: ");
                n = ler.nextInt();
            }

            soma += n;
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }

            soma += n;
        }

        System.out.print("Maior número: " + maior + "\nMenor número: " + menor + "\nSoma: " + soma);
    }
}
