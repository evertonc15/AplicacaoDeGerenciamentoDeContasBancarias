package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Contas.ContaPoupanca;

import java.util.ArrayList;

public class ContaPoupancaDAO implements IDao <ContaPoupanca> {
    ArrayList<ContaPoupanca> contaPoupanca = new ArrayList<>();
    @Override
    public boolean createCRUD(ContaPoupanca object) {
        return this.contaPoupanca.add(object);
    }
    @Override
    public ArrayList<ContaPoupanca> listarTudoCRUD() {
        System.out.println(contaPoupanca);
        return this.contaPoupanca;
    }
    @Override
    public ContaPoupanca buscar(int id) {
        for(ContaPoupanca busca : this.contaPoupanca){
            if(busca.getIdDaConta() != 0){
                return busca;
            }
        }
        return null;
    }
    @Override
    public boolean deleteCRUD(ContaPoupanca object) {
        return this.contaPoupanca.remove(object);
    }

    @Override
    public void updateCRUD(int index, ContaPoupanca object) {
        this.contaPoupanca.set(index, object);
    }
}
