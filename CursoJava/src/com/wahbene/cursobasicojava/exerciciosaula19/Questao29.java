package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao29 {
    public static void main(String[] args) {
        int[] a = new int[10], b = new int[10], c = new int[20];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] =  r.nextInt(11);
            b[i] =  r.nextInt(11);
        }

        System.out.print("Vetor a: ");
        for (int i = 0; i < c.length/2 ; i++) {
            c[i] = a[i];
            System.out.print(a[i] + " ");
        }

        System.out.print("\nVetor b: ");
        for (int i = c.length/2; i < c.length ; i++) {
            c[i] = b[ i - c.length/2];
            System.out.print(b[i - c.length/2] + " ");
        }

        /*System.out.print("\nVetor b: ");
        for (int i = 0, j = c.length/2 ; i < b.length; i++, j++) {
            c[j] = b[i];
            System.out.print(b[i] + " ");
        }*/

        System.out.print("\nVetor c: ");
        for (int vetorb : c) {
            System.out.print(vetorb + " ");
        }
    }
}
