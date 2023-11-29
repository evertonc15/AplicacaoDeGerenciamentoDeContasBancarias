package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IContaCorrente;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Contas.ContaCorrente;

import java.util.ArrayList;

public class ContaCorrenteDAO implements IDao <ContaCorrente>{
    ArrayList<ContaCorrente> contaCorrente = new ArrayList<>();

    @Override
    public boolean createCRUD(ContaCorrente object) {
        return contaCorrente.add(object);
    }
    @Override
    public ArrayList<ContaCorrente> listarTudo() {
        return contaCorrente;
    }
    @Override
    public ContaCorrente buscar(int id) {
        return contaCorrente.get(id);
    }
    @Override
    public boolean removeCRUD(ContaCorrente object) {
        return contaCorrente.remove(object);
    }

    @Override
    public void updateCRUD(int id, ContaCorrente object) {
        contaCorrente.add(id, object);
    }

}
