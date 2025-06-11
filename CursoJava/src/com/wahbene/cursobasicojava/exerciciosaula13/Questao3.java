package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Faça um programa que peça dois números e imprima a soma. - 10/06/25.
 */
public class Questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite o primeiro número: ");
        a = ler.nextInt();
        System.out.print("Agora digite o segundo número: ");
        b = ler.nextInt();

        c = a + b;
        System.out.println("A soma dos valores é igual a " + c);
    }


}
