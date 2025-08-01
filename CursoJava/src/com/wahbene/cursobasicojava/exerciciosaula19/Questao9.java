package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao9 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] a = new int[10];
        int[] b = new int[10];
        double[] c = new double[10];

        for( int i = 0; i < 10; i++ ) {
            a[i] = aleatorio.nextInt(10);
            b[i] = aleatorio.nextInt(10);
            c[i] = (double) a[i] / b[i];
        }

        System.out.println("Valor de C ");
        for ( double x : c) {
            System.out.println(x);
        }
    }
}
