package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface;

import java.util.ArrayList;

public interface IDao <T> {
    boolean createCRUD(T object);
    ArrayList<T> listarTudo();
    T buscar(int id);
    boolean removeCRUD(T object);
    void updateCRUD(int id, T object);
}
