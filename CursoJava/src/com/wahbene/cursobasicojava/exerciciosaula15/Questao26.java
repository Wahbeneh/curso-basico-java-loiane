package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao26 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String tipo;
        int litros = 0, valor = 0, totValor = 0, desconto = 0;

        System.out.println("-------- POSTO SANTONTOIN  --------");
        System.out.println("Qual tipo de combustível? A - Álcool | G - Gasolina  ");
        tipo = ler.next();

        if (tipo.equalsIgnoreCase("A")) {
            System.out.println("Quantos litros você quer? ");
            litros = ler.nextInt();

            // Alcool até 20 litros - desconto de 3% por litro
            if (litros <= 20) {
                valor = (int) (litros * 1.90);
                desconto = (int) (valor * 0.03);
                totValor = valor - desconto;
            }

            // Alcool > 20 litros - desconto de 5% por litro
            if (litros > 20) {
                valor = (int) (litros * 1.90);
                desconto = (int) (valor * 0.05);
                totValor = valor - desconto;
            }

            System.out.println("-------- NOTA FISCAL  --------");
            System.out.println("Litragem requisitada: " + litros + "l");
            System.out.println("Tipo de combustível: " + tipo.toUpperCase() + " - Álcool");
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago: R$" + totValor);

        } else if (tipo.equalsIgnoreCase("G")) {
            System.out.println("Quantos litros você quer? ");
            litros = ler.nextInt();

            // Gasolina até 20 litros - desconto de 4% litro
            if (litros <= 20) {
                valor = (int) (litros * 2.50);
                desconto = (int) (valor * 0.04);
                totValor = valor - desconto;
            }

            // Gasolina > 20 litros - desconto de 6% litro
            if (litros > 20) {
                valor = (int) (litros * 2.50);
                desconto = (int) (valor * 0.06);
                totValor = valor - desconto;
            }

            System.out.println("-------- NOTA FISCAL  --------");
            System.out.println("Litragem requisitada: " + litros + "l");
            System.out.println("Tipo de combustível: " + tipo.toUpperCase() + " - Gasolina");
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago: R$" + totValor);
        }


    }
}
