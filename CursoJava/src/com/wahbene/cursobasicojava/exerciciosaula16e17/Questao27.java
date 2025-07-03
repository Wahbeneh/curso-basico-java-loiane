package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao27 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int turma, alunos, media = 0;

        System.out.print("Digite a quantidade de turma: ");
        turma = ler.nextInt();

        for (int i = 1; i <= turma; i++) {
            System.out.print("Digite a quantidade da turma " + i +": ");
            alunos = ler.nextInt();

            if(alunos > 40) {
                --i;
                System.out.print("Quantidade de alunos não permitida!\n");
            } else {
                media += alunos;
            }
        }

        media = media/turma;

        System.out.print("Média das turmas: " + media);
    }
}
