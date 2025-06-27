package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao3 {

    public static String nome;
    public static int idade;
    public static double salario;
    public static char sexo;
    public static char estadoCivil;


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        do {
            System.out.println("Digite seu nome: ");
            nome = ler.next();

            if(nome.length() < 3) {
                System.out.println("Nome deve ter pelo menos 3 caracteres. Tente novamente.");
            }

        } while (nome.length() < 3);

        do {
            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida. Deve ser entre 0 e 150. Tente novamente.");
            }

        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Digite seu salário: ");
            salario = ler.nextDouble();

            if (salario < 0) {
                System.out.println("Salário inválido. Deve ser um valor positivo. Tente novamente.");
            }

        } while (salario < 0);

        do {
            System.out.println("Digite seu sexo (M/F): ");
            sexo = ler.next().toUpperCase().charAt(0);

            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo inválido. Deve ser M ou F. Tente novamente.");
            }

        } while (sexo != 'M' && sexo != 'F');

        do {
            System.out.print("Digite seu estado civil\nS - Solteiro\nC - Casado\nV - Viúvo\nD - Divorciado\n\n Sua opção: ");
            estadoCivil = ler.next().toUpperCase().charAt(0);

            if (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D'){
                System.out.print("Estado Civil inválido. Tente novamente");
            }
        } while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D');
    }
}
