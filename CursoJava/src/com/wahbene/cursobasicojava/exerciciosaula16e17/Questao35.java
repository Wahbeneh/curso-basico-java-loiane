package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao35 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.print("Até que número você deseja verificar se é primo?: ");
        num = ler.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isPrimo = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}
