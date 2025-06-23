package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c, delta;

        System.out.print("Digite o valor de a: ");
        a = ler.nextInt();

        if (a == 0) {
            System.out.print("A equação não é do segundo grau");
            return;
        } else {
            System.out.print("Digite o valor de b: ");
            b = ler.nextInt();

            System.out.print("Digite o valor de c: ");
            c = ler.nextInt();

            delta = (int) Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.print("A equação não possui raízes reais");
                return;
            } else if (delta == 0) {
                System.out.print("A equação possui apenas uma raiz real");
            } else if (delta > 0 ) {
                System.out.print("A equação possui duas raízes reais");
            }
        }



    }
}
