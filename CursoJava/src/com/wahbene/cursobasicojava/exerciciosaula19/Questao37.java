package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao37 {
    public static void main(String[] args) {

        long[] a = new long[15], b = new long[15];
        Random random = new Random(123);
        long fatorial;

        for (int i = 0; i < a.length; i++) {

            a[i] = random.nextLong(11);

        }
        for (int i = 0; i < a.length; i++) {

            System.out.print("Valor do Fatorial de " + a[i] + ":");
            fatorial = 1;

            if (a[i] == 0 || a[i] == 1) {

                System.out.println("\nO valor é igual a 1");
                b[i] = fatorial;

            } else {

                for (long j = a[i]; j > 1; j--) {
                    fatorial *= j;

                }

                System.out.println("\nO valor é igual a " + fatorial + "\n");
                b[i] = fatorial;

            }
        }
    }
}
