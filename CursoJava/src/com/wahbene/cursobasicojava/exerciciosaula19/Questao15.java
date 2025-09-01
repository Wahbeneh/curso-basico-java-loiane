package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao15 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[10];
        int num_pares = 0, num_impares = 0;

        for (int i = 0; i < a.length; i++) {
            int x = rd.nextInt(11);
            a[i] = x;

            if (a[i] % 2 == 0) {
                num_pares += 1;
            } else {
                num_impares += 1;
            }
        }

        double percentual_par, percentual_impares;

        percentual_par = (double) (num_pares * 100) / a.length;
        percentual_impares = (double) (num_impares * 100) / a.length;


        System.out.print("Percentual de números pares: " + percentual_par + "\nPercentual de números ímpares: " + percentual_impares);
    }
}
