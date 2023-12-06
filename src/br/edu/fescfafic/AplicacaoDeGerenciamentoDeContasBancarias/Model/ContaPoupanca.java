package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IContaPoupanca;

public class ContaPoupanca implements IContaPoupanca {
    private int idDaConta;
    private String numeroDaConta;
    public ContaPoupanca(int idDaConta, String numeroDaConta){
        this.idDaConta = idDaConta;
        this.numeroDaConta = numeroDaConta;
    }
    @Override
    public int getidDaContaP() {
        return idDaConta;
    }

    @Override
    public String getNumeroDacontaP() {
        return numeroDaConta;
    }
    public void setIdDaConta(int idDaConta) {
        this.idDaConta = idDaConta;
    }
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "idDaConta=" + idDaConta +
                ", numeroDaConta='" + numeroDaConta + '\'' +
                '}';
    }
}
