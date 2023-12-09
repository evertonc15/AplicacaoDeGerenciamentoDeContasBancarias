package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.ContaPoupancaException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.ContaPoupanca;

import java.util.ArrayList;

public class ContaPoupancaDAO implements IDao <ContaPoupanca> {
     private ArrayList<ContaPoupanca> contaPoupanca;
     public ContaPoupancaDAO(){
         contaPoupanca = new ArrayList<>();
     }
    @Override
    public boolean createCRUD(ContaPoupanca object) {
        return this.contaPoupanca.add(object);
    }
    @Override
    public ArrayList<ContaPoupanca> listarTudoCRUD() {
        return this.contaPoupanca;
    }
    @Override
    public ContaPoupanca buscar(int id) {
        for(ContaPoupanca busca : contaPoupanca){
            if(busca.getidDaContaP() == id){
                return busca;
            }
        }
        throw new ContaPoupancaException(String.format("ERRO > ID %s nao encontrado", id));
    }
    @Override
    public boolean deleteCRUD(ContaPoupanca object) {
        boolean removido = this.contaPoupanca.remove(object);
        if (removido) {
            return true;
        } else {
            throw new ContaPoupancaException("ERRO > ID nao encontrado");
        }
    }
    @Override
    public void updateCRUD(int index, ContaPoupanca object) {
        try {
            this.contaPoupanca.set(index, object);
        } catch (ContaPoupancaException e) {
            throw new ContaPoupancaException("ERRO > nao foi possivel atualizar a Conta Poupanca");
        }
    }
}
