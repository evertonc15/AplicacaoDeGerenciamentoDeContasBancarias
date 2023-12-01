package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception;

public class ContaNaoExisteException extends RuntimeException{
    public ContaNaoExisteException(){
        super("ERRO > Conta nao existe.");
    }
}
