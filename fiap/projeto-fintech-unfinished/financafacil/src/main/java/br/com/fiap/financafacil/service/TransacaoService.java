package br.com.fiap.financafacil.service;

import br.com.fiap.financafacil.dao.TransacaoDao;
import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.model.Transacao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransacaoService {
    private TransacaoDao transacaoDao;

    public TransacaoService() throws SQLException {
        this.transacaoDao = new TransacaoDao();
    }

    public void adicionarTransacao(Transacao transacao) throws SQLException {
        transacaoDao.insert(transacao);
    }

    public List<Transacao> listarTransacoes() throws SQLException {
        return transacaoDao.getAll();
    }

    public List<Transacao> obterUltimasTransacoes(int limit) throws SQLException {
        return transacaoDao.getUltimasTransacoes(limit);
    }

    public Transacao buscarTransacaoPorId(int idTransacao) throws SQLException, EntidadeNaoEncontradaException {
        return transacaoDao.pesquisar(idTransacao);
    }

    public List<Transacao> pesquisarTransacoes(String keyword) throws SQLException {
        return transacaoDao.pesquisarPorPalavraChave(keyword);
    }

    public void atualizarTransacao(Transacao transacao) throws SQLException {
        transacaoDao.atualizar(transacao);
    }

    public void removerTransacao(int idTransacao) throws SQLException, EntidadeNaoEncontradaException {
        transacaoDao.remover(idTransacao);
    }

    public Map<String, Double> calcularSaldoUltimos30Dias() throws SQLException {
        List<Transacao> transacoes = transacaoDao.getTransacoesUltimos30Dias();

        double entradas = 0.0;
        double saidas = 0.0;

        for (Transacao transacao : transacoes) {
            if ("entrada".equals(transacao.getTipo())) {
                entradas += transacao.getValor();
            } else if ("saida".equals(transacao.getTipo())) {
                saidas += transacao.getValor();
            }
        }

        double saldo = entradas - saidas;

        Map<String, Double> resultado = new HashMap<>();
        resultado.put("entradas", entradas);
        resultado.put("saidas", saidas);
        resultado.put("saldo", saldo);

        return resultado;
    }
}
