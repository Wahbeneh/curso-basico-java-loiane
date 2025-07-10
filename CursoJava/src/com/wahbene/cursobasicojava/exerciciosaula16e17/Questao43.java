package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao43 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int inicio, fim, escolha, quantidade;
        double valor = 0, valorTotal = 0, preco = 0;

        System.out.println("\nEspecificação    Código    Preço");
        System.out.println(

                "Cachorro Quente  100       R$ 1,20\n" +
                "Bauru Simples    101       R$ 1,30\n" +
                "Bauru com Ovo    102       R$ 1,50\n" +
                "Hambúrguer       103       R$ 1,20\n" +
                "Cheeseburguer    104       R$ 1,30\n" +
                "Refrigerante     105       R$ 1,00"
        );

        System.out.print("\nDigite '0' para iniciar o pedido: ");
        inicio = ler.nextInt();

        while (inicio != 0) {
            System.out.print("Opção Inválida! Digite '0' para iniciar o pedido: ");
            inicio = ler.nextInt();
        }

        System.out.println("\nPedido iniciado!");

        if (inicio == 0) {

            do {
            preco = 0;
            System.out.print("Qual produto você deseja pedir? (Digite o código do produto): ");
            escolha = ler.nextInt();

            while (escolha != 100 && escolha != 101 && escolha != 102 && escolha != 103 && escolha != 104 && escolha != 105 ) {
                System.out.println("Código não encontrado! Digite novamente o código do produto: ");
                escolha = ler.nextInt();
            }

            switch (escolha) {
                case 100:
                    System.out.println("Você escolheu Cachorro Quente.");
                    preco += 1.20;
                    break;
                case 101:
                    System.out.println("Você escolheu Bauru Simples.");
                    preco += 1.30;
                    break;
                case 102:
                    System.out.println("Você escolheu Bauru com Ovo.");
                    preco += 1.50;
                    break;
                case 103:
                    System.out.println("Você escolheu Hambúrguer.");
                    preco += 1.20;
                    break;
                case 104:
                    System.out.println("Você escolheu Cheeseburguer.");
                    preco += 1.30;
                    break;
                case 105:
                    System.out.println("Você escolheu Refrigerante.");
                    preco += 1.00;
                    break;
            }

            System.out.print("Digite a quantidade do produto: ");
            quantidade = ler.nextInt();

            valor = preco * quantidade;
            valorTotal += valor;

                System.out.println("Deseja comprar mais algo?: (1 - Sim, 0 - Não)");
                fim = ler.nextInt();
            } while (fim != 0);

            System.out.println("\nPedido finalizado!");
            System.out.println("Valor total do pedido: R$" + valorTotal);
        }
    }
}
