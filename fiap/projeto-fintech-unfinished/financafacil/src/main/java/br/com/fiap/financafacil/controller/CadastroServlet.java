package br.com.fiap.financafacil.controller;

import br.com.fiap.financafacil.dao.ContaDao;
import br.com.fiap.financafacil.dao.UsuarioDao;
import br.com.fiap.financafacil.model.Conta;
import br.com.fiap.financafacil.model.Usuario;
import br.com.fiap.financafacil.util.CriptografiaUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("cadastro.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String senha = request.getParameter("senha");
        String confirmarSenha = request.getParameter("confirmarSenha");
        String dataNascimento = request.getParameter("dataNascimento");

        if (!senha.equals(confirmarSenha)) {
            request.setAttribute("erro", "As senhas não coincidem.");
            request.getRequestDispatcher("cadastro.jsp").forward(request, response);
            return;
        }

        try {
            String senhaCriptografada = CriptografiaUtils.criptografar(senha);
            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setTelefone(telefone);
            usuario.setSenha(senhaCriptografada);
            usuario.setDataNascimento(java.time.LocalDate.parse(dataNascimento));

            try (UsuarioDao usuarioDao = new UsuarioDao()) {
                usuarioDao.insert(usuario);

                ContaDao contaDao = new ContaDao();
                Conta conta = new Conta(usuario.getIdUsuario(), 0.0);
                contaDao.insert(conta);

                request.setAttribute("sucesso", "Cadastro realizado com sucesso!");
                request.getRequestDispatcher("cadastro.jsp").forward(request, response);
            } catch (SQLException e) {
                e.printStackTrace();
                request.setAttribute("erro", "Erro ao inserir dados no banco: " + e.getMessage());
                request.getRequestDispatcher("cadastro.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("erro", "Erro inesperado: " + e.getMessage());
            request.getRequestDispatcher("cadastro.jsp").forward(request, response);
        }
    }
}
