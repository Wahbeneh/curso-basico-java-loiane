package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n, divisoes = 0;
        boolean divisivel = true;

        System.out.print("Digite um número: ");
        n = ler.nextInt();


        for (int i = 2; i <= n; i++) {
            divisivel = true;
            for (int j = 2 ; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    divisivel = false;
                    break;
                }
            }

            if (divisivel){
                System.out.println(i);
                divisoes += 1;
            }
        }

        System.out.println("Números de divisões feitas: " + divisoes);


    }
}
