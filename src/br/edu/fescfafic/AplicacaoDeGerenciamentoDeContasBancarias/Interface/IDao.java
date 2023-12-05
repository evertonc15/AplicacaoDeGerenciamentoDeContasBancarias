package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface;

import java.util.ArrayList;

public interface IDao <T> {
    boolean createCRUD(T object);
    ArrayList<T> listarTudoCRUD();
    T buscar(int id);
    boolean deleteCRUD(T object);
    void updateCRUD(int index, T object);
}
