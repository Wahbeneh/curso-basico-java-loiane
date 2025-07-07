package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao32 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, fatorial = 1;

        System.out.print("Digite o valor que você quer descobrir o fatorial: ");
        n = ler.nextInt();

        for (int i = n; i > 0; i--){
            fatorial *= i;
        }

        System.out.print(n + "! = ");
        for (int i = n; i > 0; i--){
            if (i == 1){
                System.out.print(i);
            } else{
                System.out.print(i + " . ");
            }

        }
        System.out.print(" = " + fatorial );

    }
}