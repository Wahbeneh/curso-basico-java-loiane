package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, dividido = 0;
        boolean divisivel = false;

        System.out.print("Digite um número: ");
        num = ler.nextInt();

        if (num <= 1) {
            System.out.print("O numero " + num + " não é primo!");
        } else {

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    divisivel = true;
                    dividido = i;
                    break;
                }
            }

            if (divisivel) {
                System.out.print("O numero " + num + " não é primo! Pois além de ser dividido por 1 e por ele mesmo, é divisível por " + dividido);
            } else {
                System.out.print("O numero " + num + " é primo!");}
        }
    }
}
