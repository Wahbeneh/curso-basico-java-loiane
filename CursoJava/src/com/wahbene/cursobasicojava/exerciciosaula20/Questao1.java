package com.wahbene.cursobasicojava.exerciciosaula20;

import java.util.Random;


public class Questao1 {
    public static void main(String[] args) {
        Random rd = new Random(123);
        int maior = 0;
        int[][] numeros = new int[4][4];

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = rd.nextInt(50);
                if (numeros[i][j] > maior) {
                    maior = numeros[i][j];
                }
                System.out.println(numeros[i][j]);
            }
            System.out.println();
        }

        System.out.println("Maior número: " + maior);
    }
}
