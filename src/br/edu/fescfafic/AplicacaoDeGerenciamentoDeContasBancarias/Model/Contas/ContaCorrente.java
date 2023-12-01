package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Contas;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers.ContaCController;

public class ContaCorrente extends ContaCController {
    public int idDaConta;
    public ContaCorrente(int numeroDaConta){
        this.idDaConta = numeroDaConta;
    }
    public int getIdDaConta() {
        return idDaConta;
    }
}
