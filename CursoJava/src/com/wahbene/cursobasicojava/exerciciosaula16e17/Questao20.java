package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String d;
        int n, fatorial;
        boolean decisao = false;


        do {
            fatorial = 1;
            System.out.print("Digite o valor que você quer descobrir o fatorial: ");
            n = ler.nextInt();

            if (n % 2 == 0 && n < 16) {
                for (int i = n; i > 0; i--) {
                    fatorial *= i;
                }

                System.out.print(n + "! = ");
                for (int i = n; i > 0; i--) {
                    if (i == 1) {
                        System.out.print(i);
                    } else {
                        System.out.print(i + ".");
                    }

                }
                System.out.print(" = " + fatorial);

                do {
                    System.out.print("\nFazer Novamente\nS - Sim\nN - Não\nSua opção: ");
                    d = ler.next();

                    if (!d.equalsIgnoreCase("S") && !d.equalsIgnoreCase("N")) {
                        System.out.print("Valor inválido, tente novamente!\n");
                    } else decisao = d.equalsIgnoreCase("S");

                } while (!d.equalsIgnoreCase("S") && !d.equalsIgnoreCase("N"));
            } else {
                System.out.print("O número precisa ser positivo e menor que 16");
            }
        } while (decisao);

    }
}
