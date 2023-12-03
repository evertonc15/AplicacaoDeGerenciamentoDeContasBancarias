package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

public abstract class Funcionarios extends Pessoa {
    public int id;
    public String numeroDeAcesso;

    public Funcionarios(String nome, String sobrenome, String cpf, int id, String numeroDeAcesso) {
        super(nome, sobrenome, cpf);
        this.id = id;
        this.numeroDeAcesso = numeroDeAcesso;
    }
}
