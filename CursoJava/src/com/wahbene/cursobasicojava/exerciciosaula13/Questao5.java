package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Faça um programa que converta metros em centímetros - 10/06/25.
 */
public class Questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int metros, centimetros;

        System.out.print("Digite o valor que queria converter em centimetros: ");
        metros = ler.nextInt();

        centimetros = metros * 100;

        System.out.println("O valor " + metros + " em centímetros é " + centimetros);
    }
}
