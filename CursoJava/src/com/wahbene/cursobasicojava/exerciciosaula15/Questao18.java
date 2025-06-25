package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia, mes, ano;
        boolean valido_d, valido_m,valido_a;

        System.out.print("Digite o dia: ");
        dia = ler.nextInt();

        System.out.print("Digite o mês: ");
        mes = ler.nextInt();

        System.out.print("Digite o ano: ");
        ano = ler.nextInt();

        if (dia >= 1 &&  dia <= 31){
            valido_d = true;
        } else {
            valido_d = false;
        }

        if (mes >= 1 && mes <= 12) {
            valido_m = true;
        } else {
            valido_m = false;
        }

        if (ano > 0 && ano <= 9999 ) {
            valido_a = true;
        } else {
            valido_a = false;
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia == 31) {
            valido_d = false;
        }

        if (valido_d && valido_m && valido_a) {
            System.out.print("Essa data é válida");
        } else {
            System.out.print("Essa data não é válida");
        }
    }
}
