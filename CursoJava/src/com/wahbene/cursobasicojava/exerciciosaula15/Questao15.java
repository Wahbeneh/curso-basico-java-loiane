package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.print("Digite o lado 1: ");
        lado1 = ler.nextInt();

        System.out.print("Digite o lado 2: ");
        lado2 = ler.nextInt();

        System.out.print("Digite o lado 3: ");
        lado3 = ler.nextInt();

        if (lado2 + lado3 > lado1 && lado1 + lado3 > lado2 && lado1 + lado2 > lado3) {

            System.out.print("É possível formar um triângulo\n");

            if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                System.out.print("Esse triângulo é equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.print("Esse triângulo é isósceles");
            } else {
                System.out.println("Esse triângulo é escaleno");
            }

        } else {
            System.out.print("Não é possível formar um triângulo");
        }


    }
}
