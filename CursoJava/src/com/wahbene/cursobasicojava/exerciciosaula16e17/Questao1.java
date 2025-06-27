package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;

        do {
            System.out.println("Digite um número: ");
            i = ler.nextInt();

            if (i < 0 || i > 10) {
                System.out.println("Número inválido! Digite um número entre 0 e 10.");
            }

        } while (i < 0 || i > 10);
    }
}
