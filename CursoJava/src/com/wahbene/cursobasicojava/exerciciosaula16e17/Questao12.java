package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.print("--- TABUADA ---\nDigite um número: ");
        num = ler.nextInt();

        System.out.println("Tabuada do " + num);
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
