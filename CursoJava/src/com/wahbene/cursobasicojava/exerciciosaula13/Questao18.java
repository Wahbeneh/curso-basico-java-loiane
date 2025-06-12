package com.wahbene.cursobasicojava.exerciciosaula13;

import java.util.Scanner;

/**
 * Faça um programa que calcule o tempo de uma arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado do download do arquivo usando este link (em minutos). - 12/06/25
 */

public class Questao18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double tamArquivo, velInternet;

        System.out.print("Entre com o tamanho do arquivo: ");
        tamArquivo = ler.nextDouble();

        System.out.print("Entre com a velocidade da internet: ");
        velInternet = ler.nextDouble();

        double tempo = tamArquivo/velInternet;

        System.out.println("Tempo de download é de " + tempo);
    }
}
