package br.com.fiap.financafacil.dao;

import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.factory.ConnectionFactory;
import br.com.fiap.financafacil.model.Conta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaDao {
    private Connection conexao;

    public ContaDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void insert(Conta conta) throws SQLException {
        String sql = "INSERT INTO conta (id_usuario, saldo) VALUES (?, ?)";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, conta.getIdUsuario());
            stm.setDouble(2, conta.getSaldo());
            stm.executeUpdate();
        }
    }
    
    public List<Conta> getAll() throws SQLException {
        String sql = "SELECT * FROM conta";
        List<Conta> lista = new ArrayList<>();
        try (PreparedStatement stm = conexao.prepareStatement(sql);
             ResultSet result = stm.executeQuery()) {
            while (result.next()) {
                lista.add(parseConta(result));
            }
        }
        return lista;
    }
    
    public Conta pesquisar(int idConta) throws SQLException, EntidadeNaoEncontradaException {
        String sql = "SELECT * FROM conta WHERE id_conta = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, idConta);
            ResultSet result = stm.executeQuery();
            if (!result.next()) {
                throw new EntidadeNaoEncontradaException("Conta não encontrada");
            }
            return parseConta(result);
        }
    }

    private Conta parseConta(ResultSet result) throws SQLException {
        Conta conta = new Conta();
        conta.setIdConta(result.getInt("id_conta"));
        conta.setSaldo(result.getDouble("saldo"));
        conta.setIdUsuario(result.getInt("id_usuario"));
        return conta;
    }

    public void atualizar(Conta conta) throws SQLException {
        String sql = "UPDATE conta SET saldo = ?, id_usuario = ? WHERE id_conta = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setDouble(1, conta.getSaldo());
            stm.setInt(2, conta.getIdUsuario());
            stm.setInt(3, conta.getIdConta());
            stm.executeUpdate();
        }
    }

    public void remover(int idConta) throws SQLException, EntidadeNaoEncontradaException {
        String sql = "DELETE FROM conta WHERE id_conta = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, idConta);
            int linhas = stm.executeUpdate();
            if (linhas == 0) {
                throw new EntidadeNaoEncontradaException("Conta não encontrada para ser removida");
            }
        }
    }

    public void fecharConexao() throws SQLException {
        if (conexao != null && !conexao.isClosed()) {
            conexao.close();
        }
    }
}
