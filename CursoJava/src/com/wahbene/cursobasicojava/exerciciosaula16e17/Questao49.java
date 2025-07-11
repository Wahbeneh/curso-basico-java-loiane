package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao49 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int termo, fracao = 1;

        System.out.print("Digite o termo: ");
        termo = ler.nextInt();

        System.out.print("s = ");
        for (int i = 1; i <= termo; i++) {
            if (i == termo) {
                System.out.print(i + "/" + fracao );
            } else {
                System.out.print(i + "/" + fracao + " + ");
            }

            fracao += 2;

        }
    }
}
