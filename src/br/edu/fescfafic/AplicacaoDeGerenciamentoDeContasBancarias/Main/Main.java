package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Main;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers.ContaCController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Contas.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente p1 = new ContaCorrente(
                101
        );
        ContaCController conta1 = new ContaCController();
        conta1.createCRUD(p1);
    }
}