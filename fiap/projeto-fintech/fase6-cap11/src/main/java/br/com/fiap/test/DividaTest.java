package br.com.fiap.test;

import br.com.fiap.dao.DividaDao;
import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.model.Divida;

import java.sql.SQLException;
import java.time.LocalDate;

public class DividaTest {
    public static void main(String[] args) throws EntidadeNaoEncontradaException {
        try {
            DividaDao dao = new DividaDao();

            for (int i = 1; i <= 5; i++) {
                Divida divida = new Divida("Divida " + i, 1000.0 + (i * 100), LocalDate.now(), 5.0, 1);
                dao.insert(divida);
                System.out.println("Dívida cadastrada: " + divida.getTitulo());
            }

            System.out.println("Listando dívidas:");
            for (Divida divida : dao.getAll()) {
                System.out.println("ID: " + divida.getIdDivida() + ", Título: " + divida.getTitulo() +
                        ", Valor: R$" + divida.getValorInicial() + ", Data: " + divida.getDataInicial());
            }

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
