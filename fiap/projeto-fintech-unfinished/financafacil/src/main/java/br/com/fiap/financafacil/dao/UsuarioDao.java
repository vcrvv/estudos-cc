package br.com.fiap.financafacil.dao;

import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.factory.ConnectionFactory;
import br.com.fiap.financafacil.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao implements AutoCloseable {
    private Connection conexao;

    public UsuarioDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }


    public void insert(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (nome, email, telefone, senha, data_nascimento, data_criada) VALUES (?, ?, ?, ?, ?, sysdate)";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getEmail());
            stm.setString(3, usuario.getTelefone());
            stm.setString(4, usuario.getSenha());
            stm.setDate(5, java.sql.Date.valueOf(usuario.getDataNascimento()));
            stm.executeUpdate();
        }
    }

    public List<Usuario> getAll() throws SQLException {
        String sql = "SELECT * FROM usuario";
        List<Usuario> lista = new ArrayList<>();
        try (PreparedStatement stm = conexao.prepareStatement(sql);
             ResultSet result = stm.executeQuery()) {
            while (result.next()) {
                lista.add(parseUsuario(result));
            }
        }
        return lista;
    }

    public Usuario pesquisar(int idUsuario) throws SQLException, EntidadeNaoEncontradaException {
        String sql = "SELECT * FROM usuario WHERE id_usuario = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, idUsuario);
            ResultSet result = stm.executeQuery();
            if (!result.next()) {
                throw new EntidadeNaoEncontradaException("Usuário não encontrado.");
            }
            return parseUsuario(result);
        }
    }

    public Usuario pesquisarPorEmail(String email) throws SQLException, EntidadeNaoEncontradaException {
        String sql = "SELECT * FROM usuario WHERE email = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setString(1, email);
            ResultSet result = stm.executeQuery();
            if (!result.next()) {
                throw new EntidadeNaoEncontradaException("Email não encontrado.");
            }
            return parseUsuario(result);
        }
    }

    private Usuario parseUsuario(ResultSet result) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(result.getInt("id_usuario"));
        usuario.setNome(result.getString("nome"));
        usuario.setEmail(result.getString("email"));
        usuario.setTelefone(result.getString("telefone"));
        usuario.setSenha(result.getString("senha"));
        usuario.setDataNascimento(result.getDate("data_nascimento").toLocalDate());
        usuario.setDataCriada(result.getDate("data_criada").toLocalDate());
        return usuario;
    }


    public void atualizar(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuario SET nome = ?, email = ?, telefone = ?, senha = ?, data_nascimento = ? WHERE id_usuario = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getEmail());
            stm.setString(3, usuario.getTelefone());
            stm.setString(4, usuario.getSenha());
            stm.setDate(5, java.sql.Date.valueOf(usuario.getDataNascimento()));
            stm.setInt(6, usuario.getIdUsuario());
            stm.executeUpdate();
        }
    }

    public void remover(int idUsuario) throws SQLException, EntidadeNaoEncontradaException {
        String sql = "DELETE FROM usuario WHERE id_usuario = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, idUsuario);
            int linhas = stm.executeUpdate();
            if (linhas == 0) {
                throw new EntidadeNaoEncontradaException("Usuário não encontrado para ser removido.");
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
