package br.com.fiap.financafacil.teste;

import br.com.fiap.financafacil.dao.DividaDao;
import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.model.Divida;

import java.sql.SQLException;
import java.time.LocalDate;

public class DividaTest {
    public static void main(String[] args) {
        try {
            DividaDao dao = new DividaDao();

            // Inserindo dívidas
            for (int i = 1; i <= 5; i++) {
                Divida divida = new Divida("Dívida " + i, 1000.0 + (i * 100), LocalDate.now(), 5.0, 1);
                dao.insert(divida);
                System.out.println("Dívida cadastrada: " + divida.getTitulo());
            }

            // Listando dívidas
            System.out.println("Listando dívidas:");
            for (Divida divida : dao.getAll()) {
                System.out.println("ID: " + divida.getIdDivida() + ", Título: " + divida.getTitulo() +
                        ", Valor: R$" + divida.getValorInicial() + ", Data: " + divida.getDataInicial());
            }

            // Pesquisar uma dívida específica
            try {
                Divida dividaPesquisada = dao.pesquisar(1); // Tente pesquisar uma dívida
                System.out.println("Dívida encontrada: " + dividaPesquisada.getTitulo());
            } catch (EntidadeNaoEncontradaException e) {
                System.err.println("Erro: " + e.getMessage());
            }

            // Fechar a conexão no final
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
