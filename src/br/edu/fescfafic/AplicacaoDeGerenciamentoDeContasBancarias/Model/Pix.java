package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IPix;

public class Pix implements IPix {
    private int id;
    private String chaveDestino;
    private double valor;

    public Pix(int id, String chaveDestino, double valor) {
        this.id = id;
        this.chaveDestino = chaveDestino;
        this.valor = valor;
    }
    @Override
    public int getIdPix(){
        return id;
    }
    @Override
    public String getChaveDestino() {
        return chaveDestino;
    }
    @Override
    public double getValor() {
        return valor;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Pix{" +
                "id=" + id +
                ", chaveDestino='" + chaveDestino + '\'' +
                ", valor=" + valor +
                '}';
    }
}
