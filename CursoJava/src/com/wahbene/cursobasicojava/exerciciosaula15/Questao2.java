package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

/**
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo - 13/06/25.
 */

public class Questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;

        System.out.print("Digite um número: ");
        a = ler.nextInt();

        if (a > 0 ) {
            System.out.println("Esse número é positivo");
        } else {
            System.out.println("Esse número é negativo");
        }
    }
}
