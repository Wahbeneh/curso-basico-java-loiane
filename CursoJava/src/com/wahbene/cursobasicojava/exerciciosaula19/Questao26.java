package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao26 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10], b = new int[10], c = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(10);
            b[i] = random.nextInt(10);

            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] < b[i]) {
                c[i] = -1;
            } else {
                c[i] = 0;
            }

            System.out.println(c[i]);

        }
    }
}