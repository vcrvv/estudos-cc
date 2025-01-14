package br.com.fiap.fiap_store.factory;

import br.com.fiap.fiap_store.dao.CategoriaDao;
import br.com.fiap.fiap_store.dao.ProdutoDao;
import br.com.fiap.fiap_store.dao.UsuarioDao;
import br.com.fiap.fiap_store.dao.impl.OracleCategoriaDao;
import br.com.fiap.fiap_store.dao.impl.OracleProdutoDao;
import br.com.fiap.fiap_store.dao.impl.OracleUsuarioDao;

public class DaoFactory {

    public static ProdutoDao getProdutoDAO() {
        return new OracleProdutoDao();
    }

    public static CategoriaDao getCategoriaDAO() {
        return new OracleCategoriaDao();
    }

    public static UsuarioDao getUsuarioDAO() {
        return new OracleUsuarioDao();
    }

}