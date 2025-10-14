package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao42 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();
        int receber = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(6);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != a.length) {
            if(a[i] > a[i+1]) {
                receber = a[i];
                a[i] = a[i+1];
                a[i+1] = receber;
            }
            }
        }

    }
}
