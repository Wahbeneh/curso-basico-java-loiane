package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao48 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero: ");
        num = ler.nextInt();

        System.out.print("=>  ");
        for (int i = num; i >= 1 ; i--) {
            System.out.print(i + " ");
        }
    }
}
