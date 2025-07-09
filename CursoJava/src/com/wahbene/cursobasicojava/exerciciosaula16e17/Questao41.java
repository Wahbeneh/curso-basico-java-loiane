package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao41 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int parcelas = 0;
        double valorDivida;

        /*System.out.println("Digite o valor da divída: ");
        valorDivida = ler.nextInt();*/

        for (int i = 0; i <= 12; i += 3) {

            if (i < 3) {
                System.out.println((i + 1));
            } else {
                System.out.println(i);
            }

        }
    }
}
