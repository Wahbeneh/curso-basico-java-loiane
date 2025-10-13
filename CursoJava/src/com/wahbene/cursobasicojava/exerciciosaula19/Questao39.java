package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao39 {
    public static void main(String[] args) {
        Random random = new Random(123);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        int cont = 0;
        boolean possui = false;


        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(6);
            b[i] = random.nextInt(6);

        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    if (cont == 0) {
                        c[cont] = a[i];
                        cont++;
                        break;
                    } else {
                        possui = false;
                        for (int k = 0; k < cont; k++) {
                            if (c[k] == a[i]) {
                                possui = true;
                            }
                        }

                        if (!possui) {
                            c[cont] = a[i];
                            cont++;
                        }
                       break;
                    }
                }
            }
        }

        for (int i = 0; i < cont; i++) {
            System.out.println(c[i]);
        }
    }
}
