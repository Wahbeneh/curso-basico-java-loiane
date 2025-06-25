package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, centena, dezena, unidade;

        System.out.print("Digite um numero: ");
        num = ler.nextInt();

        centena = num / 100;
        dezena = (num % 100) / 10;
        unidade = num % 10;

        System.out.println("O número possui "+ centena +" centena(s) "+ dezena + " dezena(s) e " + unidade + " unidade(s)");
    }
}
