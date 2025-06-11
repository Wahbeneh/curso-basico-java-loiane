package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Faça um Programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
 * a. o produto do dobro do primeiro com metade do segundo.
 * b. a soma do triplo do primeiro com o terceiro.
 * c. o terceiro elevado ao cubo.
 * - 11/06/25
 */
public class Questao11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1,n2;
        double n3;

        System.out.print("Digite o valor do primeiro número inteiro: ");
        n1 = ler.nextInt();

        System.out.print("Digite o valor do segundo número inteiro: ");
        n2 = ler.nextInt();

        System.out.print("Digite o valor do número real: ");
        n3 = ler.nextInt();

        double a = (n1*2) * ((double) n2 /2);
        double b = (n1*3) + n3;
        double c = Math.pow(n3,3);

        System.out.println("O produto do primeiro com metado do segundo é igual a " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro é igual a " + b);
        System.out.println("O número real elevado ao cubo é igual a " + c);
    }
}
