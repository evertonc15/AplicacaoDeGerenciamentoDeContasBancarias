package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model;

public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int id;

    public Pessoa(String nome, String sobrenome, String cpf, int id){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.id = id;
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
