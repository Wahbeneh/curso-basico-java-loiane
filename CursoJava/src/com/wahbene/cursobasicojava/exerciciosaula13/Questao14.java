package com.wahbene.cursobasicojava.exerciciosaula13;
import java.util.Scanner;

/**
 *
 */

public class Questao14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double peso, excesso, multa;

        System.out.println("\n---------- BALANÇA ----------");
        System.out.print("Digite o peso da caixa dos peixes: ");
        peso = ler.nextDouble();

        if (peso > 50) {
            excesso = peso - 50;
            multa = excesso * 4;
        } else {
            excesso = 0;
            multa = 0;
        }

        System.out.println("---------- RESULTADO ----------");
        System.out.print("Peso da caixa de peixe " + peso +
                         "\nMulta: R$" + multa + "\nExcesso: " + excesso + "kg");
    }
}
