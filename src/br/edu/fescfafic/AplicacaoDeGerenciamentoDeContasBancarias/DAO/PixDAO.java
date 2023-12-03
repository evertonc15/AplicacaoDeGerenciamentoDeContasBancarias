package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.PixException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Pix;

import java.util.ArrayList;

public class PixDAO implements IDao<Pix> {

    private ArrayList<Pix> lstPix;
    public PixDAO() {
        lstPix =  new ArrayList<>();
    }

    @Override
    public boolean createCRUD(Pix object) {
        return this.lstPix.add(object);
    }
    @Override
    public ArrayList<Pix> listarTudoCRUD() {
        return this.lstPix;
    }
    @Override
    public Pix buscar(int id) {
        for(Pix pix : lstPix) {
            if (pix.getId() == id) {
                return pix;
            }
        }
        throw new PixException(String.format("ERRO > Pix com id %s nao encontrado", id));
    }
    @Override
    public Pix buscar(String nome) {
        return null;
    }
    @Override
    public boolean deleteCRUD(Pix object) {
        boolean removido = this.lstPix.remove(object);
        if (removido) {
            return true;
        } else {
            throw new PixException("ERRO > Pix com id %s nao encontrado");
        }
    }
    @Override
    public void updateCRUD(int index, Pix object) {
        try {
            this.lstPix.set(index, object);
        } catch (PixException e) {
            throw new PixException("ERRO > Nao foi possivel atualizar o PIX");
        }
    }
}
