package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao31 {
    public static void main(String[] args) {
        int[] a = new int[20], b = new int[20];
        Random r = new Random();
        int contadorpar = 0;


        for (int i = 0; i <a.length ; i++) {
            a[i] = r.nextInt(11);
            if (a[i] % 2 == 0) {
                b[contadorpar] = a[i];
                contadorpar++;
            }
        }

        for (int i = 0; i < a.length ; i++) {
            if (a[i] % 2 != 0) {
                b[contadorpar] = a[i];
                contadorpar++;
            }
        }

        for (int i = 0; i < a.length ; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
