package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. - 11/06/25.
 */
public class Questao10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Digite a temperatura em celsius: " );
        celsius = ler.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.print("O valor da temperatura em fahrenheit é igual a " + fahrenheit);
    }
}
