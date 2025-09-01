package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao14 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[10];
        int soma_impares = 0, cont = 0;
        double media = 0;

        for (int i = 0; i < a.length; i++) {
            int x = rd.nextInt(11);
            a[i] = x;

            if(a[i] % 2 != 0) {
                soma_impares += a[i];
                cont += 1;
            }
        }

        if(cont > 0) {
            media = (double) soma_impares / cont;
        }

        System.out.print("A média dos números ímpares é de " + media);

    }
}
