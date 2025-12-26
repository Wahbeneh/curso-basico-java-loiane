package com.wahbene.cursobasicojava.exerciciosaula20;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] jogoDaVelha = new char[3][3];

        System.out.println("--- JOGO DA VELHA --- ");
        boolean ganhou = false;
        char sinal;
        int linha, coluna;
        int jogada = 1;

        while (!ganhou && jogada <= 9) {

            //Se for positivo, quem joga é o X. Se for negativo quem joga é o O
            if (jogada % 2 == 1) {
                System.out.println("Vez do jogador 1 (X): ");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2 (O): ");
                sinal = 'O';
            }

            //Enquanto a 'linhaValida' for falsa, irá pedir para o jogador o número
            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha (1,2 ou 3): ");
                linha = scanner.nextInt();
                System.out.println("Entre com a coluna (1,2 ou 3): ");
                coluna = scanner.nextInt();

                //Se os valores que o usuário digitou estiverem no range 1-3 dará continuidade ao jogo
                if (linha >= 1 && linha <= 3 && coluna >= 1 && coluna <= 3) {
                    if (jogoDaVelha[linha - 1][coluna - 1] == 0) {
                        jogoDaVelha[linha - 1][coluna - 1] = sinal;
                        linhaValida = true;
                    } else {
                        System.out.print("Essa posição já está ocupada! Tente novamente");
                    }
                } else {
                    System.out.println("Entrada inválida! Digite números entre 1 e 3");
                }
            }

            //Impressão do jogo de tabuleiro
            for (int i = 0; i < jogoDaVelha.length; i++) {
                for (int j = 0; j < jogoDaVelha[i].length; j++) {
                    char impressao = (jogoDaVelha[i][j] == 0) ? '-' : jogoDaVelha[i][j];
                    System.out.print(impressao + " | ");
                }
                System.out.println();
            }


            //expressão para verificar se o jogador ganhou
            if ((jogoDaVelha[0][0] == sinal && jogoDaVelha[0][1] == sinal && jogoDaVelha[0][2] == sinal) ||
                (jogoDaVelha[1][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[1][2] == sinal) ||
                (jogoDaVelha[2][0] == sinal && jogoDaVelha[2][1] == sinal && jogoDaVelha[2][2] == sinal) ||

                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][0] == sinal && jogoDaVelha[2][0] == sinal) ||
                (jogoDaVelha[0][1] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][1] == sinal) ||
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][2] == sinal && jogoDaVelha[2][2] == sinal) ||

                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][2] == sinal) ||
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][0] == sinal)) {

                ganhou = true;
                System.out.println("Parabéns! O jogador " + sinal + "venceu!");
            } else if (jogada == 9) {
                System.out.println("Deu velha! Ninguém ganhou.");
            }
            jogada++;
        }
    }
}
