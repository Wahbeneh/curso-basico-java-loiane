package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int codigocdd, veiculoscdd, acidentecdd, maiorIndice = 0, cddmenorIndice = 0, cddmaiorIndice = 0, menorIndice = 2147483647, mediaVeiculos = 0, mediaAcidentes = 0, contador = 0, mediaCidadesMenos2000 = 0;


        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite o código da cidade: ");
            codigocdd = ler.nextInt();
            System.out.print("Digite o número de veículos na cidade: ");
            veiculoscdd = ler.nextInt();

            System.out.print("Quantos acidentes ocorreu na cidade " + codigocdd + "?: ");
            acidentecdd = ler.nextInt();

            if (veiculoscdd < 2000) {
                contador++;
                mediaCidadesMenos2000 += acidentecdd;
            }

            mediaVeiculos += veiculoscdd;
            mediaAcidentes += acidentecdd;

            if (acidentecdd > maiorIndice) {
                maiorIndice = acidentecdd;
                cddmaiorIndice = codigocdd;
            }

            if (acidentecdd < menorIndice) {
                menorIndice = acidentecdd;
                cddmenorIndice = codigocdd;
            }
        }

        System.out.println("RESULTADOS:\n" +
                "Cidade com maior índice de acidentes: " + cddmaiorIndice + " com " + maiorIndice + " acidentes.\n" +
                "Cidade com menor índice de acidentes: " + cddmenorIndice + " com " + menorIndice + " acidentes.\n" +
                "Média de veículos nas cidades: " + (mediaVeiculos / 5) + "\n" +
                "Média de acidentes nas cidades: " + (mediaAcidentes / 5) + "\n" +
                "Média de veículos nas cidades com menos de 2000 veículos: " + (mediaCidadesMenos2000 / contador));
    }
}
