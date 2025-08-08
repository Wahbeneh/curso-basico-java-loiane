package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao12 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] a = new int[10];
        int soma = 0;

        for (int i = 0; i < a.length; i++) {
            int x = aleatorio.nextInt(10);
            a[i] = x;
            soma += a[i];
        }

        System.out.println("A soma dos números do vetor A é igual a " + soma);


    }
}
