package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Main;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers.PixController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Pix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condicaoparada = true;

        PixController pixController = new PixController();

        while (condicaoparada) {
            exibirMenu();
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 0 -> condicaoparada = false;
                case 1 -> {
                    boolean condicaoparadaPix = true;
                    while (condicaoparadaPix) {
                        exibirMenuPix();
                        int opcaoPix = scanner.nextInt();
                        switch (opcaoPix) {
                            case 0 -> condicaoparadaPix = false;
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
                            case 2 -> {
                                System.out.print(pixController.listarTudoCRUD());
                            }
                            case 3 ->{
                                System.out.print("Digite o ID que deseja buscar: ");
                                int idPixbuscar = scanner.nextInt();
                                System.out.println(pixController.buscar(idPixbuscar));
                            }
                            case 4 ->{
                                System.out.print("Qual o pix que deseja deletar: ");
                                int idPixDelete = scanner.nextInt();
                                System.out.println(pixController.buscar(idPixDelete));
                                pixController.deleteCRUD(idPixDelete);
                            }
                            case 5 ->{
                                System.out.println("Qual o id do pix deseja modificar: ");
                                int index = scanner.nextInt();
                                Pix pix = new Pix(index, );
                                System.out.println(pixController.updateCRUD(index, pix);
                            } default -> exibirMenu();
                        }
                    }
                }
            }
        }
    }

    public static void exibirMenu() {
        String texto = new String();

        texto += "1 - PIX \n";
        texto += "0 - Sair\n";

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