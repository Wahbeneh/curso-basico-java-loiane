package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao28 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String escolha, escolhacard;
        int quantidade;
        double valor = 0, desconto = 0, totValor = 0;



        System.out.print("--- CASA DE CARNE DO TOTÓ --- " +
                "\n\nSelecione qual carne escolherá:\n\n" +
                "F - Filé Duplo\n" +
                "A - Alcatra\n" +
                "P - Picanha\n\nSua opção: ");
        escolha = ler.next();

        System.out.println("A compra será feita pelo Cartão Tabajara? s/n");
        escolhacard = ler.next();

        //Desconto de 5%
        if (escolhacard.equalsIgnoreCase("S")) {
            if (escolha.equalsIgnoreCase("F")) {

                System.out.print("Digite a quantidade que você quer comprar (em kg): ");
                quantidade = ler.nextInt();

                if (quantidade <= 5) {
                    valor = quantidade * 4.90;
                    desconto = valor * 0.05;
                    totValor = valor - desconto;
                } else if (quantidade > 5) {
                    valor = quantidade * 5.80;
                    desconto = valor * 0.05;
                    totValor = valor - desconto;
                }

                System.out.print("\n----- CUPOM FISCAL -----\n" +
                        "Tipo de carne escolhida: " + escolha.toUpperCase() + " - Filé Duplo\n" +
                        "Quantidade comprada: " + quantidade + "kg" +
                        "\nDesconto: R$" + desconto + "\n" +
                        "Valor total: R$" + totValor + "\n" +
                        "Forma de Pagamento: Cartões Tabajara");

            } else if (escolha.equalsIgnoreCase("A")) {

                System.out.print("Digite a quantidade que você quer comprar (em kg): ");
                quantidade = ler.nextInt();

                if (quantidade <= 5) {
                    valor = quantidade * 5.90;
                    desconto = valor * 0.05;
                    totValor = valor - desconto;
                } else if (quantidade > 5) {
                    valor = quantidade * 6.80;
                    desconto = valor * 0.05;
                    totValor = valor - desconto;
                }

                System.out.print("\n----- CUPOM FISCAL -----\n" +
                        "Tipo de carne escolhida: " + escolha.toUpperCase() + " - Alcatra\n" +
                        "Quantidade comprada: " + quantidade + "kg" +
                        "\nDesconto: R$" + desconto + "\n" +
                        "Valor total: R$" + totValor + "\n" +
                        "Forma de Pagamento: Cartões Tabajara");

            } else if (escolha.equalsIgnoreCase("P")) {

                System.out.print("Digite a quantidade que você quer comprar (em kg): ");
                quantidade = ler.nextInt();

                if (quantidade <= 5) {
                    valor = quantidade * 6.90;
                    desconto = valor * 0.05;
                    totValor = valor - desconto;
                } else if (quantidade > 5) {
                    valor = quantidade * 7.80;
                    desconto = valor * 0.05;
                    totValor = valor - desconto;
                }

                System.out.print("\n----- CUPOM FISCAL -----\n" +
                        "Tipo de carne escolhida: " + escolha.toUpperCase() + " - Picanha\n" +
                        "Quantidade comprada: " + quantidade + "kg" +
                        "\nDesconto: R$" + desconto + "\n" +
                        "Valor total: R$" + totValor + "\n" +
                        "Forma de Pagamento: Cartões Tabajara");

            } else {
                System.out.print("Opção Inválida");
            }
        } else {
            if (escolha.equalsIgnoreCase("F")) {

                System.out.print("Digite a quantidade que você quer comprar (em kg): ");
                quantidade = ler.nextInt();

                if (quantidade <= 5) {
                    valor = quantidade * 4.90;
                } else if (quantidade > 5) {
                    valor = quantidade * 5.80;
                }

                System.out.print("\n----- CUPOM FISCAL -----\n" +
                        "Tipo de carne escolhida: " + escolha.toUpperCase() + " - Filé Duplo\n" +
                        "Quantidade comprada: " + quantidade + "kg" +
                        "\nDesconto: R$" + desconto + "\n" +
                        "Valor total: R$" + valor + "\n" +
                        "Forma de Pagamento: Dinheiro ou Cartão");

            } else if (escolha.equalsIgnoreCase("A")) {

                System.out.print("Digite a quantidade que você quer comprar (em kg): ");
                quantidade = ler.nextInt();

                if (quantidade <= 5) {
                    valor = quantidade * 5.90;
                } else if (quantidade > 5) {
                    valor = quantidade * 6.80;
                }

                System.out.print("\n----- CUPOM FISCAL -----\n" +
                        "Tipo de carne escolhida: " + escolha.toUpperCase() + " - Alcatra\n" +
                        "Quantidade comprada: " + quantidade + "kg" +
                        "\nDesconto: R$" + desconto + "\n" +
                        "Valor total: R$" + valor + "\n" +
                        "Forma de Pagamento: Dinheiro ou Cartão");

            } else if (escolha.equalsIgnoreCase("P")) {

                System.out.print("Digite a quantidade que você quer comprar (em kg): ");
                quantidade = ler.nextInt();

                if (quantidade <= 5) {
                    valor = quantidade * 6.90;
                } else if (quantidade > 5) {
                    valor = quantidade * 7.80;
                }

                System.out.print("\n----- CUPOM FISCAL -----\n" +
                        "Tipo de carne escolhida: " + escolha.toUpperCase() + " - Picanha\n" +
                        "Quantidade comprada: " + quantidade + "kg" +
                        "\nDesconto: R$" + desconto + "\n" +
                        "Valor total: R$" + valor + "\n" +
                        "Forma de Pagamento: Dinheiro ou Cartão");

            } else {
                System.out.print("Opção Inválida");
            }
        }


    }
}
