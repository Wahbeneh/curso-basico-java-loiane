package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        int a, maior = 0;
        Scanner ler = new Scanner(System.in);

        for (int contagem = 1; contagem <= 5; contagem++){
            System.out.print("Digite um número: ");
            a = ler.nextInt();

            if (a > maior) {
                maior = a;
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}
