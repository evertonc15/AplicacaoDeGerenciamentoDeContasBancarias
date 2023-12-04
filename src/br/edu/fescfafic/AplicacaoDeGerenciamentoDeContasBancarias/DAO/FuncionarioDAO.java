package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.FuncionarioException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Funcionario;

import java.util.ArrayList;

public class FuncionarioDAO implements IDao<Funcionario> {
    private ArrayList<Funcionario> funcionarios;
    public FuncionarioDAO(){
        this.funcionarios = new ArrayList<>();
    }
    @Override
    public boolean createCRUD(Funcionario object) {
        return this.funcionarios.add(object);
    }
    @Override
    public ArrayList<Funcionario> listarTudoCRUD() {
        return this.funcionarios;
    }
    @Override
    public Funcionario buscar(int id) {
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getId() == id){
                return funcionario;
            }
        }
        throw new FuncionarioException(String.format("ERRO > Funcionario com id %s nao encontrado.", id));
    }
    @Override
    public Funcionario buscar(String nome) {
        return null;
    }
    @Override
    public boolean deleteCRUD(Funcionario object) {
        boolean deletado = this.funcionarios.remove(object);
        if(deletado){
            return true;
        }else{
            throw new FuncionarioException("ERRO > Funcionario nao encontrado.");
        }
    }
    @Override
    public void updateCRUD(int index, Funcionario object) {
        try {
            this.funcionarios.set(index, object);
        }catch (FuncionarioException e){
            System.err.println("ERRO > Nao foi possivel atualizar o Funcionario.");
        }
    }
}
