package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Tendo como dado de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * Para homens: (72.7*h) - 58
 * Para mulheres: (62.1*h) - 44.7 (h = altura)
 * 11/06/25
 */
public class Questao13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double altura, resultado;
        String sexo;

        System.out.print("Digite seu sexo: ");
        sexo = ler.nextLine();

        if (sexo.equalsIgnoreCase("Masculino")) {
            System.out.print("Digite sua altura: ");
            altura = ler.nextDouble();
            resultado = (72.7 * altura) - 58;
            System.out.print("Seu sexo é " + sexo + " e seu peso ideal é " + resultado);
        } else if (sexo.equalsIgnoreCase("Feminino")) {
            System.out.print("Digite sua altura: ");
            altura = ler.nextDouble();
            resultado = (62.1 * altura) - 44.7;
            System.out.print("Seu sexo é " + sexo + " e seu peso ideal é " + resultado);
        } else {
            System.out.print("Sexo inválido");
        }


    }
}
