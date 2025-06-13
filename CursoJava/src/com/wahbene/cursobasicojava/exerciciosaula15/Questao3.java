package com.wahbene.cursobasicojava.exerciciosaula15;
import java.util.Scanner;

/**
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M".
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido - 13/06/25.
 */
public class Questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String letra;

        System.out.print("Digite seu sexo \nF - Feminino\nM - Masculino\n");
        letra = ler.next();

        if (letra.equalsIgnoreCase("M")) {
            System.out.print("Você é do sexo \"Masculino\" ");
        } else if (letra.equalsIgnoreCase("F")) {
            System.out.print("Você é do sexo \"Feminino\" ");
        } else {
            System.out.print("Sexo inválido");
        }

    }
}
