package com.wahbene.cursobasicojava.exerciciosaula19;

public class Questao5 {
    public static void main(String[] args) {
        int[] a = new  int[10];
        int[] b = new  int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = a[i] * i;
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
