package br.com.fiap.financafacil.teste;

import br.com.fiap.financafacil.dao.InvestimentoDao;
import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.model.Investimento;

import java.sql.SQLException;
import java.time.LocalDate;

public class InvestimentoTest {
    public static void main(String[] args) {
        try {
            InvestimentoDao dao = new InvestimentoDao();

            // Inserindo investimentos
            for (int i = 1; i <= 5; i++) {
                Investimento investimento = new Investimento("Investimento " + i, 2000.0 + (i * 200), LocalDate.now(), 3.0, 1);
                dao.insert(investimento);
                System.out.println("Investimento cadastrado: " + investimento.getTitulo());
            }

            // Listando investimentos
            System.out.println("Listando investimentos:");
            for (Investimento investimento : dao.getAll()) {
                System.out.println("ID: " + investimento.getIdInvestimento() + ", Título: " + investimento.getTitulo() +
                        ", Valor: R$" + investimento.getValorInvestido() + ", Data: " + investimento.getDataInicial());
            }

            // Pesquisar um investimento específico
            try {
                Investimento investimentoPesquisado = dao.pesquisar(1); // Tente pesquisar um investimento
                System.out.println("Investimento encontrado: " + investimentoPesquisado.getTitulo());
            } catch (EntidadeNaoEncontradaException e) {
                System.err.println("Erro: " + e.getMessage());
            }

            // Fechar a conexão no final
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println("Ocorreu um erro de SQL: " + e.getMessage());
        }
    }
}
