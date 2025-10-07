package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao35 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];


        for (int i = 0; i < a.length; i++){
            a[i] = random.nextInt(11);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("\nTodos os divisores de " + a[i] + "\n");
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    System.out.println("O número " + a[i] + " é divisível por " +  j);
                }
            }
        }
    }
}
