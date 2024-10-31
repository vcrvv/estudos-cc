package br.com.fiap.financafacil.teste;

import br.com.fiap.financafacil.dao.TransacaoDao;
import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.model.Transacao;

import java.sql.SQLException;

public class TransacaoTest {
    public static void main(String[] args) throws EntidadeNaoEncontradaException {
        try {
            TransacaoDao dao = new TransacaoDao();

            for (int i = 1; i <= 5; i++) {
                Transacao transacao = new Transacao(500.0 + (i * 50), "Tipo " + i, "Método " + i,
                        "Categoria " + i, "Descrição " + i, 1);
                dao.insert(transacao);
                System.out.println("Transação cadastrada: " + transacao.getDescricao());
            }

            System.out.println("Listando transações:");
            for (Transacao transacao : dao.getAll()) {
                System.out.println("ID: " + transacao.getIdTransacao() + ", Descrição: " + transacao.getDescricao() +
                        ", Valor: R$" + transacao.getValor() + ", Tipo: " + transacao.getTipo());
            }

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
