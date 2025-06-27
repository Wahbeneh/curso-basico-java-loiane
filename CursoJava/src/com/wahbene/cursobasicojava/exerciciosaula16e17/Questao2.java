package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, senha;

        do {
            System.out.println("Digite o nome de usuário: ");
            nome = ler.next();

            System.out.println("Digite a senha: ");
            senha = ler.next();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Erro: O nome de usuário não pode ser igual à senha. Tente novamente.");
            } else {
                System.out.println("Usuário e senha cadastrados com sucesso!");
            }

        } while (nome.equals(senha));
    }
}
