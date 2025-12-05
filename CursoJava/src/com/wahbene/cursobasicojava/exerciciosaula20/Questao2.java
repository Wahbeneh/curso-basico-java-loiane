package com.wahbene.cursobasicojava.exerciciosaula20;

import java.util.Random;

public class Questao2 {
    public static void main(String[] args) {

        int maiorlinha5 = -1, menorlinha5 = 11, maiorlinha7 = -1, menorlinha7 = 11;
        Random rd = new Random(123);
        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(11);

                if (i == 4 && j == 0) {
                    maiorlinha5 = matriz[i][j];
                    menorlinha5 = matriz[i][j];
                }

                if (i == 4) {

                    if (matriz[i][j] > maiorlinha5) {
                        maiorlinha5 = matriz[i][j];
                    }

                    if (matriz[i][j] < menorlinha5) {
                        menorlinha5 = matriz[i][j];
                    }
                }

                if ( i == 0 && j == 0) {
                    maiorlinha7 = matriz[i][j];
                }

                if (j == 6) {

                    if (matriz[i][j] > maiorlinha7) {
                        maiorlinha7 = matriz[i][j];
                    }

                    if (matriz[i][j] < menorlinha7) {
                        menorlinha7 = matriz[i][j];
                    }
                }
            }
        }

        System.out.println("Maior número da linha 5: " + maiorlinha5);
        System.out.println("Menor número da linha 5: " + menorlinha5);
        System.out.println("Maior número da coluna 7: " + maiorlinha7);
        System.out.print("Menor número da coluna 7: " + menorlinha7);
    }
}
