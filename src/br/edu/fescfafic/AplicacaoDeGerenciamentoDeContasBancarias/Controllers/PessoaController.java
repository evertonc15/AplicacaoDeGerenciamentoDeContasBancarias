package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.PessoaDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.PessoaException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Pessoa;

import java.util.ArrayList;

public class PessoaController implements IController<Pessoa> {
    private IDao<Pessoa> pessoa;
    public PessoaController(){
        this.pessoa = new PessoaDAO();
    }
    @Override
    public boolean createCRUD(Pessoa object) {
        try {
            return this.pessoa.createCRUD(object);
        }catch (PessoaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public ArrayList<Pessoa> listarTudoCRUD() {
        try {
            return this.pessoa.listarTudoCRUD();
        }catch (PessoaException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    @Override
    public Pessoa buscar(int id) {
        return null;
    }

    @Override
    public Pessoa buscar(String nome) {
        try {
            return this.pessoa.buscar(nome);
        }catch (PessoaException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    @Override
    public boolean deleteCRUD(Pessoa object) {
        try {
            return this.pessoa.deleteCRUD(object);
        }catch (PessoaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public void updateCRUD(int index, Pessoa object) {
        try {
            this.pessoa.updateCRUD(index, object);
        }catch (PessoaException e){
            System.err.println(e.getMessage());
        }
    }
}
