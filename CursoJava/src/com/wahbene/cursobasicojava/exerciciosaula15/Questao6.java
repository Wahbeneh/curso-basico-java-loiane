package com.wahbene.cursobasicojava.exerciciosaula15;
import java.util.Scanner;

/**
 * Faça um Programa que leia três números e mostre o maior deles - 13/06/25.
 */
public class Questao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite a primeiro número: ");
        a = ler.nextInt();
        System.out.print("Digite a segundo número: ");
        b = ler.nextInt();
        System.out.print("Digite a terceiro número: ");
        c = ler.nextInt();

        if (a > b && a > c) {
            System.out.println("O número " + a + " é o maior.");
        } else if (b > a && b > c) {
            System.out.println("O número " + b + " é o maior.");
        } else {
            System.out.println("O número " + c + " é o maior.");
        }
    }
}
