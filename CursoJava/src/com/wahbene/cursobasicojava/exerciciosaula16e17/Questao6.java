package com.wahbene.cursobasicojava.exerciciosaula16e17;

public class Questao6 {
    public static void main(String[] args) {
        int a;

        System.out.println("Contagem com os números um abaixo do outro");
        for (a = 1; a <= 20; a++) {
            System.out.println(a);
        }

        System.out.println("\n\nContagem com os números um do lado do outro");
        for (a = 1; a <= 20; a++) {
            System.out.print(a + " ");
        }
    }
}
