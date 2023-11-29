package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Utils;

public abstract class Pessoas {
    public String nome;
    public String sobrenome;
    public String cpf;
    public Pessoas(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
}
