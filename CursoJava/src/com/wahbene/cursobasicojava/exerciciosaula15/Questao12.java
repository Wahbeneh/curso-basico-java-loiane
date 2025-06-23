package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor_hora, horas_trabalhadas;

        System.out.print("Digite o valor hora: ");
        valor_hora = ler.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        horas_trabalhadas = ler.nextDouble();

        System.out.print("Salário Bruto: R$" + (valor_hora * horas_trabalhadas) +
                "\nImposto de Renda: R$" + ((valor_hora * horas_trabalhadas) * 0.05) +
                "\nInss: R$" + ((valor_hora * horas_trabalhadas) * 0.10) +
                "\nFgts: R$" + ((valor_hora * horas_trabalhadas) * 0.11) +
                "\nTotal de descontos: R$" + (((valor_hora * horas_trabalhadas) * 0.05) + ((valor_hora * horas_trabalhadas) * 0.10)) +
                "\nSalário Líquido: R$" + (((valor_hora * horas_trabalhadas) - (((valor_hora * horas_trabalhadas) * 0.05) + ((valor_hora * horas_trabalhadas) * 0.10)))));

    }
}
