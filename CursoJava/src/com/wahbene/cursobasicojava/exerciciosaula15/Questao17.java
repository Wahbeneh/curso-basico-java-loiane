package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano;

        System.out.print("Digite um ano: ");
        ano = ler.nextInt();

        if (ano % 4 == 0 && (ano % 100 != 0) || (ano % 400 == 0)){
            System.out.print("Esse ano é bissexto");
        } else {
            System.out.print("Esse ano não é bissexto");
        }
    }
}
