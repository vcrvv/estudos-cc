package br.com.fiap.fiap_store.dao.impl;

import br.com.fiap.fiap_store.dao.ConnectionManager;
import br.com.fiap.fiap_store.dao.UsuarioDao;
import br.com.fiap.fiap_store.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleUsuarioDao implements UsuarioDao {

    private Connection conexao;

    @Override
    public boolean validarUsuario(Usuario usuario) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
<<<<<<< HEAD
            conexao = ConnectionManager.getInstance().getConnection();
=======
            conexao = ConnectionManager
                    .getInstance()
                    .getConnection();
>>>>>>> origin/main

            String sql = "SELECT * FROM TB_USUARIO " +
                    "WHERE DS_EMAIL = ? AND DS_SENHA = ?";

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());
            rs = stmt.executeQuery();

            if (rs.next()){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                rs.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}