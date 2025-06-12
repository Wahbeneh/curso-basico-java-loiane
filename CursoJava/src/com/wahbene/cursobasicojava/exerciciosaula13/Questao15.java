package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
 *
 * salário bruto.
 * quanto pagou ao INSS.
 * quanto pagou ao sindicato.
 * o salário líquido.
 *
 * Calcule os descontos e o salário líquido, conforme a tabela abaixo:
 *
 * + Salário Bruto - IR (11%) - INSS (8%) - Sindicato (5%) = Salário Líquido
 *
 * 11/06/25
 */
public class Questao15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double v_hora, t_salario, imposto_renda, inss, sindicato, l_salario;
        int h_trabalhadas;

        System.out.print("Quanto você recebe por hora?: ");
        v_hora = ler.nextDouble();

        System.out.print("Quantas horas por mês você trabalha?: ");
        h_trabalhadas = ler.nextInt();

        t_salario = v_hora * h_trabalhadas;
        imposto_renda = t_salario * 0.11;
        inss = t_salario * 0.08;
        sindicato = t_salario * 0.05;

        l_salario = t_salario - (imposto_renda + inss + sindicato);

        System.out.println("CÁLCULO DO IMPOSTO DE RENDA");
        System.out.print("\nSalário Bruto: R$" + t_salario +
                "\nINSS: R$" + inss +
                "\nImposto de renda: R$" + imposto_renda +
                "\nSindicato: R$" + sindicato +
                "\nSalário líquido: R$" + l_salario);


    }
}
