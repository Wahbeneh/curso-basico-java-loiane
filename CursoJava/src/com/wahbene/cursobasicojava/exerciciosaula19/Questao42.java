package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao42 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();
        int receber = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(6);
        }

        for (int i = 0; i < a.length - 2; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
