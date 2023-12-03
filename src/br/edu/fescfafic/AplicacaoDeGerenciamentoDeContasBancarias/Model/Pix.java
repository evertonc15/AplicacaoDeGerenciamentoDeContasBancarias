package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

public class Pix {

    private int id;
    private String chaveDestino;
    private double valor;

    public Pix(int id, String chaveDestino, double valor) {
        this.id = id;
        this.chaveDestino = chaveDestino;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChaveDestino() {
        return chaveDestino;
    }

    public void setChaveDestino(String chaveDestino) {
        this.chaveDestino = chaveDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
