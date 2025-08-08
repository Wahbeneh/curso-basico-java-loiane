package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao13 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] a = new int[10];
        int multiplo = 0;

        for (int i = 0; i < a.length ; i++){
            int x = aleatorio.nextInt(10);
            a[i] = x;
            if (a[i] % 5 == 0) {
                multiplo += 1;
            }
        }


    }
}
