package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int base, expoente, resultado = 1;

        System.out.print("Digite o valor da base: ");
        base = ler.nextInt();

        System.out.print("Digite o valor do expoente: ");
        expoente = ler.nextInt();

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.print("Resultado é igual a: " + resultado);
    }
}
