package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.ContaCorrenteDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.ContaCorrenteException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.ContaCorrente;

import java.util.ArrayList;

public class ContaCController implements IController<ContaCorrente> {
    private IDao<ContaCorrente> contaCorrente;
    public ContaCController(){
        this.contaCorrente = new ContaCorrenteDAO();
    }
    @Override
    public boolean createCRUD(ContaCorrente object) {
       try{
           System.out.println("Conta Criada com Sucesso.");
           return this.contaCorrente.createCRUD(object);
       }catch (ContaCorrenteException e){
           System.err.println(e.getMessage());
       }
       return false;
    }
    @Override
    public ArrayList<ContaCorrente> listarTudoCRUD() {
            return this.contaCorrente.listarTudoCRUD();
    }
    @Override
    public ContaCorrente buscar(int id) {
        try {
            return this.contaCorrente.buscar(id);
        }catch (ContaCorrenteException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    @Override
    public boolean deleteCRUD(ContaCorrente object) {
        try{
            System.out.println("Conta Deletada com sucesso.");
            return this.contaCorrente.deleteCRUD(object);
        }catch (ContaCorrenteException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public void updateCRUD(int index, ContaCorrente object) {
        try{
            this.contaCorrente.updateCRUD(index, object);
        }catch (ContaCorrenteException e){
            System.err.println(e.getMessage());
        }
    }
}
