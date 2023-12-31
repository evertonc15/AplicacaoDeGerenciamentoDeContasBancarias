package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.ContaCorrenteException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.ContaCorrente;

import java.util.ArrayList;

public class ContaCorrenteDAO implements  IDao <ContaCorrente>{
    private ArrayList<ContaCorrente> contaCorrente;
    public ContaCorrenteDAO(){
        this.contaCorrente = new ArrayList<>();
    }
    @Override
    public boolean createCRUD(ContaCorrente object) {
       return this.contaCorrente.add(object);
    }
    @Override
    public ArrayList<ContaCorrente> listarTudoCRUD() {
            return this.contaCorrente;
    }

    @Override
    public ContaCorrente buscar(int id) {
        for(ContaCorrente busca : this.contaCorrente){
            if(busca.getidDaContaP() == id){
                return busca;
            }
        }
        throw new ContaCorrenteException(String.format("ERRO > ID %s nao encontrada.", id));
    }
    @Override
    public boolean deleteCRUD(ContaCorrente object) {
        boolean deletar = this.contaCorrente.remove(object);
        if(deletar){
            return true;
        }else{
            throw new ContaCorrenteException("ERRO > Conta nao encontrada.");
        }
    }
    @Override
    public void updateCRUD(int index, ContaCorrente object) {
        if(contaCorrente.size() > index){
            System.out.println("Conta atualizada com sucesso.");
            this.contaCorrente.set(index, object);
        }else{
            throw new ContaCorrenteException("ERRO > Index nao encotrado.");
        }
    }
}
