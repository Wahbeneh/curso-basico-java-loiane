package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao33 {
    public static void main(String[] args) {
        Random rd = new Random(123);
        int[] a = new int[10];
        boolean e_primo = true;

        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(11);
        }

        for (int i = 0; i < a.length; i++) {
            e_primo = true;
            if (a[i] == 0 || a[i] == 1) {
                System.out.println(a[i] + " não é primo");
            } else {
                for (int j = 2; j <= Math.sqrt(a[i]); j++) {
                    if (a[i] % j == 0) {
                        e_primo = false;
                        break;
                    }
                }

                if (e_primo) {
                    System.out.println(a[i] + " é primo");
                } else {
                    System.out.println(a[i] + " não é primo");
                }


            }
        }


    }
}
