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
            UsuarioDao usuarioDao = new UsuarioDao();

            // Criando e inserindo novos usuários
            for (int i = 1; i <= 5; i++) {
                Usuario usuario = new Usuario();
                usuario.setNome("Usuário " + i);
                usuario.setEmail("usuario" + i + "@exemplo.com");
                usuario.setTelefone("123456789" + i);
                usuario.setSenha("senha" + i); // Criptografia automática ao definir
                usuario.setDataNascimento(LocalDate.of(1990 + i, 1, 1));
                usuarioDao.insert(usuario);
                System.out.println("Usuário cadastrado: " + usuario.getNome());
            }

            // Listando todos os usuários
            System.out.println("\nListando usuários:");
            List<Usuario> usuarios = usuarioDao.getAll();
            for (Usuario usuario : usuarios) {
                System.out.println("ID: " + usuario.getIdUsuario() +
                        ", Nome: " + usuario.getNome() +
                        ", Email: " + usuario.getEmail() +
                        ", Telefone: " + usuario.getTelefone() +
                        ", Data de Nascimento: " + usuario.getDataNascimento() +
                        ", Data Criada: " + usuario.getDataCriada());
            }

            // Pesquisando um usuário por ID
            System.out.println("\nPesquisando usuário com ID 1:");
            Usuario usuarioPesquisado = usuarioDao.pesquisar(1);
            System.out.println("Usuário encontrado: " + usuarioPesquisado.getNome());

            // Atualizando um usuário
            usuarioPesquisado.setNome("Usuário Atualizado");
            usuarioDao.atualizar(usuarioPesquisado);
            System.out.println("Usuário atualizado: " + usuarioPesquisado.getNome());

            // Removendo um usuário
            usuarioDao.remover(5);
            System.out.println("Usuário com ID 5 removido.");

            // Tentando pesquisar um usuário removido
            try {
                usuarioDao.pesquisar(5);
            } catch (EntidadeNaoEncontradaException e) {
                System.out.println(e.getMessage());
            }

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        } catch (EntidadeNaoEncontradaException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
