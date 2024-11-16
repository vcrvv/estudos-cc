package br.com.fiap.financafacil.dao;

import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.factory.ConnectionFactory;
import br.com.fiap.financafacil.model.Divida;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DividaDao implements AutoCloseable {
    private Connection conexao;

    public DividaDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void insert(Divida divida) throws SQLException {
        String sql = "INSERT INTO divida (titulo, valor_inicial, data_inicial, taxa, id_conta) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setString(1, divida.getTitulo());
            stm.setDouble(2, divida.getValorInicial());
            stm.setDate(3, java.sql.Date.valueOf(divida.getDataInicial()));
            stm.setDouble(4, divida.getTaxa());
            stm.setInt(5, divida.getIdConta()); 
            stm.executeUpdate();
        }
    }

    public List<Divida> getAll() throws SQLException {
        String sql = "SELECT * FROM divida";
        List<Divida> lista = new ArrayList<>();
        try (PreparedStatement stm = conexao.prepareStatement(sql);
             ResultSet result = stm.executeQuery()) {
            while (result.next()) {
                lista.add(parseDivida(result));
            }
        }
        return lista;
    }

    public Divida pesquisar(int idDivida) throws SQLException, EntidadeNaoEncontradaException {
        String sql = "SELECT * FROM divida WHERE id_divida = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, idDivida);
            ResultSet result = stm.executeQuery();
            if (!result.next()) {
                throw new EntidadeNaoEncontradaException("Dívida não encontrada.");
            }
            return parseDivida(result);
        }
    }

    private Divida parseDivida(ResultSet result) throws SQLException {
        Divida divida = new Divida();
        divida.setIdDivida(result.getInt("id_divida"));
        divida.setTitulo(result.getString("titulo"));
        divida.setValorInicial(result.getDouble("valor_inicial"));
        divida.setDataInicial(result.getDate("data_inicial").toLocalDate());
        divida.setTaxa(result.getDouble("taxa"));
        divida.setIdConta(result.getInt("id_conta"));
        return divida;
    }

    public void atualizar(Divida divida) throws SQLException {
        String sql = "UPDATE divida SET titulo = ?, valor_inicial = ?, data_inicial = ?, taxa = ?, id_conta = ? WHERE id_divida = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setString(1, divida.getTitulo());
            stm.setDouble(2, divida.getValorInicial());
            stm.setDate(3, java.sql.Date.valueOf(divida.getDataInicial()));
            stm.setDouble(4, divida.getTaxa());
            stm.setInt(5, divida.getIdConta()); 
            stm.setInt(6, divida.getIdDivida());
            stm.executeUpdate();
        }
    }

    public void remover(int idDivida) throws SQLException, EntidadeNaoEncontradaException {
        String sql = "DELETE FROM divida WHERE id_divida = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, idDivida);
            int linhas = stm.executeUpdate();
            if (linhas == 0) {
                throw new EntidadeNaoEncontradaException("Dívida não encontrada para ser removida.");
            }
        }
    }

    @Override
    public void close() throws SQLException {
        if (conexao != null && !conexao.isClosed()) {
            conexao.close();
        }
    }
}
