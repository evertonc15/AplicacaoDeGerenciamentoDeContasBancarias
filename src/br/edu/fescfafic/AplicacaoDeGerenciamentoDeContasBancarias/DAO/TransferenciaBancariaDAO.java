package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.PixException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.TransferenciaException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Pix;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.TransferenciaBancaria;

import java.util.ArrayList;

public class TransferenciaBancariaDAO implements IDao<TransferenciaBancaria> {
    private ArrayList<TransferenciaBancaria> transBanc;
    public TransferenciaBancariaDAO() {
        transBanc =  new ArrayList<>();
    }
    @Override
    public boolean createCRUD(TransferenciaBancaria object) {
        return this.transBanc.add(object);
    }
    @Override
    public ArrayList<TransferenciaBancaria> listarTudoCRUD() {
        return this.transBanc;
    }
    @Override
    public TransferenciaBancaria buscar(int id) {
        for(TransferenciaBancaria busca : transBanc){
            if(busca.getId() == id){
                return busca;
            }
        }
        throw new TransferenciaException(String.format("ERRO > ID %s nao encontrado", id));
    }
    @Override
    public boolean deleteCRUD(TransferenciaBancaria object) {
        boolean removido = this.transBanc.remove(object);
        if(removido){
            return true;
        }else{
            throw new TransferenciaException("ERRO > ID %s nao encontrado");
        }
    }
    @Override
    public void updateCRUD(int index, TransferenciaBancaria object) {
        try {
            this.transBanc.set(index, object);
        }catch (TransferenciaException e){
            throw new TransferenciaException("ERRO > Nao foi possivel atualizar");
        }
    }
}
