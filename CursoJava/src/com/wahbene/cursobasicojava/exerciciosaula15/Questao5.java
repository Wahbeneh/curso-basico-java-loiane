package com.wahbene.cursobasicojava.exerciciosaula15;
import java.util.Scanner;

/**
 * Faça um programa para a leitura de duas notas parciais de um aluno.
 * O programa deve calcular a média alcançada por aluno e apresentar:
 * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 * A mensagem "Reprovado", se a média for menor do que sete;
 * A mensagem "Aprovado com Distinção", se a média for igual a dez - 13/06/25.
 */

public class Questao5 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double nota1, nota2;

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = ler.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = ler.nextDouble();

        double resultado = (nota1+nota2)/2;

        if (resultado == 10) {
            System.out.print("Aprovado com Distinção!");
        } else if (resultado >= 7.0) {
            System.out.print("Aluno Aprovado!");
        } else if (resultado < 7.0) {
            System.out.print("Aluno Reprovado.");
        }

    }
}
