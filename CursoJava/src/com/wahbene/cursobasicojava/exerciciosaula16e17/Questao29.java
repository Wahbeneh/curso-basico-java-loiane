package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int qprod;
      double valorprod = 1.99;

        System.out.print("Quantos produtos o cliente comprou: ");
        qprod = ler.nextInt();


        while (qprod > 50){
            System.out.print("Quantidade de produto não permitida\nAdicione um novo valor: ");
            qprod = ler.nextInt();
        }

        System.out.print("\nLoja Quase Dois - Tabela de preços\n");
        for (int i = 1; i <= qprod; i++){
          System.out.println(i + " - R$ " + (i * 1.99));
    }
}
}
