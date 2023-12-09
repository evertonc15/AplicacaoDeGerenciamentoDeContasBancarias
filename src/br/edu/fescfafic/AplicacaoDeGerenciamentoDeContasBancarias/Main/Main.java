package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Main;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers.*;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaController pessoa = new PessoaController();
        ContaPController contaPController = new ContaPController();
        ContaCController contaCController = new ContaCController();
        PixController pixController = new PixController();
        TransferenciaController transferenciaController = new TransferenciaController();
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
                    while (condicaoParadaPessoa){
                        boolean parar = true;
                        while (parar){
                            Pessoa.exibirMenu();
                            int escolha = scanner.nextInt();
                            switch (escolha){
                                case 0 -> parar = false;
                                case 1 -> {
                                    exibirMenu();
                                    int opcaoPessoa = scanner.nextInt();
                                    switch (opcaoPessoa){
                                        case 0 -> condicaoParadaPessoa = false;
                                        case 1 -> {
                                            System.out.println("Digite o nome: ");
                                            String nome = scanner.next();
                                            System.out.println("Digite o sobrenome: ");
                                            String sobrenome = scanner.next();
                                            System.out.println("Digite o numero do cpf: ");
                                            String cpf = scanner.next();
                                            System.out.println("Digite seu id: ");
                                            int idPessoa = scanner.nextInt();
                                            System.out.println("Digite o numero de Acesso: ");
                                            String numeroDeAcesso = scanner.next();
                                            Pessoa gerente = new Gerente(nome, sobrenome, cpf, idPessoa, numeroDeAcesso);

                                        }
                                        case 2 -> System.out.println(pessoa.listarTudoCRUD());
                                        case 3 -> {
                                            System.out.print("Digite o ID que deseja buscar: ");
                                            int idGerenteBuscar = scanner.nextInt();
                                            System.out.println(pessoa.buscar(idGerenteBuscar));
                                        }
                                    }
                                }
                            }

                        }
                    }
                }
                case 3 -> {
                    boolean condicaoParadaCP = true;
                    while (condicaoParadaCP){
                        exibirMenu();
                        int opcaoCP = scanner.nextInt();
                        switch (opcaoCP){
                            case 0 -> condicaoParadaCP = false;
                            case 1 ->{
                                System.out.println("Digite o id da Conta: ");
                                int idCP = scanner.nextInt();
                                System.out.println("Digite o numero da Conta: ");
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
                                for(int i = 0; i < lista.size(); i++) {
                                    System.out.printf("id %d", i);
                                    System.out.println("-" + lista.get(i).toString());
                                }
                                System.out.print("Qual a CP que deseja deletar: ");
                                int idCPDelete = scanner.nextInt();
                                ContaPoupanca cp = contaPController.buscar(idCPDelete);
                                System.out.println(cp);
                                contaPController.deleteCRUD(cp);
                            }
                            case 5 -> {
                                ArrayList<ContaPoupanca> lista = contaPController.listarTudoCRUD();
                                for(int i = 0; i < lista.size(); i++) {
                                    System.out.printf("id %d", i);
                                    System.out.println("-" + lista.get(i).toString());
                                }
                                System.out.println("Qual a CP deseja editar: ");
                                int idCPUpdate = scanner.nextInt();
                                System.out.println("Digite o numero da Conta: ");
                                String numeroDaCP = scanner.next();
                                ContaPoupanca cp = new ContaPoupanca(idCPUpdate, numeroDaCP);
                                contaPController.updateCRUD(idCPUpdate, cp);
                            }
                            default -> {
                                System.out.println("Opcao Invalida!");
                                exibirMenuPrincipal();
                            }
                        }
                    }
                }
                case 4 -> {
                    boolean condicaoParadaCC = true;
                    while (condicaoParadaCC){
                        exibirMenu();
                        int opcaoCC = scanner.nextInt();
                        switch (opcaoCC){
                            case 0 -> condicaoParadaCC = false;
                            case 1 -> {
                                System.out.println("Digite o id da Conta: ");
                                int idCC = scanner.nextInt();
                                System.out.println("Digite o numero da Conta: ");
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
                                System.out.print("Qual a CC que deseja deletar: ");
                                int idCCDelete = scanner.nextInt();
                                ContaCorrente cc = contaCController.buscar(idCCDelete);
                                System.out.println(cc);
                                contaCController.deleteCRUD(cc);
                            }
                            case 5 -> {
                                ArrayList<ContaCorrente> lista = contaCController.listarTudoCRUD();
                                for(int i = 0; i < lista.size(); i++){
                                    System.out.printf("id %d", i);
                                    System.out.println("-" + lista.get(i).toString());
                                }
                                System.out.println("Qual a CC deseja editar: ");
                                int idCCUpdate = scanner.nextInt();
                                System.out.println("Digite o numero da Conta: ");
                                String numeroDaCC = scanner.next();
                                ContaCorrente cc = new ContaCorrente(idCCUpdate, numeroDaCC);
                                contaCController.updateCRUD(idCCUpdate, cc);
                            }
                            default -> {
                                System.out.println("Opcao Invalida!");
                                exibirMenuPrincipal();
                            }
                        }
                    }
                }
                case 5 -> {
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
                            case 3 ->{
                                System.out.print("Digite o ID que deseja buscar: ");
                                int idPixbuscar = scanner.nextInt();
                                System.out.println(pixController.buscar(idPixbuscar));
                            }
                            case 4 ->{
                                System.out.print("Qual o pix que deseja deletar: ");
                                int idPixDelete = scanner.nextInt();
                                Pix pix = pixController.buscar(idPixDelete);
                                System.out.println(pix);
                                pixController.deleteCRUD(pix);
                            }
                            case 5 ->{
                                ArrayList<Pix> lista = pixController.listarTudoCRUD();
                                for(int i = 0; i < lista.size(); i++) {
                                    System.out.printf("id %d", i);
                                    System.out.println("-" + lista.get(i).toString());
                                }
                                System.out.println(pixController.listarTudoCRUD());
                                System.out.println("Qual o Pix deseja editar: ");
                                int idPixUpdate = scanner.nextInt();
                                System.out.print("Digite a nova Chave de destino: ");
                                String chaveDestinoPix = scanner.next();
                                System.out.print("Digite o valor do pix: ");
                                double valorPix = scanner.nextDouble();
                                Pix pix = new Pix(idPixUpdate, chaveDestinoPix, valorPix);
                                pixController.updateCRUD(idPixUpdate, pix);
                            }
                            default -> {
                                System.out.println("Opcao Invalida!");
                                exibirMenuPrincipal();
                            }
                        }
                    }
                }
                case 6 -> {
                    boolean condicaoParadaTB = true;
                    while (condicaoParadaTB) {
                        exibirMenu();
                        int opcaoTB = scanner.nextInt();
                        switch (opcaoTB){
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
                                System.out.print("Qual a transferencia que deseja deletar: ");
                                int idTBDelete = scanner.nextInt();
                                TransferenciaBancaria tb = transferenciaController.buscar(idTBDelete);
                                System.out.println(tb);
                                transferenciaController.deleteCRUD(tb);
                            }
                            case 5 -> {
                                ArrayList<TransferenciaBancaria> lista = transferenciaController.listarTudoCRUD();
                                for(int i = 0; i < lista.size(); i++) {
                                    System.out.printf("id %d", i);
                                    System.out.println("-" + lista.get(i).toString());
                                }
                                System.out.println(transferenciaController.listarTudoCRUD());
                                System.out.println("Qual a Transferencia que deseja editar: ");
                                int idTBUpdate = scanner.nextInt();
                                System.out.print("Digite a nova Chave de destino: ");
                                String chaveDestinoTB = scanner.next();
                                System.out.print("Digite o valor da transferencia: ");
                                double valorTB = scanner.nextDouble();
                                TransferenciaBancaria tb = new TransferenciaBancaria(idTBUpdate, chaveDestinoTB, valorTB);
                                transferenciaController.updateCRUD(idTBUpdate, tb);
                            }
                            default -> {
                                System.out.println("Opcao Invalida!");
                                exibirMenuPrincipal();
                            }
                        }
                    }
                }
            }
        }
    }
    public static void exibirMenuPrincipal() {
        String texto = "";
        texto += "1 - Pessoa \n";
        texto += "2 - Funcionario \n";
        texto += "3 - Conta Poupanca \n";
        texto += "4 - Conta Corrente \n";
        texto += "5 - PIX \n";
        texto += "6 - Transferencia Bancaria \n";
        texto += "0 - Sair\n";

        System.out.println(texto);
    }
    public static void exibirMenu() {
        String texto = "";
        texto += "1 - Criar \n";
        texto += "2 - Listar \n";
        texto += "3 - Buscar \n";
        texto += "4 - Deletar \n";
        texto += "5 - Atualizar \n";
        texto += "0 - Voltar\n";

        System.out.println(texto);
    }
}