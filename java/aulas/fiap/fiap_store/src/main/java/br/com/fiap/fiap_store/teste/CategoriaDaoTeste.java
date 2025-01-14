package br.com.fiap.fiap_store.teste;

import br.com.fiap.fiap_store.dao.CategoriaDao;
import br.com.fiap.fiap_store.factory.DaoFactory;
import br.com.fiap.fiap_store.model.Categoria;

import java.util.List;

public class CategoriaDaoTeste {

    public static void main(String[] args) {
        CategoriaDao dao = DaoFactory.getCategoriaDAO();

        List<Categoria> lista = dao.listar();
        for (Categoria categoria : lista) {
            System.out.println(categoria.getCodigo() + " " + categoria.getNome());
        }
    }
}