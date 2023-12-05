package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Main;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers.*;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condicaoparada = true;
        ContaCController contaCController = new ContaCController();
        PixController pixController = new PixController();

        while (condicaoparada) {
            exibirMenu();
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 0 -> {
                    System.out.println("Programa Encerrado!");
                    condicaoparada = false;
                }
                case 1 -> {

                }
                case 2 -> {
                    boolean condicaoParadaCC = true;
                    while (condicaoParadaCC){
                        exibirMenuContaCorrente();
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
                                System.out.println(contaCController.listarTudoCRUD());
                                System.out.println("Qual a CC deseja editar: ");
                                int idCCUpdate = scanner.nextInt();
                                System.out.println("Digite o numero da Conta: ");
                                String numeroDaCC = scanner.next();
                                ContaCorrente cc = new ContaCorrente(idCCUpdate, numeroDaCC);
                                contaCController.updateCRUD(idCCUpdate, cc);
                            }
                            default -> {
                                System.out.println("Opcao Invalida!");
                                exibirMenu();
                            }
                        }
                    }
                }
                case 3 -> {
                    boolean condicaoParadaPix = true;
                    while (condicaoParadaPix) {
                        exibirMenuPix();
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
                                exibirMenu();}
                        }
                    }
                }
            }
        }
    }

    public static void exibirMenu() {
        String texto = new String();
        texto += "1 - Conta Poupanca \n";
        texto += "2 - Conta Corrente \n";
        texto += "3 - PIX \n";
        texto += "0 - Sair\n";

        System.out.println(texto);
    }
    public static  void exibirMenuContaCorrente(){
        String texto = new String();
        texto += "1 - Criar \n";
        texto += "2 - Listar \n";
        texto += "3 - Buscar \n";
        texto += "4 - Deletar \n";
        texto += "5 - Atualizar \n";
        texto += "0 - Voltar\n";
        System.out.println(texto);
    }
    public static void exibirMenuPix() {
        String texto = new String();
        texto += "1 - Criar \n";
        texto += "2 - Listar \n";
        texto += "3 - Buscar \n";
        texto += "4 - Deletar \n";
        texto += "5 - Atualizar \n";
        texto += "0 - Voltar\n";
        System.out.println(texto);
    }
}