package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao28 {
    public static void main(String[] args) {
        int[] a = new int[10], b = new int[10];
        Random r = new Random();

        System.out.print("Vetor a: ");
        for (int i = 0; i < a.length; i++){
            a[i] = r.nextInt(11);
            System.out.print(a[i] + " ");
    }
        System.out.print("\nVetor b: ");
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--){
            b[j] = a[i];
        }

        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
