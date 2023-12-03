package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Controllers;

import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.DAO.PixDAO;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Exception.PixException;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IController;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface.IDao;
import br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Model.Pix;

import java.util.ArrayList;

public class PixController implements IController<Pix> {

    private IDao<Pix> dao;

    public PixController() {
        this.dao = new PixDAO();
    }

    @Override
    public boolean createCRUD(Pix object) {
        try {
            return this.dao.createCRUD(object);
        } catch (PixException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList<Pix> listarTudoCRUD() {
        return this.dao.listarTudoCRUD();
    }

    @Override
    public Pix buscar(int id) {
        try {
            return this.dao.buscar(id);
        } catch (PixException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean deleteCRUD(Pix object) {
        try {
            return this.dao.deleteCRUD(object);
        } catch (PixException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void updateCRUD(int index, Pix object) {
        try {
            this.dao.updateCRUD(index, object);
        } catch (PixException e) {
            System.err.println(e.getMessage());
        }
    }

}

