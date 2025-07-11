package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao47 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota, media = 0, maiorNota = 0, menorNota = 11;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Informe a nota do jurado " + i + ": ");
            nota = ler.nextDouble();
            media += nota;
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        media = (media - (maiorNota + menorNota))/ 5;
        System.out.println("Resultados " + "\nMaior nota: " + maiorNota + "\nMenor nota: " + menorNota + "\nMedia: " + media);
    }
}
