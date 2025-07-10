package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao42 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, af1 = 0, af2 = 0, af3 = 0, af4 = 0;

        do {
            System.out.print("Digite um número: ");
            num = ler.nextInt();

            if (num >= 0 && num <= 25) {
                af1++;
            }
            if (num >= 26 && num <= 50) {
                af2++;
            }
            if (num >= 51 && num <= 75) {
                af3++;
            }
            if (num >= 76 && num <= 100) {
                af4++;
            }
        } while (num >= 0);

        System.out.println("Quantidade de números entre 0 e 25: " + af1);
        System.out.println("Quantidade de números entre 26 e 50: " + af2);
        System.out.println("Quantidade de números entre 51 e 75: " + af3);
        System.out.println("Quantidade de números entre 76 e 100: " + af4);
    }
}
