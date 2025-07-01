package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numpar = 0, numimpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = ler.nextInt();

            if (num % 2 == 0) {
                numpar += 1;
            } else {
                numimpar += 1;
            }
        }

        System.out.print("Números Pares: " + numpar + "\n");
        System.out.println("Números Ímpares: " + numimpar + "\n");

    }
}
