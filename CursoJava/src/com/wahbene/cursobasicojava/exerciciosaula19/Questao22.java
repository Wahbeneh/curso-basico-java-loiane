package com.wahbene.cursobasicojava.exerciciosaula19;

public class Questao22 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int quantidade_0 = 0, quantidade_1 = 0;
        double prct0, prct1;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.round(Math.random() * 1);

            if (a[i] == 0) {
            quantidade_0 += 1;
            } else {
            quantidade_1 += 1;
            }
        }

        prct0 = (double) quantidade_0 / a.length * 100;
        prct1 = (double) quantidade_1 / a.length * 100;

        System.out.println("Porcentagem de 0: " + prct0 + "%" +
                         "\nPorcentagem de 1: " + prct1 + "%");

    }
}
