package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String turno;

        System.out.println("Em que turno você estuda? M - Matutino V - Vespertino N - Noturno ");
        turno = ler.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia aluno!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde aluno!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite aluno!");
        } else {
            System.out.println("Turno não encontrado.");
        }
    }
}
