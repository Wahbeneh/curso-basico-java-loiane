package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite até quando você quer ver a sequência de fibonacci: ");
        int n = ler.nextInt();
        int a = 1, b = 0, aux;

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            aux = a;
            a = a + b;
            b = aux;
        }
    }
}
