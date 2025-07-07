package com.wahbene.cursobasicojava.exerciciosaula16e17;

import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao, encerrar_operacao;
        double valor_nota, valor_troco = 0, valor_produto = 0, valor_total;
        System.out.println("Conveniências Sr. Manoel Joaquim");
        System.out.print("Digite '1' para iniciar: ");
        opcao = ler.nextInt();

        while (opcao != 1) {
            System.out.print("Opção Inválida! Tente novamente\nDigite '1' para iniciar: ");
            opcao = ler.nextInt();
        }

        if (opcao == 1) {
            do {
                System.out.println("Adicionar produtos - pressione '0' para encerrar a contagem");
                do {
                    System.out.print("Digite o valor do produto: ");
                    valor_produto = ler.nextDouble();
                    valor_total += valor_produto;
                } while (valor_produto != 0);
                System.out.print("Valor Total: " + valor_total + "\nInforme o valor da nota que o cliente entregou: ");
                valor_nota = ler.nextDouble();
                valor_troco = valor_nota - valor_total;
                System.out.println("LOJAS TABAJARA\nTotal: " + valor_total + "\nDinheiro: " + valor_nota + "\nTroco: " + Math.abs(valor_troco));
                System.out.print("Continuar novamente - Digite '100' para sair e 1000 para reiniciar: ");
                encerrar_operacao = ler.nextInt();
                while (encerrar_operacao != 100 && encerrar_operacao != 1000) {
                    System.out.print("Digite '100' para sair e 1000 para reiniciar: ");
                    encerrar_operacao = ler.nextInt();
                }
            } while (encerrar_operacao != 100);
        }
    }
}
