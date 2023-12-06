package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.FuncionarioDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.FuncionarioException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Funcionario;

import java.util.ArrayList;

public class FuncionarioController implements IController<Funcionario> {
    private IDao<Funcionario> funcionario;
    public FuncionarioController(){
        this.funcionario = new FuncionarioDAO();
    }
    @Override
    public boolean createCRUD(Funcionario object) {
        try{
            System.out.println("Funcionario criado com sucesso.");
            return this.funcionario.createCRUD(object);
        }catch (FuncionarioException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public ArrayList<Funcionario> listarTudoCRUD() {
        try{
            return this.funcionario.listarTudoCRUD();
        }catch (FuncionarioException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    @Override
    public Funcionario buscar(int id) {
        try{
            return this.funcionario.buscar(id);
        }catch (FuncionarioException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    @Override
    public boolean deleteCRUD(Funcionario object) {
        try {
            System.out.println("Funcionario deletado.");
            return this.funcionario.deleteCRUD(object);
        }catch (FuncionarioException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public void updateCRUD(int index, Funcionario object) {
        try {
            this.funcionario.updateCRUD(index, object);
        }catch (FuncionarioException e){
            System.err.println(e.getMessage());
        }
    }
}
