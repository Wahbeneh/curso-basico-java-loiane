package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao25 {
    public static void main(String[] args) {
        Random random = new Random(123);
        int[] a = new int[10], b = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(10);
            if (a[i] % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }

            System.out.println(b[i]);
        }


    }
}
