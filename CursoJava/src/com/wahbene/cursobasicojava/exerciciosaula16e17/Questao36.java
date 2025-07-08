package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int numero, inicio, fim;

        System.out.print("Escolha o número que deseja ver a tabuada: ");
        numero = ler.nextInt();

        System.out.print("Digite o número inicial: ");
        inicio = ler.nextInt();

        System.out.print("Digite o número final: ");
        fim = ler.nextInt();

        while (fim < inicio) {
            System.out.println("O número final deve ser maior ou igual ao número inicial. Tente novamente.");
            System.out.print("Digite o número final: ");
            fim = ler.nextInt();
        }

        System.out.println("Montar a tabuada de: " + numero);
        System.out.println("Começar por: " + inicio);
        System.out.println("Terminar em: " + fim);
        System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
