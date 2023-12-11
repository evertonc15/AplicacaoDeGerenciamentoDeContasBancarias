package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Main;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers.*;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaController pessoaController = new PessoaController();
        ContaPController contaPController = new ContaPController();
        ContaCController contaCController = new ContaCController();
        PixController pixController = new PixController();
        TransferenciaController transferenciaController = new TransferenciaController();
        EmprestimoController emprestimoController = new EmprestimoController();
        boolean condicaoparada = true;
        while (condicaoparada) {
            exibirMenuPrincipal();
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 0 -> {
                    System.out.println("Programa Encerrado!");
                    condicaoparada = false;
                }
                case 1 -> {
                    boolean condicaoParadaPessoa = true;
                    while (condicaoParadaPessoa) {
                        boolean condicaoParadaGerente = true;
                        Pessoa.exibirMenu();
                        int escolha = scanner.nextInt();
                        switch (escolha) {
                            case 0 -> condicaoParadaPessoa = false;
                            case 1 -> {
                                while (condicaoParadaGerente) {
                                    exibirMenu();
                                    int opcaoGerente = scanner.nextInt();
                                    switch (opcaoGerente) {
                                        case 0 -> condicaoParadaGerente = false;
                                        case 1 -> {
                                            System.out.print("Digite o nome: ");
                                            String nome = scanner.next();
                                            System.out.print("Digite o sobrenome: ");
                                            String sobrenome = scanner.next();
                                            System.out.print("Digite o numero do cpf: ");
                                            String cpf = scanner.next();
                                            System.out.print("Digite seu id: ");
                                            int idPessoa = scanner.nextInt();
                                            System.out.print("Digite o numero de Acesso: ");
                                            String numeroDeAcesso = scanner.next();
                                            Pessoa gerente = new Gerente(nome, sobrenome, cpf, idPessoa, numeroDeAcesso);
                                            pessoaController.createCRUD(gerente);
                                        }
                                        case 2 -> System.out.println(pessoaController.listarTudoCRUD());
                                        case 3 -> {
                                            System.out.print("Digite o ID que deseja buscar: ");
                                            int idGerenteBuscar = scanner.nextInt();
                                            System.out.println(pessoaController.buscar(idGerenteBuscar));
                                        }
                                        case 4 -> {
                                            ArrayList<Pessoa> lista = pessoaController.listarTudoCRUD();
                                            for (Pessoa pessoa : lista) {
                                                System.out.println(pessoa.toString());
                                            }
                                            System.out.print("Qual o id que deseja deletar: ");
                                            int idGerenteDelete = scanner.nextInt();
                                            Pessoa gerente = pessoaController.buscar(idGerenteDelete);
                                            System.out.println(gerente);
                                            pessoaController.deleteCRUD(gerente);
                                        }
                                        case 5 -> {
                                            ArrayList<Pessoa> lista = pessoaController.listarTudoCRUD();
                                            for (int i = 0; i < lista.size(); i++) {
                                                System.out.printf("index %d", i);
                                                System.out.println(" - " + lista.get(i).toString());
                                            }
                                            System.out.print("Digite o index que deseja atualizar: ");
                                            int idGerenteUpdate = scanner.nextInt();
                                            System.out.print("Digite o nome: ");
                                            String nome = scanner.next();
                                            System.out.print("Digite o sobrenome: ");
                                            String sobrenome = scanner.next();
                                            System.out.print("Digite o numero do cpf: ");
                                            String cpf = scanner.next();
                                            System.out.print("Digite seu id: ");
                                            int idGerente = scanner.nextInt();
                                            System.out.print("Digite o numero de Acesso: ");
                                            String numeroDeAcesso = scanner.next();
                                            Pessoa gerente = new Gerente(nome, sobrenome, cpf, idGerente, numeroDeAcesso);
                                            pessoaController.updateCRUD(idGerenteUpdate, gerente);
                                        }
                                        default -> System.out.println("Opcao Invalida!");
                                    }
                                }

                            }
                            case 2 -> {
                                boolean condicaoParadaAssistente = true;
                                while (condicaoParadaAssistente) {
                                    exibirMenu();
                                    int opcaoAssistente = scanner.nextInt();
                                    switch (opcaoAssistente) {
                                        case 0 -> condicaoParadaAssistente = false;
                                        case 1 -> {
                                            System.out.print("Digite o nome: ");
                                            String nome = scanner.next();
                                            System.out.print("Digite o sobrenome: ");
                                            String sobrenome = scanner.next();
                                            System.out.print("Digite o numero do cpf: ");
                                            String cpf = scanner.next();
                                            System.out.print("Digite seu id: ");
                                            int idAssistente = scanner.nextInt();
                                            System.out.print("Digite o numero de Acesso: ");
                                            String numeroDeAcesso = scanner.next();
                                            Pessoa assistente = new Assistentes(nome, sobrenome, cpf, idAssistente, numeroDeAcesso);
                                            pessoaController.createCRUD(assistente);
                                        }
                                        case 2 -> System.out.println(pessoaController.listarTudoCRUD());
                                        case 3 -> {
                                            System.out.print("Digite o ID que deseja buscar: ");
                                            int idAssistenteBuscar = scanner.nextInt();
                                            System.out.println(pessoaController.buscar(idAssistenteBuscar));
                                        }
                                        case 4 -> {
                                            ArrayList<Pessoa> lista = pessoaController.listarTudoCRUD();
                                            for (Pessoa pessoa : lista) {
                                                System.out.println(pessoa.toString());
                                            }
                                            System.out.print("Qual o id que deseja deletar: ");
                                            int idAssistenteDelete = scanner.nextInt();
                                            Pessoa assistente = pessoaController.buscar(idAssistenteDelete);
                                            System.out.println(assistente);
                                            pessoaController.deleteCRUD(assistente);
                                        }
                                        case 5 -> {
                                            ArrayList<Pessoa> lista = pessoaController.listarTudoCRUD();
                                            for (int i = 0; i < lista.size(); i++) {
                                                System.out.printf("index %d", i);
                                                System.out.println(" - " + lista.get(i).toString());
                                            }
                                            System.out.print("Digite o index que deseja atualizar: ");
                                            int idAssistenteUpdate = scanner.nextInt();
                                            System.out.print("Digite o nome: ");
                                            String nome = scanner.next();
                                            System.out.print("Digite o sobrenome: ");
                                            String sobrenome = scanner.next();
                                            System.out.print("Digite o numero do cpf: ");
                                            String cpf = scanner.next();
                                            System.out.print("Digite seu id: ");
                                            int idAssistente = scanner.nextInt();
                                            System.out.print("Digite o numero de Acesso: ");
                                            String numeroDeAcesso = scanner.next();
                                            Pessoa assistente = new Assistentes(nome, sobrenome, cpf, idAssistente, numeroDeAcesso);
                                            pessoaController.updateCRUD(idAssistenteUpdate, assistente);
                                        }
                                        default -> System.out.println("Opcao Invalida!");
                                    }
                                }
                            }
                            default -> System.out.println("Opcao Invalida!");
                        }

                    }
                }
                case 2 -> {
                    boolean condicaoParadaCP = true;
                    while (condicaoParadaCP) {
                        exibirMenu();
                        int opcaoCP = scanner.nextInt();
                        switch (opcaoCP) {
                            case 0 -> condicaoParadaCP = false;
                            case 1 -> {
                                System.out.print("Digite o id da Conta: ");
                                int idCP = scanner.nextInt();
                                System.out.print("Digite o numero da Conta: ");
                                String numeroDaCP = scanner.next();
                                ContaPoupanca cp = new ContaPoupanca(idCP, numeroDaCP);
                                contaPController.createCRUD(cp);
                            }
                            case 2 -> System.out.println(contaPController.listarTudoCRUD());
                            case 3 -> {
                                System.out.print("Digite o ID que deseja buscar: ");
                                int idCPBuscar = scanner.nextInt();
                                System.out.println(contaPController.buscar(idCPBuscar));
                            }
                            case 4 -> {
                                ArrayList<ContaPoupanca> lista = contaPController.listarTudoCRUD();
                                for (ContaPoupanca contaPoupanca : lista) {
                                    System.out.println(contaPoupanca.toString());
                                }
                                System.out.print("Qual o id que deseja deletar: ");
                                int idCPDelete = scanner.nextInt();
                                ContaPoupanca cp = contaPController.buscar(idCPDelete);
                                System.out.println(cp);
                                contaPController.deleteCRUD(cp);
                            }
                            case 5 -> {
                                ArrayList<ContaPoupanca> lista = contaPController.listarTudoCRUD();
                                for (int i = 0; i < lista.size(); i++) {
                                    System.out.printf("index %d", i);
                                    System.out.println(" - " + lista.get(i).toString());
                                }
                                System.out.print("Qual o index deseja editar: ");
                                int idCPUpdate = scanner.nextInt();
                                System.out.print("Digite o id da Conta: ");
                                int idCP = scanner.nextInt();
                                System.out.print("Digite o numero da Conta: ");
                                String numeroDaCP = scanner.next();
                                ContaPoupanca cp = new ContaPoupanca(idCP, numeroDaCP);
                                contaPController.updateCRUD(idCPUpdate, cp);
                            }
                            default -> System.out.println("Opcao Invalida!");
                        }
                    }
                }
                case 3 -> {
                    boolean condicaoParadaCC = true;
                    while (condicaoParadaCC) {
                        exibirMenu();
                        int opcaoCC = scanner.nextInt();
                        switch (opcaoCC) {
                            case 0 -> condicaoParadaCC = false;
                            case 1 -> {
                                System.out.print("Digite o id da Conta: ");
                                int idCC = scanner.nextInt();
                                System.out.print("Digite o numero da Conta: ");
                                String numeroDaCC = scanner.next();
                                ContaCorrente cc = new ContaCorrente(idCC, numeroDaCC);
                                contaCController.createCRUD(cc);
                            }
                            case 2 -> System.out.println(contaCController.listarTudoCRUD());
                            case 3 -> {
                                System.out.print("Digite o ID que deseja buscar: ");
                                int idCCbuscar = scanner.nextInt();
                                System.out.println(contaCController.buscar(idCCbuscar));
                            }
                            case 4 -> {
                                ArrayList<ContaCorrente> lista = contaCController.listarTudoCRUD();
                                for (ContaCorrente contaCorrente : lista) {
                                    System.out.println(contaCorrente.toString());
                                }
                                System.out.print("Qual o id que deseja deletar: ");
                                int idCCDelete = scanner.nextInt();
                                ContaCorrente cc = contaCController.buscar(idCCDelete);
                                System.out.println(cc);
                                contaCController.deleteCRUD(cc);
                            }
                            case 5 -> {
                                ArrayList<ContaCorrente> lista = contaCController.listarTudoCRUD();
                                for (int i = 0; i < lista.size(); i++) {
                                    System.out.printf("index %d", i);
                                    System.out.println(" - " + lista.get(i).toString());
                                }
                                System.out.print("Qual o index deseja editar: ");
                                int idCCUpdate = scanner.nextInt();
                                System.out.print("Digite o id da conta: ");
                                int idCC = scanner.nextInt();
                                System.out.print("Digite o numero da Conta: ");
                                String numeroDaCC = scanner.next();
                                ContaCorrente cc = new ContaCorrente(idCC, numeroDaCC);
                                contaCController.updateCRUD(idCCUpdate, cc);
                            }
                            default -> System.out.println("Opcao Invalida!");
                        }
                    }
                }
                case 4 -> {
                    boolean condicaoParadaPix = true;
                    while (condicaoParadaPix) {
                        exibirMenu();
                        int opcaoPix = scanner.nextInt();
                        switch (opcaoPix) {
                            case 0 -> condicaoParadaPix = false;
                            case 1 -> {
                                System.out.print("Digite o ID do PIX: ");
                                int idPix = scanner.nextInt();
                                System.out.print("Digite a Chave de destino: ");
                                String chaveDestinoPix = scanner.next();
                                System.out.print("Digite o valor do pix: ");
                                double valorPix = scanner.nextDouble();
                                Pix pix = new Pix(idPix, chaveDestinoPix, valorPix);
                                pixController.createCRUD(pix);
                            }
                            case 2 -> System.out.print(pixController.listarTudoCRUD());
                            case 3 -> {
                                System.out.print("Digite o ID que deseja buscar: ");
                                int idPixbuscar = scanner.nextInt();
                                System.out.println(pixController.buscar(idPixbuscar));
                            }
                            case 4 -> {
                                ArrayList<Pix> lista = pixController.listarTudoCRUD();
                                for (Pix pix : lista) {
                                    System.out.println(pix.toString());
                                }
                                System.out.print("Qual o id que deseja deletar: ");
                                int idPixDelete = scanner.nextInt();
                                Pix pix = pixController.buscar(idPixDelete);
                                System.out.println(pix);
                                pixController.deleteCRUD(pix);
                            }
                            case 5 -> {
                                ArrayList<Pix> lista = pixController.listarTudoCRUD();
                                for (int i = 0; i < lista.size(); i++) {
                                    System.out.printf("index %d", i);
                                    System.out.println(" - " + lista.get(i).toString());
                                }
                                System.out.print("Qual o Pix deseja editar: ");
                                int idPixUpdate = scanner.nextInt();
                                System.out.print("Qual o id do pix: ");
                                int idPix = scanner.nextInt();
                                System.out.print("Digite a nova Chave de destino: ");
                                String chaveDestinoPix = scanner.next();
                                System.out.print("Digite o valor do pix: ");
                                double valorPix = scanner.nextDouble();
                                Pix pix = new Pix(idPix, chaveDestinoPix, valorPix);
                                pixController.updateCRUD(idPixUpdate, pix);
                            }
                            default -> System.out.println("Opcao Invalida!");
                        }
                    }
                }
                case 5 -> {
                    boolean condicaoParadaTB = true;
                    while (condicaoParadaTB) {
                        exibirMenu();
                        int opcaoTB = scanner.nextInt();
                        switch (opcaoTB) {
                            case 0 -> condicaoParadaTB = false;
                            case 1 -> {
                                System.out.print("Digite o ID da Transferencia: ");
                                int idTB = scanner.nextInt();
                                System.out.print("Digite a Chave de destino: ");
                                String chaveDestinoTB = scanner.next();
                                System.out.print("Digite o valor da transferencia: ");
                                double valorTB = scanner.nextDouble();
                                TransferenciaBancaria tb = new TransferenciaBancaria(idTB, chaveDestinoTB, valorTB);
                                transferenciaController.createCRUD(tb);
                            }
                            case 2 -> System.out.println(transferenciaController.listarTudoCRUD());
                            case 3 -> {
                                System.out.print("Digite o ID que deseja buscar: ");
                                int idTBBuscar = scanner.nextInt();
                                System.out.println(transferenciaController.buscar(idTBBuscar));
                            }
                            case 4 -> {
                                ArrayList<TransferenciaBancaria> lista = transferenciaController.listarTudoCRUD();
                                for (TransferenciaBancaria tb : lista) {
                                    System.out.println(tb.toString());
                                }
                                System.out.print("Qual o id que deseja deletar: ");
                                int idTBDelete = scanner.nextInt();
                                TransferenciaBancaria tb = transferenciaController.buscar(idTBDelete);
                                System.out.println(tb);
                                transferenciaController.deleteCRUD(tb);
                            }
                            case 5 -> {
                                ArrayList<TransferenciaBancaria> lista = transferenciaController.listarTudoCRUD();
                                for (int i = 0; i < lista.size(); i++) {
                                    System.out.printf("index %d", i);
                                    System.out.println(" - " + lista.get(i).toString());
                                }
                                System.out.print("Qual o index que deseja editar: ");
                                int idTBUpdate = scanner.nextInt();
                                System.out.print("Qual o id da transferencia: ");
                                int idTB = scanner.nextInt();
                                System.out.print("Digite a nova Chave de destino: ");
                                String chaveDestinoTB = scanner.next();
                                System.out.print("Digite o valor da transferencia: ");
                                double valorTB = scanner.nextDouble();
                                TransferenciaBancaria tb = new TransferenciaBancaria(idTB, chaveDestinoTB, valorTB);
                                transferenciaController.updateCRUD(idTBUpdate, tb);
                            }
                            default -> System.out.println("Opcao Invalida!");
                        }
                    }
                }
                case 6 -> {
                    boolean condicaoParadaEmprestimo = true;
                    while (condicaoParadaEmprestimo) {
                        exibirMenu();
                        int opcaoEmp = scanner.nextInt();
                        switch (opcaoEmp) {
                            case 0 -> condicaoParadaEmprestimo = false;
                            case 1 -> {
                                System.out.print("Digite o ID do Emprestimo: ");
                                int idEmp = scanner.nextInt();
                                System.out.print("Digite o valor do emprestimo: ");
                                double valorEmp = scanner.nextDouble();
                                System.out.print("Digite o total de parcelas: ");
                                int parcelas = scanner.nextInt();
                                Emprestimo emprestimo = new Emprestimo(idEmp, valorEmp, parcelas);
                                emprestimoController.createCRUD(emprestimo);
                            }
                            case 2 -> System.out.println(emprestimoController.listarTudoCRUD());
                            case 3 -> {
                                System.out.print("Digite o ID que deseja buscar: ");
                                int idEmpBuscar = scanner.nextInt();
                                System.out.println(emprestimoController.buscar(idEmpBuscar));
                            }
                            case 4 -> {
                                ArrayList<Emprestimo> lista = emprestimoController.listarTudoCRUD();
                                for (Emprestimo emprestimo : lista) {
                                    System.out.println(emprestimo.toString());
                                }
                                System.out.print("Qual o id que deseja deletar: ");
                                int idEmpDelete = scanner.nextInt();
                                Emprestimo emprestimo = emprestimoController.buscar(idEmpDelete);
                                System.out.println(emprestimo);
                                emprestimoController.deleteCRUD(emprestimo);
                            }
                            case 5 -> {
                                ArrayList<Emprestimo> lista = emprestimoController.listarTudoCRUD();
                                for (int i = 0; i < lista.size(); i++) {
                                    System.out.printf("index %d", i);
                                    System.out.println(" - " + lista.get(i).toString());
                                }
                                System.out.print("Qual o index que deseja editar: ");
                                int idEmpUpdate = scanner.nextInt();
                                System.out.print("Digite o id do emprestimo: ");
                                int idEmp = scanner.nextInt();
                                System.out.print("Digite o valor da emprestimo: ");
                                double valorEmp = scanner.nextDouble();
                                System.out.print("Digite o total de parcelas: ");
                                int parcelas = scanner.nextInt();
                                Emprestimo emprestimo = new Emprestimo(idEmp, valorEmp, parcelas);
                                emprestimoController.updateCRUD(idEmpUpdate, emprestimo);
                            }
                            default -> System.out.println("Opcao Invalida!");
                        }
                    }
                }
                default -> System.out.println("Opcao Invalida!");
            }
        }
    }

    public static void exibirMenuPrincipal() {
        String texto = "";
        texto += "1 - Pessoa \n";
        texto += "2 - Conta Poupanca \n";
        texto += "3 - Conta Corrente \n";
        texto += "4 - PIX \n";
        texto += "5 - Transferencia Bancaria \n";
        texto += "6 - Emprestimo \n";
        texto += "0 - Sair\n";

        System.out.println(texto);
    }

    public static void exibirMenu() {
        String texto = "";
        System.out.println();
        texto += "1 - Criar \n";
        texto += "2 - Listar \n";
        texto += "3 - Buscar \n";
        texto += "4 - Deletar \n";
        texto += "5 - Atualizar \n";
        texto += "0 - Voltar\n";

        System.out.println(texto);
    }
}