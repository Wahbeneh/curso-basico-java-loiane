package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        double soma = 0;
        String operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = ler.nextInt();

        System.out.print("Qual operação deseja fazer?" + "\n\nA - Adição" + "\nS - Subtração" + "\nD - Divisão" + "\nM - Multiplicação" + "\n\nDigite sua opção: ");
        operacao = ler.next();


        if (operacao.equalsIgnoreCase("A")) {
            soma = num1 + num2;
            System.out.print("O resultado da soma é: " + soma + "\n");
            if (soma % 2 == 0) {
                System.out.print("O resultado da soma é par\n");
            } else {
                System.out.print("O resultado da soma é ímpar\n");
            }

            if (soma >= 0) {
                System.out.print("O resultado da soma é positivo\n");
            } else {
                System.out.print("O resultado da soma é negativo\n");
            }

            if (soma == Math.floor(soma)) {
                System.out.print("O resultado da soma é inteiro\n");
            } else {
                System.out.print("O resultado da soma é decimal\n");
            }
        } else if (operacao.equalsIgnoreCase("S")) {
            soma = num1 - num2;
            System.out.print("O resultado da soma é: " + soma + "\n");
            if (soma % 2 == 0) {
                System.out.print("O resultado da soma é par\n");
            } else {
                System.out.print("O resultado da soma é ímpar\n");
            }

            if (soma >= 0) {
                System.out.print("O resultado da soma é positivo\n");
            } else {
                System.out.print("O resultado da soma é negativo\n");
            }

            if (soma == Math.floor(soma)) {
                System.out.print("O resultado da soma é inteiro\n");
            } else {
                System.out.print("O resultado da soma é decimal\n");
            }
        } else if (operacao.equalsIgnoreCase("D")) {
            soma = (double) num1 / num2;
            System.out.print("O resultado da soma é: " + soma + "\n");
            if (soma % 2 == 0) {
                System.out.print("O resultado da soma é par\n");
            } else {
                System.out.print("O resultado da soma é ímpar\n");
            }

            if (soma >= 0) {
                System.out.print("O resultado da soma é positivo\n");
            } else {
                System.out.print("O resultado da soma é negativo\n");
            }

            if (soma == Math.floor(soma)) {
                System.out.print("O resultado da soma é inteiro\n");
            } else {
                System.out.print("O resultado da soma é decimal\n");
            }
        } else if (operacao.equalsIgnoreCase("M")) {
            soma = num1 * num2;
            System.out.print("O resultado da soma é: " + soma + "\n");
            if (soma % 2 == 0) {
                System.out.print("O resultado da soma é par\n");
            } else {
                System.out.print("O resultado da soma é ímpar\n");
            }

            if (soma >= 0) {
                System.out.print("O resultado da soma é positivo\n");
            } else {
                System.out.print("O resultado da soma é negativo\n");
            }

            if (soma == Math.floor(soma)) {
                System.out.print("O resultado da soma é inteiro\n");
            } else {
                System.out.print("O resultado da soma é decimal\n");
            }
        } else {
            System.out.print("Operação inválida\n");
        }


    }
}
