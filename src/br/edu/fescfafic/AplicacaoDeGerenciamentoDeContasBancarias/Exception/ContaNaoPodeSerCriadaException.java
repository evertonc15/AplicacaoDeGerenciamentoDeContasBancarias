package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception;

public class ContaNaoPodeSerCriadaException extends RuntimeException{
    public ContaNaoPodeSerCriadaException(){
        super("ERRO > Conta nao pode ser criada.");
    }
}
