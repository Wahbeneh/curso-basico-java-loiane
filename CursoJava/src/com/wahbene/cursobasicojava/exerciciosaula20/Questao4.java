package com.wahbene.cursobasicojava.exerciciosaula20;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] agenda = new String[31][24];
        String tarefa = "";
        int dia, horario, opcao;
        boolean validarinfos = true;


        /*Adicionar o while em todo o contexto do app para a persistência de dados*/

        do {
            System.out.print("\n--- Agenda Pessoal ---\n" +
                    "\n1 - Agendar tarefa" +
                    "\n2 - Consultar tarefa\n" +
                    "\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- AGENDAR TAREFA ---");
                    System.out.print("Informe o dia que deseja adicionar a tarefa: ");
                    dia = scanner.nextInt();
                    System.out.print("Informe o horário que deseja adicionar a tarefa: ");
                    horario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Qual tarefa deseja adicionar: ");
                    tarefa = scanner.nextLine();


                    while ((dia > 31 || dia < 0) || (horario > 24 || horario < 0)) {
                        validarinfos = false;

                        System.out.println("\nDia ou horário inválido!" +
                                "\nTente Novamente!");

                        System.out.println("\n--- AGENDAR TAREFA ---");
                        System.out.print("Informe o dia que deseja adicionar a tarefa: ");
                        dia = scanner.nextInt();
                        System.out.print("Informe o horário que deseja adicionar a tarefa: ");
                        horario = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Qual tarefa deseja adicionar: ");
                        tarefa = scanner.nextLine();

                        if ((dia > 0 && dia < 31) && (horario > 0 && horario < 24)) {
                            validarinfos = true;
                        }

                    }

                    if (validarinfos) {
                        if (agenda[dia - 1][horario] == null) {
                            agenda[dia - 1][horario] = tarefa;
                            System.out.println("\nTarefa '" + tarefa + "' adicionada com sucesso!");
                        } else {
                            System.out.println("\nVocê já possui uma tarefa nesse horário");
                        }

                        System.out.print("\n1 - Sair do sistema " +
                                "\n2 - Continuar (adicionar nova tarefa/consultar tarefa)" +
                                "\nSelecione uma opção: ");
                        opcao = scanner.nextInt();

                        if (opcao == 1) {
                            System.out.println("Saindo do sistema...");
                        }
                    }
                    break;


                case 2:
                    System.out.println("--- CONSULTAR TAREFA ---");
                    System.out.print("Informe o dia que deseja consultar a tarefa: ");
                    dia = scanner.nextInt();
                    System.out.print("Informe o horário que deseja consultar: ");
                    horario = scanner.nextInt();
                    scanner.nextLine();

                    if ((dia > 0 && dia < 31) && (horario > 0 && horario < 24)) {
                        validarinfos = true;
                    }

                    if (validarinfos) {
                        if (agenda[dia - 1][horario] != null) {
                            System.out.println("\nTarefa: '" + agenda[dia - 1][horario] + "'");
                        } else {
                            System.out.println("\nNão há tarefa registrada para esse horário");
                        }

                        System.out.print("\n1 - Sair do sistema " +
                                "\n2 - Continuar (adicionar nova tarefa/consultar tarefa)" +
                                "\nSelecione uma opção: ");
                        opcao = scanner.nextInt();

                        if (opcao == 1) {
                            System.out.println("Saindo do sistema...");
                        }
                        break;
                    }
            }

        } while (opcao != 1);
    }
}
