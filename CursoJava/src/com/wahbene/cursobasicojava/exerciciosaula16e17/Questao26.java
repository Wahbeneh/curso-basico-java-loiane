package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao26 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cd1 = 0, cd2 = 0, cd3 = 0, eleitores;

        System.out.print("Digite o número de eleitores: ");
        eleitores = ler.nextInt();

        for(int i = 0; i < eleitores; i++) {

            System.out.print("Digite o código do candidato (1, 2 ou 3): ");
            int voto = ler.nextInt();

            if (voto == 1) {
                    cd1++;
            } else if (voto == 2) {
                    cd2++;
            } else if (voto == 3) {
                    cd3++;
            } else {
                    System.out.println("Voto inválido. Tente novamente.");
                    i--;
            }
        }
        System.out.print("Resultados da votação: \nCandidato 1: " + cd1 + "\nCandidato 2: " + cd2 + "\nCandidato 3: " + cd3);
    }
}
