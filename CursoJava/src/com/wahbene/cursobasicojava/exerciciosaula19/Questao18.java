package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao18 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] idade = new int[10];
        int menor = 101, maior = 0;

        for (int i = 0; i < idade.length; i++) {
            idade[i] = rd.nextInt(101);

            if (idade[i] < menor) {
                menor = idade[i];
            }
            if (idade[i] > maior) {
                maior = idade[i];
            }

        }

        System.out.println("Maior idade: " + maior +
                         "\nMenor idade: " + menor);

    }
}
