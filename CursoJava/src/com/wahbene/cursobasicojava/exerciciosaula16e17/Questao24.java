package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, media = 0;
        double nota;

        System.out.print("Digite quantas notas você quer calcular: ");
        n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            nota = ler.nextDouble();
            media += nota;
        }

        media = media/n;
        System.out.print("A média aritmética das " + n + " notas, são: " + media);
    }
}
