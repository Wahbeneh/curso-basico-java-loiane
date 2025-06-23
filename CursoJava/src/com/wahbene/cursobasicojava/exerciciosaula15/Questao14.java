package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Digite o valor da primeira nota: ");
        nota1 = ler.nextDouble();

        System.out.print("Digite o valor da segunda nota: ");
        nota2 = ler.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media > 9 && media <= 10) {
            System.out.print("\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito: A\nSituação: Aprovado");
        } else if (media > 7.5 && media <= 9) {
            System.out.print("\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito: B\nSituação: Aprovado");
        } else if (media > 6 && media <= 7.5) {
            System.out.print("\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito: C\nSituação: Aprovado");
        } else if (media > 4 && media <= 6) {
            System.out.print("\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito: D\nSituação: Reprovado");
        } else if (media >= 0 && media <= 4) {
            System.out.print("\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media + "\nConceito: E\nSituação: Reprovado");
        }
    }
}
