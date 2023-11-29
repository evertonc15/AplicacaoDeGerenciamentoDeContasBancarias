package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Contas.ContaPoupanca;

import java.util.ArrayList;

public class ContaPoupancaDAO implements IDao <ContaPoupanca> {
    ArrayList<ContaPoupanca> contaPoupanca = new ArrayList<>();
    @Override
    public boolean createCRUD(ContaPoupanca object) {
        return contaPoupanca.add(object);
    }
    @Override
    public ArrayList<ContaPoupanca> listarTudo() {
        return contaPoupanca;
    }
    @Override
    public ContaPoupanca buscar(int id) {
        return contaPoupanca.get(id);
    }
    @Override
    public boolean removeCRUD(ContaPoupanca object) {
        return contaPoupanca.remove(object);
    }

    @Override
    public void updateCRUD(int id, ContaPoupanca object) {
        contaPoupanca.add(id, object);
    }
}
