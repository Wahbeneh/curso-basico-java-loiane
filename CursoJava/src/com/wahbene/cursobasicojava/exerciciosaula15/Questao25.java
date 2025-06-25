package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String pergunta;
        int classificacao = 0;

        System.out.print("----- ÍNDICE DE CLASSIFICAÇÃO DE SUSPEITO -----\n");

        System.out.print("Telefonou para a vítima? S - sim | N - não\n");
        pergunta = ler.next();

        if (pergunta.equalsIgnoreCase("S")) {
            classificacao += 1;
        }

        System.out.print("Esteve no local do crime? S - sim | N - não\n");
        pergunta = ler.next();

        if (pergunta.equalsIgnoreCase("S")) {
            classificacao += 1;
        }

        System.out.print("Mora perto da vítima? S - sim | N - não\n");
        pergunta = ler.next();

        if (pergunta.equalsIgnoreCase("S")) {
            classificacao += 1;
        }

        System.out.print("Devia para a vítima? S - sim | N - não\n");
        pergunta = ler.next();

        if (pergunta.equalsIgnoreCase("S")) {
            classificacao += 1;
        }

        System.out.print("Já trabalhou com a vítima? S - sim | N - não\n");
        pergunta = ler.next();

        if (pergunta.equalsIgnoreCase("S")) {
            classificacao += 1;
        }


        if (classificacao == 2) {
            System.out.print("----- ÍNDICE DE CLASSIFICAÇÃO DE SUSPEITO -----\n");
            System.out.print("Classificação: SUSPEITO");
        } else if (classificacao >= 3 && classificacao <= 4) {
            System.out.print("----- ÍNDICE DE CLASSIFICAÇÃO DE SUSPEITO -----\n");
            System.out.print("Classificação: CÚMPLICE");
        } else if (classificacao == 5) {
            System.out.print("----- ÍNDICE DE CLASSIFICAÇÃO DE SUSPEITO -----\n");
            System.out.print("Classificação: ASSASSINO");
        } else {
            System.out.print("----- ÍNDICE DE CLASSIFICAÇÃO DE SUSPEITO -----\n");
            System.out.print("Classificação: INOCENTE");
        }
    }
}
