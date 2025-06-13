package com.wahbene.cursobasicojava.exerciciosaula15;
import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles - 13/06/25.
 */
public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = ler.nextInt();

        System.out.print("Digite o primeiro número: ");
        b = ler.nextInt();

        if (a > b) {
            System.out.println("O maior número é o " + a);
        } else if (b > a) {
            System.out.println("O maior número é o " + b);
        } else {
            System.out.println("Esses números são iguais ");
        }
    }
}
