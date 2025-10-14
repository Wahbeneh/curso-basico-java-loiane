package com.wahbene.cursobasicojava.exerciciosaula19;

import java.util.Random;
import java.util.Scanner;

public class Questao41 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random(123);
        int numero;
        int[] a = new int[10];
        boolean encontrado = false;

        for (int i = 0; i < a.length; i++){
            a[i] = random.nextInt(6);
        }

        System.out.print("Digite um número que queira verificar: ");
        numero = ler.nextInt();

        for (int i = 0; i < a.length; i++){
            if(a[i] == numero) {
                System.out.println("O número está no vetor, na posição " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O número não foi encontrado no vetor");
        }

    }
}
