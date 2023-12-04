package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

public abstract class Funcionario extends Pessoa {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroDeAcesso() {
        return numeroDeAcesso;
    }

    public void setNumeroDeAcesso(String numeroDeAcesso) {
        this.numeroDeAcesso = numeroDeAcesso;
    }

    private String numeroDeAcesso;

    public Funcionario(String nome, String sobrenome, String cpf, int id, String numeroDeAcesso) {
        super(nome, sobrenome, cpf);
        this.id = id;
        this.numeroDeAcesso = numeroDeAcesso;
    }
}
