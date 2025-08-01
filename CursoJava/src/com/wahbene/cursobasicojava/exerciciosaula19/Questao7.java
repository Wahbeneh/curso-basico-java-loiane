package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao7 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = aleatorio.nextInt(10);
            b[i] = aleatorio.nextInt(10);
            c[i] = a[i] - b[i];
        }

        System.out.println("Valores de A");
        for( int y : c) {
            System.out.println(y);
        }

        System.out.println("Valores de B");
        for( int k : c) {
            System.out.println(k);
        }

        System.out.println("Valores de C");
        for( int z : c) {
            System.out.println(z);
        }
    }
}
