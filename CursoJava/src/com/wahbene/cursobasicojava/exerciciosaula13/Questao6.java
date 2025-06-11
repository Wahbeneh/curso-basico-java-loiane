package com.wahbene.cursobasicojava.exerciciosaula13;

import java.util.Scanner;

/**
 * Faça um programa que peça o raio de um circulo, calcule e mostre sua área - 10/26/25.
 */
public class Questao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio, resultado;

        System.out.print("Digite o valor do raio do círculo: ");
        raio = ler.nextDouble();

        resultado = Math.PI * Math.pow(raio,2);

        System.out.print("A área do círculo é igual a " + resultado);
    }
}
