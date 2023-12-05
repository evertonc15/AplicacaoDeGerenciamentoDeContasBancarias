package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.PessoaException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Pessoa;

import java.util.ArrayList;

public class PessoaDAO implements IDao<Pessoa> {
    private ArrayList<Pessoa> pessoas;
    public PessoaDAO(){
        this.pessoas = new ArrayList<>();
    }
    @Override
    public boolean createCRUD(Pessoa object) {
        return this.pessoas.add(object);
    }
    @Override
    public ArrayList<Pessoa> listarTudoCRUD() {
        return this.pessoas;
    }
    @Override
    public Pessoa buscar(int id) {
        for(Pessoa pessoa : pessoas){
            if(pessoa.getId() == id){
                return pessoa;
            }
        }
        throw new PessoaException(String.format("Pessoa com id %s nao encontrando.", id));
    }
    @Override
    public boolean deleteCRUD(Pessoa object) {
        boolean deletado = this.pessoas.remove(object);
        if(deletado){
            return true;
        }else{
            throw new PessoaException("ERRO > Pessoa nao encontrada.");
        }
    }
    @Override
    public void updateCRUD(int index, Pessoa object) {
        try{
            this.pessoas.set(index, object);
        }catch (PessoaException e){
            throw new PessoaException("ERRO > Nao foi possivel atualizar a Pessoa.");
        }
    }
}
