package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao17 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[10];
        int pessoas_mq35 = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(81);
            if (a[i] > 35) {
                pessoas_mq35 += 1;
            }
        }

        System.out.println("Existem nesse vetor " + pessoas_mq35 + " pessoas com mais de 35 anos de idade");
    }
}
