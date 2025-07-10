package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao41 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorDivida, valorTotal = 0,juros = 0;

        System.out.print("Digite o valor da dívida: ");
        valorDivida = ler.nextDouble();

        for (double i = 1; i <= 12; i++) {

            if( i == 1) {
                System.out.print("Valor da Dívida  Valor dos Juros  Parcelas Valor da Parcela\n" + valorDivida + "             " + juros + "            " + i + "         " + (valorDivida / i) + "\n");
            }

            if (i == 3) {
                juros = 0.1;
                valorTotal = valorDivida + (valorDivida * juros);
                System.out.print(valorTotal + "             " + juros + "            " + i + "         " + (valorTotal / i) + "\n");
            };
            if (i == 6) {
                juros = 0.15;
                valorTotal = valorDivida + (valorDivida * juros);
                System.out.print(valorTotal + "             " + juros + "           " + i + "         " + (valorTotal / i) + "\n");
            };
            if (i == 9) {
                juros = 0.20;
                valorTotal = valorDivida + (valorDivida * juros);
                System.out.print(valorTotal + "             " + juros + "            " + i + "         " + (valorTotal / i) + "\n");
            };
            if (i == 12) {
                juros = 0.25;
                valorTotal = valorDivida + (valorDivida * juros);
                System.out.print(valorTotal + "             " + juros + "           " + i + "        " + (valorTotal / i) + "\n");
            };

        }
    }
}
