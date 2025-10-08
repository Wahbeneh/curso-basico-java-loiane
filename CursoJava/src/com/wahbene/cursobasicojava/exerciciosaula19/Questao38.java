package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao38 {
    public static void main(String[] args) {

        int[] a = new int[10], b = new int[10];
        Random rd = new Random(10);
        int soma;

        for (int i = 0; i < a.length; i++ ) {
            a[i] = rd.nextInt(11);
        }

        for (int i = 0; i < a.length; i++) {
            soma = 0;
            for (int j = i; j < a.length; j++) {
                soma += a[j];
            }
            b[i] = soma;
            System.out.println(b[i]);
        }
    }
}
