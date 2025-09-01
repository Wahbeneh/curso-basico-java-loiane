package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao16 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[10];
        int soma_menor15 = 0, igual_a15 = 0, maior_que15 = 0, cont = 0; double media = 0;

        for (int i = 0; i < a.length; i++){
            a[i] = rd.nextInt(31);

            if (a[i] < 15) {
                soma_menor15 += a[i];
            }

            if (a[i] == 15) {
                igual_a15 += 1;
            }

            if (a[i] > 15) {
                maior_que15 += a[i];
                cont += 1;
            }
        }

        if (cont != 0) {
            media = (double) maior_que15/cont;
        }
        System.out.print("Soma de elementos menores que 15: " + soma_menor15 + "\nA quantidade de elementos armazenados no vetor iguais a 15: " + igual_a15 + "\nMédia dos elementos armazenados no vetor superiores a 15: " + media);
    }
}
