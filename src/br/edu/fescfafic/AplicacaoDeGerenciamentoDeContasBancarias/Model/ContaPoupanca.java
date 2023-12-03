package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers.ContaPController;

public class ContaPoupanca extends ContaPController {
    private int idDaConta;
    public ContaPoupanca(int numeroDaConta){
        this.idDaConta = numeroDaConta;
    }
    public int getIdDaConta() {
        return idDaConta;
    }
    public void setIdDaConta(int idDaConta) {
        this.idDaConta = idDaConta;
    }
}
