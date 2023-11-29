package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Utils;

public abstract class Funcionarios extends Pessoas{
    public int id;
    public String numeroDeAcesso;

    public Funcionarios(String nome, String sobrenome, String cpf, int id, String numeroDeAcesso) {
        super(nome, sobrenome, cpf);
        this.id = id;
        this.numeroDeAcesso = numeroDeAcesso;
    }
}
