package com.wahbene.cursobasicojava.exerciciosaula16e17;

public class Questao4 {

    public static int pais_a = 80000;
    public static int pais_b = 200000;
    public static double taxa_a = 0.03;
    public static double taxa_b = 0.015;
    public static int ano = 0;

    public static void main(String[] args) {

        while (pais_a < pais_b) {
        pais_a = (int)(pais_a + (pais_a * taxa_a));
        pais_b = (int) (pais_b + (pais_b * taxa_b));
        ano++;
        }

        System.out.println("Quantidade de anos necessários para que o país A ultrapasse o país B: " + ano);

    }
}
