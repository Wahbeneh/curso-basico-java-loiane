package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao11 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] a = new int[10];
        int pares = 0;

        for (int i = 0; i < a.length; i++) {
            int x = aleatorio.nextInt(10);
            a[i] = x;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares += 1;
            }
        }

        System.out.println("No vetor A, possuem " + pares + " números pares");


    }
}
