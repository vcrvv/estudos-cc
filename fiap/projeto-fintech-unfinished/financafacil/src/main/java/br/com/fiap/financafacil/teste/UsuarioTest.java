package br.com.fiap.financafacil.teste;

import br.com.fiap.financafacil.dao.UsuarioDao;
import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.model.Usuario;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class UsuarioTest {
    public static void main(String[] args) {
        try {
            UsuarioDao dao = new UsuarioDao();

            for (int i = 1; i <= 5; i++) {
                Usuario usuario = new Usuario();
                usuario.setNome("Usuário " + i);
                usuario.setEmail("usuario" + i + "@exemplo.com");
                usuario.setTelefone("123456789" + i);
                usuario.setSenha("senha" + i);
                usuario.setDataNascimento(LocalDate.of(1990 + i, 1, 1));
                dao.insert(usuario);
                System.out.println("Usuário cadastrado: " + usuario.getNome());
            }

            System.out.println("\nListando usuários:");
            List<Usuario> usuarios = dao.getAll();
            for (Usuario usuario : usuarios) {
                System.out.println("ID: " + usuario.getIdUsuario() +
                        ", Nome: " + usuario.getNome() +
                        ", Email: " + usuario.getEmail() +
                        ", Telefone: " + usuario.getTelefone() +
                        ", Data de Nascimento: " + usuario.getDataNascimento() +
                        ", Data Criada: " + usuario.getDataCriada());
            }

            System.out.println("\nPesquisando usuário com ID 1:");
            Usuario usuarioPesquisado = dao.pesquisar(1);
            System.out.println("Usuário encontrado: " + usuarioPesquisado.getNome());

            usuarioPesquisado.setNome("Usuário Atualizado");
            dao.atualizar(usuarioPesquisado);
            System.out.println("Usuário atualizado: " + usuarioPesquisado.getNome());

            dao.remover(5);
            System.out.println("Usuário com ID 5 removido.");

            try {
                dao.pesquisar(5);
            } catch (EntidadeNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }

            dao.close();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        } catch (EntidadeNaoEncontradaException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
