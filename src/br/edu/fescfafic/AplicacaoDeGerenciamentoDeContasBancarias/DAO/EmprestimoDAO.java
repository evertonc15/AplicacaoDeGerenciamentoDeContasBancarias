package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.EmprestimoException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Emprestimo;

import java.util.ArrayList;

public class EmprestimoDAO implements IDao<Emprestimo> {
    private ArrayList<Emprestimo> emprestimo;
    public EmprestimoDAO(){
        this.emprestimo = new ArrayList<>();
    }
    @Override
    public boolean createCRUD(Emprestimo object) {
        return this.emprestimo.add(object);
    }
    @Override
    public ArrayList<Emprestimo> listarTudoCRUD() {
        return this.emprestimo;
    }
    @Override
    public Emprestimo buscar(int id) {
        for(Emprestimo busca : emprestimo){
            if(busca.getIdDoEmprestimo() == id){
                return busca;
            }
        }
        throw new EmprestimoException(String.format("ERRO > Id %s nao encontrado.", id));
    }
    @Override
    public boolean deleteCRUD(Emprestimo object) {
        boolean deletado = this.emprestimo.remove(object);
        if(deletado){
            return true;
        }else{
            throw new EmprestimoException("ERRO > Emprestimo nao encotrado.");
        }
    }
    @Override
    public void updateCRUD(int index, Emprestimo object) {
        try{
            this.emprestimo.set(index, object);
        }catch (EmprestimoException e){
            System.err.println("ERRO > Nao foi possivel atualizar.");
        }
    }
}
