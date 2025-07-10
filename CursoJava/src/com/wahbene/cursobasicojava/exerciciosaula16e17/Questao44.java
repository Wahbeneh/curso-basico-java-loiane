package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao44 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double porcentagemNulos = 0.0, porcentagemBrancos = 0.0;
    int totalVotos = 0, escolha = 0, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, votoNulo = 0, votoBranco = 0;

        System.out.println("\nELEIÇÕES\nEscolha um candidato:" +
                "\n1 - Candidato Junin da Silva" +
                "\n2 - Candidato Sacramento Laminado" +
                "\n3 - Candidato Ortiga Pereira" +
                "\n4 - Candidato Luciclalvo" +
                "\n\n5 - Voto Nulo" +
                "\n6 - Voto em Branco" +
                "\n0 - Sair");
    do {
        System.out.print("Seu voto: ");
        escolha = ler.nextInt();

        while (escolha < 0 || escolha > 6) {
            System.out.println("Opção inválida! Digite novamente.");
            System.out.print("Seu voto: ");
            escolha = ler.nextInt();
        }

        if (escolha == 1) {
            candidato1++;
        } else if (escolha == 2) {
            candidato2++;
        } else if (escolha == 3) {
            candidato3++;
        } else if (escolha == 4) {
            candidato4++;
        } else if (escolha == 5) {
            votoNulo++;
        } else if (escolha == 6) {
            votoBranco++;
        }

        if (escolha != 0) {
            totalVotos += 1;
        }

    } while(escolha != 0);

    porcentagemNulos = votoNulo * 100.0 / totalVotos;
    porcentagemBrancos = votoBranco * 100.0 / totalVotos;

        System.out.println("Total de votos:" +
                "\nCandidato Junin da Silva: " + candidato1 +
                "\nCandidato Sacramento Laminado: " + candidato2 +
                "\nCandidato Ortiga Pereira: " + candidato3 +
                "\nCandidato Luciclalvo: " + candidato4 +
                "\nVotos Nulos: " + votoNulo +
                "\nPorcentagem de Votos Nulos: " + String.format("%.2f", porcentagemNulos) + "%" +
                "\nVotos em Branco: " + votoBranco +
                "\nPorcentagem de Votos em Branco: " + String.format("%.2f", porcentagemBrancos) + "%" +
                "\nTotal de Votos: " + totalVotos);
    }
}
