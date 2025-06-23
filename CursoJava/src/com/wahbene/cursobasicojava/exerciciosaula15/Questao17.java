package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano;

        System.out.print("Digite um ano: ");
        ano = ler.nextInt();

        //Se ele for divisível por 4, porem se for divisível por 100  precisa ser divisível por 400
        if(ano % 4 == 0 && ano % 400 == 0) {
            System.out.print("Este ano é bissexto");
        }

        else {
            System.out.print("Este ano não é bissexto");
        }

    }
}
