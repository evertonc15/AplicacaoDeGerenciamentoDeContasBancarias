package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

public abstract class Pessoa {
    public String nome;
    public String sobrenome;
    public String cpf;
    public Pessoa(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
