package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao40 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,5,4};
        int[] b = new int[]{1,2,2,2};
        int[] c = new int[3];
        Random random = new Random(92426750);
        boolean encontradoemB = false, encontradoemC = false;
        int cont = 0;



        for (int i = 0; i < a.length; i++) {
            encontradoemB = false;
            encontradoemC = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    encontradoemB = true;
                    break;
                }
            }

            if (!encontradoemB) {
                for (int k = 0; k < cont; k++) {
                    if (a[i] == c[k]) {
                        encontradoemC = true;
                    }
                }

                if (!encontradoemC) {
                    c[cont] = a[i];
                    cont++;
                }
            }
        }

        for (int i = 0; i < cont; i++) {
            System.out.println(c[i]);
        }
    }
}
