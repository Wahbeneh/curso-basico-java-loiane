package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double prodt1, prodt2, prodt3;

        System.out.print("Digite o valor do primeiro produto: ");
        prodt1 = ler.nextDouble();

        System.out.print("Digite o valor do segundo produto: ");
        prodt2 = ler.nextDouble();

        System.out.print("Digite o valor do terceiro produto: ");
        prodt3 = ler.nextDouble();

        if (prodt1 < prodt2 && prodt1 <  prodt3){
            System.out.print("O produto mais barato é o primeiro produto, com o valor de " + prodt1);
        } else if (prodt2 <  prodt1 && prodt2 <  prodt3){
            System.out.print("O produto mais barato é o segundo produto, com o valor de " + prodt2);
        } else if (prodt3 <  prodt1 && prodt3 <  prodt2){
            System.out.print("O produto mais barato é o terceiro produto, com o valor de " + prodt3);
        }

        }
    }

