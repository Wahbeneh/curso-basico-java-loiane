package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao20e21 {
    public static void main(String[] args) {
        Random rd = new Random();
        double[] cotacoes = new double[20];
        double cotacao;

        cotacao = rd.nextDouble(11);

        for (int i = 0; i < cotacoes.length; i++) {
             cotacoes[i] = cotacao * (i + 1);
        }

        System.out.println("Resultado das cotações");
        for (double cotacoe : cotacoes) {
            System.out.printf("%.2f%n", cotacoe);
        }
    }
}
