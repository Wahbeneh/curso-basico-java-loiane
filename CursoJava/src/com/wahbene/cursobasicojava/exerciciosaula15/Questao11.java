package com.wahbene.cursobasicojava.exerciciosaula15;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario, salarioReajustado, aumento = 0.00;
        int percentual;

        System.out.print("Por favor, digite seu salário: ");
        salario = ler.nextDouble();

        if (salario < 280) {
            aumento = salario * 0.2;
            percentual = 20;
        } else if (salario >= 280 && salario < 700) {
            aumento = salario * 0.15;
            percentual = 15;
        } else if (salario >= 700 && salario < 1500) {
            aumento = salario * 0.10;
            percentual = 10;
        } else {
            aumento = salario * 0.05;
            percentual = 5;
        }

        salarioReajustado = salario + aumento;
        System.out.print("Salário antes do reajuste: R$" + salario +
                "\nSalário pós-reajuste: " + salarioReajustado +
                "\nPercentual aplicado: " + percentual + "%" +
                "\nValor aumento: R$" + aumento);



    }
}
