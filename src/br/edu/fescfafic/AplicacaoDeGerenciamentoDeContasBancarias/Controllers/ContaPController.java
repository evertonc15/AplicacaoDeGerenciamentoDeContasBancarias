package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.ContaPoupancaDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.ContaPoupancaException;
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
        try{
            return this.contaPoupanca.createCRUD(object);
        }catch (ContaPoupancaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public ArrayList<ContaPoupanca> listarTudoCRUD() {
        return this.contaPoupanca.listarTudoCRUD();
    }
    @Override
    public ContaPoupanca buscar(int id) {
        try{
            return this.contaPoupanca.buscar(id);
        }catch (ContaPoupancaException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    @Override
    public boolean deleteCRUD(ContaPoupanca object) {
        try {
            return this.contaPoupanca.deleteCRUD(object);
        }catch (ContaPoupancaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public void updateCRUD(int index, ContaPoupanca object) {
        try {
            this.contaPoupanca.updateCRUD(index, object);
        }catch (ContaPoupancaException e){
            System.err.println(e.getMessage());
        }
    }
}
