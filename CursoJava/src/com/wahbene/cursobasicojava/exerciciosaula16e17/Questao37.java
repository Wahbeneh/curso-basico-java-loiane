package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao37 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int codigo = 0, contador = 0, codigomg = 0, codigoma = 0, codigomm = 0, codigomb = 0;
        double maisAlto = 0, maisBaixo = 2.51, maisGordo = 0, maisMagro = 597, peso = 0, altura = 0, mediaAltura = 0, mediaPeso = 0;

        System.out.println("Academia dus Lek");
        do {


            System.out.print("Digite o código do aluno: ");
            codigo = ler.nextInt();

            if (codigo == 0) {
                break;
            } else {

                System.out.print("Digite a altura do aluno:");
                altura = ler.nextDouble();
                mediaAltura += altura;

                System.out.print("Digite o peso do aluno: ");
                peso = ler.nextDouble();
                mediaPeso += peso;

                if (peso > maisGordo) {
                    maisGordo = peso;
                    codigomg = codigo;
                }

                if (peso < maisMagro) {
                    maisMagro = peso;
                    codigomm = codigo;
                }

                if (altura > maisAlto) {
                    maisAlto = altura;
                    codigoma = codigo;
                }

                if (altura < maisBaixo) {
                    maisBaixo = altura;
                    codigomb = codigo;
                }
                contador++;
            }
        } while (codigo != 0);

            mediaPeso = mediaPeso / contador;
            mediaAltura = mediaAltura / contador;
            System.out.print("RESULTADOS\n" + "MAIS GORDO\n" + "Código mais gordo: " + codigomg + "\nPeso: " + maisGordo +
                    "\nMAIS MAGRO\n" + "Código mais magro: " + codigomm + "\nPeso: " + maisMagro + "\nMAIS ALTO: \nCódigo mais alto: " + codigoma +
                    "\nAltura: " + maisAlto + "\nMAIS BAIXO: \nCódigo mais baixo: " + codigomb + "\nAltura: " + maisBaixo + "\nMÉDIA DE PESO: " + mediaPeso + "\nMÉDIA DE ALTURA: " + mediaAltura);



    }
}
