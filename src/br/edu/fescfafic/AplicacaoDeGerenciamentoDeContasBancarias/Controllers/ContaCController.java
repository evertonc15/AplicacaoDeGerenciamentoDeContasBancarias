package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.ContaCorrenteDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Contas.ContaCorrente;

import java.util.ArrayList;

public class ContaCController implements IController<ContaCorrente> {
    public IDao<ContaCorrente> contaCorrente;
    public ContaCController(){
        this.contaCorrente = new ContaCorrenteDAO();
    }

    @Override
    public boolean createCRUD(ContaCorrente object) {
        return this.contaCorrente.createCRUD(object);
    }
    @Override
    public ArrayList<ContaCorrente> listarTudoCRUD() {
        return this.contaCorrente.listarTudoCRUD();
    }
    @Override
    public ContaCorrente buscar(int id) {
        return this.contaCorrente.buscar(id);
    }
    @Override
    public boolean deleteCRUD(ContaCorrente object) {
        return this.contaCorrente.deleteCRUD(object);
    }
    @Override
    public void updateCRUD(int index, ContaCorrente object) {
        this.contaCorrente.updateCRUD(index, object);
    }
}
