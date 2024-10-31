package br.com.fiap.fiap_store.dao.impl;

import br.com.fiap.fiap_store.dao.ProdutoDao;
import br.com.fiap.fiap_store.exception.DBException;
import br.com.fiap.fiap_store.model.Produto;

import java.sql.Connection;
import java.util.List;

public class OracleProdutoDao implements ProdutoDao {

    private Connection conexao;

    @Override
    public void cadastrar(Produto produto) throws DBException {

    }

    @Override
    public void atualizar(Produto produto) throws DBException {

    }

    @Override
    public void remover(int codigo) throws DBException {

    }

    @Override
    public Produto buscar(int id) {
        return null;
    }

    @Override
    public List<Produto> listar() {
        return List.of();
    }
}