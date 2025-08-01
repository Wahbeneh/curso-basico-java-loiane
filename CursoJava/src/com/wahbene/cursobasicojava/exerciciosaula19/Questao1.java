package com.wahbene.cursobasicojava.exerciciosaula19;

public class Questao1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = a[i];
        }


        System.out.print("Valor de A\n");
        for (int y : a) {
            System.out.println(y);
        }

        System.out.print("\nValor de B\n");
        for (int x : b) {
            System.out.println(x);
        }

    }
}
