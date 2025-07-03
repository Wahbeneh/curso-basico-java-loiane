package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int npessoas, idade,jovem = 0, adulta= 0, idosa = 0;

        System.out.print("Digite quantas pessoas irão fazer a verificação: ");
        npessoas = ler.nextInt();

        for (int i = 0; i < npessoas; i++){
            System.out.print("Digite a idade da " + (i+1) + " pessoa: ");
            idade = ler.nextInt();

            if (idade >= 0 && idade <= 25){
                jovem += 1;
            };
            if (idade >= 26 && idade <= 60) {
                adulta += 1;
            };
            if (idade > 60) {
                idosa += 1;
            };
        }

        System.out.print("Resultados das " + npessoas + " pessoas verificadas\nJovem: " + jovem +
                         "\nAdulta: " + adulta + "\nIdosa: " + idosa);

    }
}
