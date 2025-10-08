package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao39 {
    public static void main(String[] args) {
        Random random = new Random(12);
        int contc = 0;
        int[] a = new int[10],
                b = new int[10],
                c = new int[10];


        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(11);
            b[i] = random.nextInt(11);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++){
                if (a[i] == b[j]) {
                    c[contc] = a[i];
                    contc++;
                    break;
                }

            }
        }

        for (int cc : c){
            System.out.println(cc);
        }
    }
}
