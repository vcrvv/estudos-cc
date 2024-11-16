package br.com.fiap.dao;

import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Investimento;
import br.com.fiap.exception.EntidadeNaoEncontradaException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InvestimentoDao {
    private Connection conexao;

    public InvestimentoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void insert(Investimento investimento) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "INSERT INTO investimento (titulo, valor_investido, data_inicial, taxa, id_conta) VALUES (?, ?, ?, ?, ?)");
        stm.setString(1, investimento.getTitulo());
        stm.setDouble(2, investimento.getValorInvestido());
        stm.setDate(3, java.sql.Date.valueOf(investimento.getDataInicial()));
        stm.setDouble(4, investimento.getTaxa());
        stm.setInt(5, investimento.getIdConta());
        stm.executeUpdate();
    }

    public List<Investimento> getAll() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM investimento");
        ResultSet result = stm.executeQuery();
        List<Investimento> lista = new ArrayList<>();
        while (result.next()) {
            Investimento investimento = new Investimento();
            investimento.setIdInvestimento(result.getInt("id_investimento"));
            investimento.setTitulo(result.getString("titulo"));
            investimento.setValorInvestido(result.getDouble("valor_investido"));
            investimento.setDataInicial(result.getDate("data_inicial").toLocalDate());
            investimento.setTaxa(result.getDouble("taxa"));
            investimento.setIdConta(result.getInt("id_conta"));
            lista.add(investimento);
        }
        return lista;
    }

    public Investimento pesquisar(int idInvestimento) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM investimento WHERE id_investimento = ?");
        stm.setInt(1, idInvestimento);
        ResultSet result = stm.executeQuery();
        if (!result.next()) {
            throw new EntidadeNaoEncontradaException("Investimento não encontrado.");
        }
        return parseInvestimento(result);
    }

    private Investimento parseInvestimento(ResultSet result) throws SQLException {
        Investimento investimento = new Investimento();
        investimento.setIdInvestimento(result.getInt("id_investimento"));
        investimento.setTitulo(result.getString("titulo"));
        investimento.setValorInvestido(result.getDouble("valor_investido"));
        investimento.setDataInicial(result.getDate("data_inicial").toLocalDate());
        investimento.setTaxa(result.getDouble("taxa"));
        investimento.setIdConta(result.getInt("id_conta"));
        return investimento;
    }

    public void atualizar(Investimento investimento) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "UPDATE investimento SET titulo = ?, valor_investido = ?, data_inicial = ?, taxa = ?, id_conta = ? WHERE id_investimento = ?");
        stm.setString(1, investimento.getTitulo());
        stm.setDouble(2, investimento.getValorInvestido());
        stm.setDate(3, java.sql.Date.valueOf(investimento.getDataInicial()));
        stm.setDouble(4, investimento.getTaxa());
        stm.setInt(5, investimento.getIdConta());
        stm.setInt(6, investimento.getIdInvestimento());
        stm.executeUpdate();
    }

    public void remover(int idInvestimento) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stm = conexao.prepareStatement("DELETE FROM investimento WHERE id_investimento = ?");
        stm.setInt(1, idInvestimento);
        int linhas = stm.executeUpdate();
        if (linhas == 0) {
            throw new EntidadeNaoEncontradaException("Investimento não encontrado para ser removido.");
        }
    }

    public void fecharConexao() throws SQLException {
        conexao.close();
    }
}
