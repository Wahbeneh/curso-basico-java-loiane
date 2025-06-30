package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao5 {

    public static int pais_a;
    public static int pais_b;
    public static double taxa_a;
    public static double taxa_b;
    public static int ano;


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor da população do País A: ");
        pais_a = ler.nextInt();
        System.out.print("Digite a taxa de crescimento do País A: ");
        taxa_a = ler.nextDouble();

        taxa_a = taxa_a / 100;

        System.out.print("Digite o valor da população do País B: ");
        pais_b = ler.nextInt();
        System.out.print("Digite a taxa de crescimento do País B: ");
        taxa_b = ler.nextDouble();

        taxa_b = taxa_b / 100;

        if (pais_a > pais_b) {
            System.out.print("Quantidade do País A precisa ser menor que quantidade do País B");
        } else {
        while (pais_a < pais_b) {
            pais_a = (int)(pais_a + (pais_a * taxa_a));
            pais_b = (int) (pais_b + (pais_b * taxa_b));
            ano++;
        }

        ler.close();

        }

        System.out.println("Quantidade de anos necessários para que o país A ultrapasse o país B: " + ano);

    }
}
