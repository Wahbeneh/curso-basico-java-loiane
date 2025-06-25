package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, media;

        System.out.print("Digite a primeira nota do aluno: ");
        n1 = ler.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        n2 = ler.nextDouble();

        media = (n1 + n2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção\nMédia: " + media);
        } else if (media >= 7 ) {
            System.out.println("Aprovado\nMédia: " + media);
        } else {
            System.out.println("Reprovado\nMédia: " + media);
        }
    }
}
