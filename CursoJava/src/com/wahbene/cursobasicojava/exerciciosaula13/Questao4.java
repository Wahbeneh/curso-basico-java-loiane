package com.wahbene.cursobasicojava.exerciciosaula13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Faça um programa que peça a 4 notas bimestrais e mostre a média - 10/06/25.
 */

public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3, n4, media;


        System.out.print("Digite a primeira nota do aluno: ");
        n1 = ler.nextInt();

        System.out.print("Digite a segunda nota do aluno: ");
        n2 = ler.nextInt();

        System.out.print("Digite a terceira nota do aluno: ");
        n3 = ler.nextInt();

        System.out.print("Digite a quarta nota do aluno: ");
        n4 = ler.nextInt();

        media = (n1 + n2 + n3 + n4) /4;

        System.out.print("A média do aluno é de " + media);
    }
}
