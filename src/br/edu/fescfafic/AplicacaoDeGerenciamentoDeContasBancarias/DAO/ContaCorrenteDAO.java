package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IContaCorrente;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Contas.ContaCorrente;

import java.util.ArrayList;

public class ContaCorrenteDAO implements  IDao <ContaCorrente>{
    ArrayList<ContaCorrente> contaCorrente = new ArrayList<>();

    @Override
    public boolean createCRUD(ContaCorrente object) {
        return this.contaCorrente.add(object);
    }
    @Override
    public ArrayList<ContaCorrente> listarTudoCRUD() {
        System.out.println(contaCorrente);
        return this.contaCorrente;
    }

    @Override
    public ContaCorrente buscar(int id) {
        for(ContaCorrente busca : this.contaCorrente){
            if(busca.getIdDaConta() != 0){
                return busca;
            }
        }
        return null;
    }

    @Override
    public boolean deleteCRUD(ContaCorrente object) {
        return this.contaCorrente.remove(object);
    }

    @Override
    public void updateCRUD(int index, ContaCorrente object) {
        this.contaCorrente.set(index, object);
    }

}
