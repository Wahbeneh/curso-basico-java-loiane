package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao27 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String escolha;
        double kg_fruta, totvalor = 0;

        System.out.print("----- FRUTARIA DA DONA MARIA -----" +
                "\n\nTabela de Frutas" +
                "\n\nAté 5kg" +
                "\nMorango - R$2,50/Kg" +
                "\nMaçã - R$1,80/Kg" +
                "\n\nAcima de 5kg" +
                "\nMorango - R$2,20/Kg" +
                "\nMaçã - R$1,50/Kg" +
                "\n\nQual dos produtos deseja comprar?" +
                "\nS - Somente morango" +
                "\nA - Somente maçã" +
                "\nD - Morango e Maçã" +
                "\n\nSua escolha: ");
        escolha = ler.next();

        if (escolha.equalsIgnoreCase("S")) {

            System.out.print("Digite a quantidade de Morangos que você quer (em kg): ");
            kg_fruta = ler.nextDouble();

            if (kg_fruta <= 5) {
                totvalor = 2.50 * kg_fruta;
            } else if (kg_fruta > 5) {
                totvalor = 2.20 * kg_fruta;
            }

            System.out.println("------- NOTA FISCAL -------" +
                    "\nQuantidade de Morango adquirida: " + (int)kg_fruta + "Kg"+
                    "\nValor a ser pago pelo cliente: R$" + totvalor);
        }

        if (escolha.equalsIgnoreCase("A")) {

            System.out.print("Digite a quantidade de Maçãs que você quer (em kg): ");
            kg_fruta = ler.nextDouble();

            if (kg_fruta <= 5) {
                totvalor = 1.80 * kg_fruta;
            } else if (kg_fruta > 5) {
                totvalor = 1.50 * kg_fruta;
            }

            System.out.println("------- NOTA FISCAL -------" +
                    "\nQuantidade de Maçãs adquirida: " +   (int)kg_fruta + "Kg"+
                    "\nValor a ser pago pelo cliente: R$" + totvalor);
        }

        if (escolha.equalsIgnoreCase("D")) {

            System.out.print("Digite a quantidade de Morangos que você quer (em kg): ");
            double kg_morango = ler.nextDouble();

            System.out.print("Digite a quantidade de Maçãs que você quer (em kg): ");
            double kg_maca = ler.nextDouble();

            kg_fruta = kg_maca + kg_morango;

            if (kg_fruta <= 5) {
                totvalor = 2.15 * kg_fruta;
            } else if (kg_fruta > 5) {
                totvalor = 1.85 * kg_fruta;
            }

            System.out.println("------- NOTA FISCAL -------" +
                    "\nQuantidade de Morangos e Maçãs adquiridas: " + (int)kg_fruta + "Kg"+
                    "\nValor a ser pago pelo cliente: R$" + totvalor);
        }


    }
}
