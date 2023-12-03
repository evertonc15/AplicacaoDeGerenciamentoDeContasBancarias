package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.ContaPoupancaDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.ContaPoupanca;

import java.util.ArrayList;

public class ContaPController implements IController<ContaPoupanca> {
    private IDao<ContaPoupanca> contaPoupanca;
    public ContaPController(){
        this.contaPoupanca = new ContaPoupancaDAO();
    }
    @Override
    public boolean createCRUD(ContaPoupanca object) {
        return this.contaPoupanca.createCRUD(object);
    }
    @Override
    public ArrayList<ContaPoupanca> listarTudoCRUD() {
        return this.contaPoupanca.listarTudoCRUD();
    }
    @Override
    public ContaPoupanca buscar(int id) {
        return this.contaPoupanca.buscar(id);
    }
    @Override
    public boolean deleteCRUD(ContaPoupanca object) {
        return this.contaPoupanca.deleteCRUD(object);
    }
    @Override
    public void updateCRUD(int index, ContaPoupanca object) {
        this.contaPoupanca.updateCRUD(index, object);
    }
}
