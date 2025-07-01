package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 1, b = 0, aux;

         do {
            System.out.println(a);
            aux = a;
            a = a + b;
            b = aux;
        } while (a <= 500);

    }
}
