package br.com.fiap.fiap_store.dao;

import br.com.fiap.fiap_store.exception.DBException;
import br.com.fiap.fiap_store.model.Produto;

import java.util.List;

public interface ProdutoDao {

    void cadastrar(Produto produto) throws DBException;
    void atualizar(Produto produto) throws DBException;
    void remover(int codigo) throws DBException;

    Produto buscar(int id);

    List<Produto> listar();

}