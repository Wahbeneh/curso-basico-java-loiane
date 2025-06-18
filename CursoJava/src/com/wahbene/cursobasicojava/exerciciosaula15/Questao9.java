package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Arrays;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, num3;
        int maior = 0, meio = 0, menor = 0;

        System.out.print("Digite o valor do primeiro número: ");
        num1 = ler.nextInt();

        System.out.print("Digite o valor do segundo número: ");
        num2 = ler.nextInt();

        System.out.print("Digite o valor do terceiro número: ");
        num3 = ler.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 > num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        }

        if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 > num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        }

        if (num3 >= num2 && num3 >= num1) {
            maior = num3;
            if (num2 > num1) {
                meio = num2;
                menor = num1;
            } else {
                meio = num1;
                menor = num2;
            }
        }

        System.out.print(maior + "," + meio + "," + menor);

    }
}
