package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.ITransferenciaBancaria;

public class TransferenciaBancaria implements ITransferenciaBancaria {
    private int id;
    private String destino;
    private double valor;
    public TransferenciaBancaria(int id, String destino, double valor) {
        this.id = id;
        this.destino = destino;
        this.valor = valor;
    }
    @Override
    public int getId() {
        return this.id;
    }
    @Override
    public String getDestino() {
        return this.destino;
    }
    @Override
    public double getValor() {
        return this.valor;
    }
}
