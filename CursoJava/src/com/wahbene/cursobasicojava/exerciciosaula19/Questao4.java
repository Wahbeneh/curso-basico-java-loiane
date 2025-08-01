package com.wahbene.cursobasicojava.exerciciosaula19;

public class Questao4 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int[] b = new int[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = (int) Math.sqrt(a[i]);
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
