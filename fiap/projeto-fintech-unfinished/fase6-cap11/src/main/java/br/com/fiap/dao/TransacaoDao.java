package br.com.fiap.dao;

import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Transacao;
import br.com.fiap.exception.EntidadeNaoEncontradaException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TransacaoDao {
    private Connection conexao;

    public TransacaoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void insert(Transacao transacao) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "INSERT INTO transacao (valor, tipo, metodo, categoria, descricao, id_conta) VALUES (?, ?, ?, ?, ?, ?)");
        stm.setDouble(1, transacao.getValor());
        stm.setString(2, transacao.getTipo());
        stm.setString(3, transacao.getMetodo());
        stm.setString(4, transacao.getCategoria());
        stm.setString(5, transacao.getDescricao());
        stm.setInt(6, transacao.getIdConta()); 
        stm.executeUpdate();
    }

    public List<Transacao> getAll() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM transacao");
        ResultSet result = stm.executeQuery();
        List<Transacao> lista = new ArrayList<>();
        while (result.next()) {
            Transacao transacao = new Transacao();
            transacao.setIdTransacao(result.getInt("id_transacao"));
            transacao.setValor(result.getDouble("valor"));
            transacao.setTipo(result.getString("tipo"));
            transacao.setMetodo(result.getString("metodo"));
            transacao.setCategoria(result.getString("categoria"));
            transacao.setDescricao(result.getString("descricao"));
            transacao.setIdConta(result.getInt("id_conta")); 
            lista.add(transacao);
        }
        return lista;
    }

    public Transacao pesquisar(int idTransacao) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM transacao WHERE id_transacao = ?");
        stm.setInt(1, idTransacao);
        ResultSet result = stm.executeQuery();
        if (!result.next()) {
            throw new EntidadeNaoEncontradaException("Transação não encontrada.");
        }
        return parseTransacao(result);
    }

    private Transacao parseTransacao(ResultSet result) throws SQLException {
        Transacao transacao = new Transacao();
        transacao.setIdTransacao(result.getInt("id_transacao")); 
        transacao.setValor(result.getDouble("valor"));
        transacao.setTipo(result.getString("tipo"));
        transacao.setMetodo(result.getString("metodo"));
        transacao.setCategoria(result.getString("categoria"));
        transacao.setDescricao(result.getString("descricao"));
        transacao.setIdConta(result.getInt("id_conta")); 
        return transacao;
    }

    public void atualizar(Transacao transacao) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "UPDATE transacao SET valor = ?, tipo = ?, metodo = ?, categoria = ?, descricao = ?, id_conta = ? WHERE id_transacao = ?");
        stm.setDouble(1, transacao.getValor());
        stm.setString(2, transacao.getTipo());
        stm.setString(3, transacao.getMetodo());
        stm.setString(4, transacao.getCategoria());
        stm.setString(5, transacao.getDescricao());
        stm.setInt(6, transacao.getIdConta());
        stm.setInt(7, transacao.getIdTransacao()); 
        stm.executeUpdate();
    }

    public void remover(int idTransacao) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stm = conexao.prepareStatement("DELETE FROM transacao WHERE id_transacao = ?");
        stm.setInt(1, idTransacao);
        int linhas = stm.executeUpdate();
        if (linhas == 0) {
            throw new EntidadeNaoEncontradaException("Transação não encontrada para ser removida.");
        }
    }

    public void fecharConexao() throws SQLException {
        conexao.close();
    }
}
