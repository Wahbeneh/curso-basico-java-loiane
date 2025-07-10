package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao45 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String resposta, decisao;
        int escolha, aluno = 1, certo = 0, menorAcerto = 11, maiorAcerto = 0, alunoMenor = 0, alunoMaior = 0;
        double media = 0;


        System.out.print("Digite '0' para iniciar a prova: ");
        escolha = ler.nextInt();

        while (escolha != 0) {
            System.out.print("Digite '0' para iniciar: ");
            escolha = ler.nextInt();
        }

        if (escolha == 0) {
            do {
                certo = 0;
                for (int i = 1; i<= 10; i++) {

                    System.out.print("Digite a resposta da Questão " + i + ": ");
                    resposta = ler.next();

                    if (i == 1 && resposta.equalsIgnoreCase("a")) {
                            certo++;
            } else if (i == 2 && resposta.equalsIgnoreCase("b")) {
                            certo++;
            } else if (i == 3 && resposta.equalsIgnoreCase("c")) {
                            certo++;
            } else if (i == 4 && resposta.equalsIgnoreCase("d")) {
                            certo++;
            } else if (i == 5 && resposta.equalsIgnoreCase("e")) {
                            certo++;
            } else if (i == 6 && resposta.equalsIgnoreCase("e")) {
                            certo++;
            } else if (i == 7 && resposta.equalsIgnoreCase("d")) {
                            certo++;
            } else if (i == 8 && resposta.equalsIgnoreCase("c")) {
                            certo++;
            } else if (i == 9 && resposta.equalsIgnoreCase("b")) {
                            certo++;
            } else if (i == 10 && resposta.equalsIgnoreCase("a")) {
                            certo++;
            }
                    if (i == 10){
                    if (certo < menorAcerto) {
                        menorAcerto = certo;
                        alunoMenor = aluno;
                    }
                    if (certo > maiorAcerto) {
                        maiorAcerto = certo;
                        alunoMaior = aluno;
                    }
                    }

        }
                media += certo;
                System.out.println("Algum outro aluno irá fazer?: ");
                decisao = ler.next();

                if (decisao.equalsIgnoreCase("s")) {
                    aluno++;
                }

            } while (decisao.equalsIgnoreCase("s"));

            System.out.println("Aluno com mais acerto: Aluno " + alunoMaior + "\nNota: "+ maiorAcerto + "\nAluno com menos acerto: Aluno " + alunoMenor + "\nNota: " + menorAcerto + "\nMédia de acertos: " + (media/aluno));
        }

    }
}
