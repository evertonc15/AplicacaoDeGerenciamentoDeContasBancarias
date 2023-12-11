package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.EmprestimoDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.EmprestimoException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Emprestimo;

import java.util.ArrayList;

public class EmprestimoController implements IController<Emprestimo> {
    private IDao<Emprestimo> emprestimos;
    public EmprestimoController(){
        this.emprestimos = new EmprestimoDAO();
    }
    @Override
    public boolean createCRUD(Emprestimo object) {
        try{
            System.out.println("Emprestimo criado com sucesso.");
            return this.emprestimos.createCRUD(object);
        }catch (EmprestimoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public ArrayList<Emprestimo> listarTudoCRUD() {
        try{
            return this.emprestimos.listarTudoCRUD();
        }catch (EmprestimoException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    @Override
    public Emprestimo buscar(int id) {
        try{
            return this.emprestimos.buscar(id);
        }catch (EmprestimoException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    @Override
    public boolean deleteCRUD(Emprestimo object) {
        try {
            if(object != null){
                System.out.println("Emprestimo deletado com sucesso.");
                return this.emprestimos.deleteCRUD(object);
            }
        }catch (EmprestimoException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public void updateCRUD(int index, Emprestimo object) {
        try {
            this.emprestimos.updateCRUD(index, object);
        }catch (EmprestimoException e){
            System.err.println(e.getMessage());
        }
    }
}
