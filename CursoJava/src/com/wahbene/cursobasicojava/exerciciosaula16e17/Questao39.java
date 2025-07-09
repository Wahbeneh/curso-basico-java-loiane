package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao39 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroAluno;
        double altura, maisAlto = 0, maisBaixo = 250, alunoAlto = 0, alunoBaixo = 0;


        for (int i = 1; i <= 10; i++){
            System.out.print("Digite o número do aluno " + i + ": ");
            numeroAluno = ler.nextInt();
            System.out.print("Digite a altura do aluno " + numeroAluno + " (em cm): ");
            altura = ler.nextDouble();

            while (altura > 250) {
                System.out.print("Altura máxima permitida - 250cm. Tente Novamente: ");
                altura = ler.nextDouble();
            }

            if (altura > maisAlto) {
                maisAlto = altura;
                alunoAlto = numeroAluno;
            }

            if (altura < maisBaixo) {
                maisBaixo = altura;
                alunoBaixo = numeroAluno;
            }
        }

        System.out.println("ALUNO MAIS ALTO\nNúmero do Aluno: " + alunoAlto + "\nAltura: " + maisAlto + "\n\nALUNO MAIS BAIXO\nNúmero do Aluno: " + alunoBaixo + "\nAltura: " + maisBaixo);


    }
}
