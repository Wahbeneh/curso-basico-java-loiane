package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, divisoes = 0;

        System.out.print("Digite um número: ");
        n = ler.nextInt();


        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n);
                divisoes += 1;
            }
        }


    }
}
