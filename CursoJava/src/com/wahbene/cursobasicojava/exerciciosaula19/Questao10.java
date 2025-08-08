package com.wahbene.cursobasicojava.exerciciosaula19;

public class Questao10 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] % 2;
        }

        System.out.println("Valor de B");
        for (int x : b) {
            System.out.println(x);
        }
    }
}
