package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;

public class Questao19 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] aluno = new int[10];
        double[] notas1 = new double[10];
        double[] notas2 = new double[10];
        double[] result = new double[10];

        for (int i = 0; i < aluno.length; i++) {
            aluno[i] = i;
            notas1[i] = rd.nextDouble(11);
            notas2[i] = rd.nextDouble(11);
        }

        for (int i = 0; i < notas1.length; i++) {
            result[i] = (notas1[i] + notas2[i]) / 2;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print("Média do aluno " + (aluno[i] + 1) + ": " + String.format("%.2f",result[i]) + "\nSituação do aluno " + (aluno[i] + 1) + ": ");
            if (result[i] > 7) {
                System.out.println("Aprovado\n");
            } else  {
                System.out.println("Reprovado\n");
            }
        }
    }
}
