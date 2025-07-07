package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao, contador = 0;
        double temp = 0, maxtemp = 0, mintemp = 70, media = 0, temptotal = 0;
        String opcao1;

        System.out.println("SISTEMA DE METEOROLOGIA");
        System.out.print("Digite '1' para iniciar: ");
        opcao = ler.nextInt();

        while (opcao != 1) {
            System.out.print("Opção inválida! Tente Novamente\nDigite '1' para iniciar: ");
            opcao = ler.nextInt();
        }

        if (opcao == 1) {
            System.out.println("Analisar temperaturas");
            do {

                if (temp > maxtemp) {
                    maxtemp = temp;
                }

                System.out.print("\nDigite o valor da temperatura: ");
                temp = ler.nextDouble();
                temptotal += temp;
                System.out.print("S - Sair\nC - continuar\nSua Opção: ");
                opcao1 = ler.next();

                while (!opcao1.equalsIgnoreCase("S") && !opcao1.equalsIgnoreCase("C")){
                    System.out.print("Opção inválida Tente Novamente\nS - Sair\nC - continuar\nSua Opção: ");
                    opcao1 = ler.next();
                }

                while (temp > 70) {
                    System.out.print("Temperatura não aceita nesse programa, digite novamente: ");
                    temp = ler.nextDouble();
                    temptotal += temp;
                    System.out.print("\nS - Sair\nC - continuar\nSua Opção: ");
                    opcao1 = ler.next();

                    while (!opcao1.equalsIgnoreCase("S") && !opcao1.equalsIgnoreCase("C")){
                        System.out.print("Opção inválida Tente Novamente\nS - Sair\nC - continuar\nSua Opção: ");
                        opcao1 = ler.next();
                    }
                }

                if (temp < mintemp) {
                    mintemp = temp;
                }
                contador++;
            } while (!opcao1.equalsIgnoreCase("S"));

            media = temptotal/contador;

            System.out.print("\nRESULTADO\nMaior temperatura: " + maxtemp + "\nMenor temperatura: " + mintemp + "\nMédia das temperaturas: " + media);
        }
    }
}
