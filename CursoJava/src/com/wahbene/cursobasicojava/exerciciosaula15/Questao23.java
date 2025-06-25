package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num;

        System.out.print("VERIFICADOR DE NÚMEROS DECIMAIS\n Digite um número: ");
        num = ler.nextDouble();

        if (num == Math.floor(num)) {
            System.out.print("Este número é inteiro");
        } else {
            System.out.print("Este número não é inteiro");
        }
    }
}
