package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao25 {
    public static void main(String[] args) {
        Random random = new Random(123);
        int [] b = new int[3];

        for (int i = 0; i < 3; i++) {
            b[i] = random.nextInt();
        }
    }
}
