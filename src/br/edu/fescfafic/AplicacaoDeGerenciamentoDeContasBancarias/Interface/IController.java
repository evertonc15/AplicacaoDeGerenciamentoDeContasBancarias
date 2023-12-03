package br.edu.fescfafic.AplicacaoDeGerenciamentoDeContasBancarias.Interface;

import java.util.ArrayList;

public interface IController<T> {
    boolean createCRUD(T object);
    ArrayList<T> listarTudoCRUD();
    T buscar(int id);
    T buscar(String nome);
    boolean deleteCRUD(T object);
    void updateCRUD(int index, T object);
}
