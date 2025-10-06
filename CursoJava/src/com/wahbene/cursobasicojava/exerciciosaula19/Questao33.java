package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao33 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[10];
        boolean e_primo = true;

        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(11);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j < a[i]; j++) {
                if ((a[i] % j == 0) && (a[i] != 2) && (j != a[i])) {
                    e_primo = false;
                    System.out.println(a[i] + " não é primo");
                    break;
                }

                if (e_primo){
                    System.out.println(a[i] + " é primo");
                }
            }
        }


    }
}
