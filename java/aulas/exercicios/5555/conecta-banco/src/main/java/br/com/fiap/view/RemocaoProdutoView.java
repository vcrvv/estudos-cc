package br.com.fiap.view;

import br.com.fiap.dao.ProdutoDao;
import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.model.Produto;
import java.sql.SQLException;

public class RemocaoProdutoView {
    public static void main(String[] args) {
        try {
            ProdutoDao dao = new ProdutoDao();
            dao.remover(1);
            dao.fecharConexao();
            System.out.println("Produto Removido!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (EntidadeNaoEncontradaException e) {
            System.err.println("Produto não encontrado");
        }
    }
}