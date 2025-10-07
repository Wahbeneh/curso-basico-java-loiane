package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao34 {
    public static void main(String[] args) {
        int [] a = new int[10];
        Random rd = new Random(123);

        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(11);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("Vetor no índice " + i + ": " + a[i] + "\n");
            for (int j = 0; j <= a[i]; j++) {
                if (j % 2 == 0)
                        System.out.print(j + " ");
                }
            System.out.print("\n\n");
        }
    }
}
