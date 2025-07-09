package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao38 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario_ini = 1000, aumento = 0.015, novo_sal = 0;
        int ano = 1995, ano_user;

        System.out.print("Verificar salário até o ano: ");
        ano_user = ler.nextInt();

        while (ano > ano_user) {
            System.out.println("Ano inicial não pode ser maior que o ano final, digite novamente: ");
            ano_user = ler.nextInt();
        }

        for (int i = ano; i <= ano_user; i++ ) {
            if (i == 1996) {
                novo_sal = salario_ini + (salario_ini * 0.015) ;
            }
            if (i >= 1997) {
                novo_sal += (salario_ini * aumento);
                aumento *= 2;
            }
        }

        System.out.println(novo_sal);

    }
}
