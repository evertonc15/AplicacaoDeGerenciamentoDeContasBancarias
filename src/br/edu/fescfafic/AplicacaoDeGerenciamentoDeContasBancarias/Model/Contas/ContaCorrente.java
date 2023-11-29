package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Contas;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers.ContaCController;

public class ContaCorrente extends ContaCController {
    private int numeroDaConta;
    public ContaCorrente(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }
}
