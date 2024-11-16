package br.com.fiap.financafacil.controller;

import br.com.fiap.financafacil.dao.UsuarioDao;
import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.model.Usuario;
import br.com.fiap.financafacil.util.CriptografiaUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/entrar")
public class EntrarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("entrar.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        try {
            try (UsuarioDao usuarioDao = new UsuarioDao()) {
                Usuario usuario = usuarioDao.pesquisarPorEmail(email);

                if (CriptografiaUtils.verificarSenha(senha, usuario.getSenha())) {
                    HttpSession session = request.getSession();
                    session.setAttribute("usuario", usuario.getNome());
                    session.setAttribute("usuarioId", usuario.getIdUsuario());
                    response.sendRedirect("inicio.jsp");
                } else {
                    request.setAttribute("erro", "Senha incorreta.");
                    request.getRequestDispatcher("entrar.jsp").forward(request, response);
                }
            } catch (SQLException | EntidadeNaoEncontradaException e) {
                request.setAttribute("erro", e.getMessage());
                request.getRequestDispatcher("entrar.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("erro", "Erro inesperado: " + e.getMessage());
            request.getRequestDispatcher("entrar.jsp").forward(request, response);
        }
    }
}
