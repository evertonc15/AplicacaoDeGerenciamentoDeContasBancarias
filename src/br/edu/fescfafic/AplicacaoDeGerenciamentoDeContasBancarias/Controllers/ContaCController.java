package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.ContaCorrenteDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.ContaCorrente;

import java.util.ArrayList;

public class ContaCController implements IController<ContaCorrente> {
    public IDao<ContaCorrente> contaCorrente;
    public ContaCController(){
        this.contaCorrente = new ContaCorrenteDAO();
    }

    @Override
    public boolean createCRUD(ContaCorrente object) {
        boolean verificar = false;
        try{
            if(object.getIdDaConta() > 100){
                verificar = true;
                System.out.println("Conta Criada com sucesso.");
                return this.contaCorrente.createCRUD(object);
            }
            throw new ContaNaoPodeSerCriadaException();
        }catch (ContaNaoPodeSerCriadaException e){
            System.out.println(e);
        }
        return verificar;
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
