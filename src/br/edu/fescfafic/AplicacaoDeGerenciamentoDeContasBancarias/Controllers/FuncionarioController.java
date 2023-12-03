package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Pessoa;

import java.util.ArrayList;

public class FuncionarioController implements IController<Pessoa> {
    private IDao<Pessoa> funcionario;
    @Override
    public boolean createCRUD(Pessoa object) {
        return false;
    }

    @Override
    public ArrayList<Pessoa> listarTudoCRUD() {
        return null;
    }

    @Override
    public Pessoa buscar(int id) {
        return null;
    }

    @Override
    public Pessoa buscar(String nome) {
        return null;
    }

    @Override
    public boolean deleteCRUD(Pessoa object) {
        return false;
    }

    @Override
    public void updateCRUD(int index, Pessoa object) {

    }
}
