package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao23 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[10];
        boolean epar = true;

        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(11);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                epar = false;
                System.out.println("Sistema parado devido o número não ser par\nParado no índice do vetor " + i);
                break;
            }
        }

        if (epar) {
            System.out.println("Todos os números são pares");
        }

    }


}
