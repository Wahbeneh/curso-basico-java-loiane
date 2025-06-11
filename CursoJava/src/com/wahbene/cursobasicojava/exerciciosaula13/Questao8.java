package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês. - 11/06/25.
 */
public class Questao8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor_hora, resultado;
        int hora_trabalhada;

        System.out.print("Quanto você ganha por hora?: ");
        valor_hora = ler.nextDouble();
        System.out.print("Você trabalha quantas horas por mês?: ");
        hora_trabalhada = ler.nextInt();

        resultado = valor_hora * hora_trabalhada;

        System.out.println("O valor do seu salário total é de " + resultado);
    }
}
