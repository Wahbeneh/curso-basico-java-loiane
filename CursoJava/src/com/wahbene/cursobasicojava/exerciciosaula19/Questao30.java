package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao30 {
    public static void main(String[] args) {
        int[] a = new int[20], b = new int[20], c = new int[20];
        Random r = new Random();
        int contb = 0, contc = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(11);

            if (a[i] % 2 == 0) {
                b[contb] = a[i];
                contb++;
            } else  {
                c[contc] = a[i];
                contc++;
            }
        }

        System.out.print("Vetor b: ");
        for (int i = 0; i < contb; i++) {
            System.out.print(b[i] + " ");

        }

        System.out.print("\nVetor c: ");
        for (int i = 0; i < contc; i++) {
                System.out.print(c[i] + " ");

        }
    }
}
