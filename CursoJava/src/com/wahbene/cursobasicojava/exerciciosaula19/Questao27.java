package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao27 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        char[] b = new char[10];


        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(21);
            if (a[i] < 7) {
                b[i] = 'a';
            } else if (a[i] == 7) {
                b[i] = 'b';
            } else if (a[i] > 7 && a[i] < 10) {
                b[i] = 'c';
            } else if (a[i] == 10) {
                b[i] = 'd';
            } else if (a[i] > 10) {
                b[i] = 'e';
            }

        }
    }
}
