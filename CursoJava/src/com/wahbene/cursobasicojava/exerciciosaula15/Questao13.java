package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int num;

        System.out.print("Digite uym número de 1 a 7: ");
        num = ler.nextInt();

        if (num == 1) {
            System.out.print("Você escolheu Domingo");
        } else if (num == 2) {
            System.out.print("Você escolheu Segunda");
        } else if (num == 3) {
            System.out.print("Você escolheu Terça");
        } else if (num == 4) {
            System.out.print("Você escolheu Quarta");
        } else if (num == 5) {
            System.out.print("Você escolheu Quinta");
        } else if (num == 6 ) {
            System.out.print("Você escolheu Sexta");
        } else if (num == 7) {
            System.out.print("Você escolheu Sábado");
        } else {
            System.out.print("Número inválido");
        }

    }
}
