package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
 * (72.7 * altura) - 58
 * 11/06/25
 */

public class Questao12 {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double altura;
       String sexo;

       System.out.print("Sexo: ");
       sexo = ler.next();

       System.out.print("Altura: ");
       altura = ler.nextDouble();

       double resultado = (72.7 * altura) - 58;

        System.out.println("Seu sexo é "+ sexo +" e seu peso ideal é " +  resultado);
    }
}
