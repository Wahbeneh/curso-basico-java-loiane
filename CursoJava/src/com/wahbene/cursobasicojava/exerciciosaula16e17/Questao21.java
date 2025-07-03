package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        boolean divisivel = false;

        System.out.print("Digite um número: ");
        num = ler.nextInt();

        if (num <= 1) {
            System.out.print("O numero " + num + " não é primo!");
        } else {

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisivel = true;
                break;
            }
        }

        if (divisivel) {
            System.out.print("O numero " + num + " não é primo!");
        } else {
            System.out.print("O numero " + num + " é primo!");}
        }
    }
}
