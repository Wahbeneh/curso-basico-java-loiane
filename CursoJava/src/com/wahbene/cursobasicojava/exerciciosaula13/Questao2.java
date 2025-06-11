package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Faça um programa que peça um número e então mostre a mensagem "O número informado foi [numero]" - 10/06/25.
 */
public class Questao2 {
    public static void main(String[] args) {
        int n;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = ler.nextInt();

        System.out.println("O número informado foi " + n);
    }
}
