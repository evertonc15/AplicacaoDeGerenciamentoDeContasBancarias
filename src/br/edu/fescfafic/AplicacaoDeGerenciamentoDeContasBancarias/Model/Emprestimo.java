package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IEmprestimo;

public class Emprestimo implements IEmprestimo {
    private int idDoEmprestimo;
    private double valorEmprestimo;
    private int prazoPagamento;
    public Emprestimo(int id, double valor, int prazo){
        this.idDoEmprestimo = id;
        this.valorEmprestimo = valor;
        this.prazoPagamento = prazo;
    }
    @Override
    public int getIdDoEmprestimo() {
        return this.idDoEmprestimo;
    }
    @Override
    public double getValorEmprestimo() {
        return this.valorEmprestimo;
    }
    @Override
    public int getPrazoPagamento() {
        return this.prazoPagamento;
    }
    public void setIdDoEmprestimo(int idDoEmprestimo) {
        this.idDoEmprestimo = idDoEmprestimo;
    }
    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }
    public void setPrazoPagamento(int prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }
    @Override
    public String toString() {
        return "Emprestimo{" +
                "idDoEmprestimo=" + idDoEmprestimo +
                ", valorEmprestimo=" + valorEmprestimo +
                ", prazoPagamento=" + prazoPagamento +
                '}';
    }
}
