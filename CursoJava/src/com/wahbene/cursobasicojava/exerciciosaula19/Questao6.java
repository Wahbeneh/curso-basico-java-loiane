package com.wahbene.cursobasicojava.exerciciosaula19;

public class Questao6 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = i;
            c[i] = a[i] + b[i];
        }

        System.out.println("Valor de A e B ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de A - " + a[i] + "\nValor de B - " + b[i]);
        }

        System.out.println("\nValor de C ");
        for (int y : c) {
            System.out.println("Valor de C: " + y);
        }
    }
}
