package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. - 11/06/25.
 */

public class Questao9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double tfahrenheit, celsius;

        System.out.print("Digite o valor da temperatura em fahrenheit: ");
        tfahrenheit = ler.nextDouble();

        celsius = 5*((tfahrenheit-32)/9);

        System.out.println("O resultado da temperatura em Celsius é igual a " + celsius);
    }
}
