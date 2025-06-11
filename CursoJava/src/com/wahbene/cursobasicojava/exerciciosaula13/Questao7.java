package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. - 11/06/25.
 */
public class Questao7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double lado, resultado;

        System.out.print("Digite o valor do lado do quadrado: ");
        lado = ler.nextDouble();

        resultado = Math.pow(lado,2);

        System.out.println("O resultado da área é igual a " + resultado);
        System.out.print("E o seu dobro é igual a " + resultado * 2);
    }
}
