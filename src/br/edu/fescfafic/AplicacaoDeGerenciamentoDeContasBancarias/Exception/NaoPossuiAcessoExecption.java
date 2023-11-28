package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception;

public class NaoPossuiAcessoExecption extends RuntimeException{
    public NaoPossuiAcessoExecption(){
        super("ERRO > Nao possui acesso.");
    }
}
