package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao40 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        Random random = new Random(123);
        int cont = 0;
        boolean possui1 = false, possui2 = false;

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(11);
            b[i] = random.nextInt(11);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    possui1 = true;
                    break;
                }
            }

            if (!possui1) {
                if (cont == 0) {
                    c[cont] = a[i];
                    cont++;
                    break;
                } else {
                    for (int k = 0; k < cont; k++) {
                        if (c[cont] == a[i]) {
                            possui2 = true;
                        }
                    }
                    if (!possui2) {
                        c[cont] = a[i];
                        cont++;
                    }

                }
            }

        }
    }
}

