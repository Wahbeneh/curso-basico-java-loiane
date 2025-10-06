package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Scanner;

public class Questao32 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o " + (i + 1) + " do vetor: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("\nTabuada do " + (i + 1) + "\n");
            for (int j = 1; j <= 10; j++) {
                int resultado = a[i] * j;
                System.out.println(a[i] + " * " + j + " = " + resultado);
            }
        }
    }
}
