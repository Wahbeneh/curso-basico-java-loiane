package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.print("VERIFICADOR DE NÚMEROS PARES E ÍMPARES\nDigite um numero: ");
        num = ler.nextInt();

        if (num % 2 == 0) {
            System.out.print("Esse número é par");
        } else {
            System.out.print("Esse número é ímpar");
        }
    }
}
