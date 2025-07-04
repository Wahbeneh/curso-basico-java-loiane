package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao28 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade_cd;
        double valor_total = 0, media = 0;

        System.out.print("Digite a quantidade de cd's que possui: ");
        quantidade_cd = ler.nextInt();

        for (int i = 0 ; i < quantidade_cd; i++) {
            System.out.print("Digite o valor do " + (i+1) + "º cd: ");
            valor_total += ler.nextDouble();
        }
        media = valor_total/quantidade_cd;

        System.out.print("RESULTADOS\nValor total investido: " + valor_total + "\nMédia gasto por CD: " + media);
    }
}
