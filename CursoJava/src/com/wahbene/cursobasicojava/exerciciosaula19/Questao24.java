package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        int [] a = new int[10];
        boolean palindromo = true;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número do vetor: ");
            a[i] = ler.nextInt();
        }

        for (int i = 0 , j = a.length - 1 ; i < j; i++, j-- ) {
            if (a[i] != a[j]){
                palindromo = false;
                break;
            }
        }

        if (!palindromo){
            System.out.println("O vetor não é palíndromo");
        } else {
            System.out.println("O vetor é palíndromo");
        }
    }
}
