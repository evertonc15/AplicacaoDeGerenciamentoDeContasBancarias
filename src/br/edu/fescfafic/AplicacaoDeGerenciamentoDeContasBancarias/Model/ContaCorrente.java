package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IContaCorrente;

public class ContaCorrente implements IContaCorrente {
    private int idDaConta;
    private String numeroDaConta;
    public ContaCorrente(int idDaConta, String numeroDaConta){
        this.idDaConta = idDaConta;
        this.numeroDaConta = numeroDaConta;
    }

    public void setIdDaConta(int idDaConta) {
        this.idDaConta = idDaConta;
    }
    @Override
    public int getidDaContaP() {
        return this.idDaConta;
    }
    @Override
    public void getNumeroDaContaC() {
        this.numeroDaConta = numeroDaConta;
    }
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    @Override
    public String toString() {
        return "ContaCorrente{" +
                "idDaConta=" + idDaConta +
                ", numeroDaConta='" + numeroDaConta + '\'' +
                '}';
    }
}
