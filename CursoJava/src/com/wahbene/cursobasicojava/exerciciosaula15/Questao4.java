package com.wahbene.cursobasicojava.exerciciosaula15;
import java.util.Scanner;

/**
 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante - 13/05/25.
 */

public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String letra;

        System.out.print("Digite uma letra: ");
        letra = ler.next();

        if (!letra.equalsIgnoreCase("a") && !letra.equalsIgnoreCase("e") && !letra.equalsIgnoreCase("i") && !letra.equalsIgnoreCase("o") && !letra.equalsIgnoreCase("u")){
            System.out.println("A letra '" + letra + "' não é uma vogal");
        } else {
            System.out.println("A letra '" + letra + "' é uma vogal");
        }
    }
}
