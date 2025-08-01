package com.wahbene.cursobasicojava.exerciciosaula19;

public class Questao2 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int[] b = new int[8];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = a[i] * 2;
        }

        System.out.println("Valor de A");
        for (int y : a) {
            System.out.println(y);
        }

        System.out.println("\nValor de B");
        for (int x : b) {
            System.out.println(x);
        }
    }
}
