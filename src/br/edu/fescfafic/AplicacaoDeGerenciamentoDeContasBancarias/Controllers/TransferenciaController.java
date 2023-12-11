package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.TransferenciaBancariaDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.TransferenciaException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.TransferenciaBancaria;

import java.util.ArrayList;

public class TransferenciaController implements IController<TransferenciaBancaria> {
    private IDao<TransferenciaBancaria> transBanc;
    public TransferenciaController(){
        this.transBanc = new TransferenciaBancariaDAO();
    }
    @Override
    public boolean createCRUD(TransferenciaBancaria object) {
        try {
            System.out.println("Transferencia criada com sucesso.");
            return this.transBanc.createCRUD(object);
        }catch (TransferenciaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public ArrayList<TransferenciaBancaria> listarTudoCRUD() {
        return this.transBanc.listarTudoCRUD();
    }
    @Override
    public TransferenciaBancaria buscar(int id) {
        try{
            return this.transBanc.buscar(id);
        }catch (TransferenciaException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    @Override
    public boolean deleteCRUD(TransferenciaBancaria object) {
        try {
            if(object != null){
                System.out.println("Transferencia deletada.");
                return this.transBanc.deleteCRUD(object);
            }
        }catch (TransferenciaException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    @Override
    public void updateCRUD(int index, TransferenciaBancaria object) {
        try {
            this.transBanc.updateCRUD(index, object);
        }catch (TransferenciaException e){
            System.err.println(e.getMessage());
        }
    }
}
