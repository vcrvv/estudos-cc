package br.com.fiap.financafacil.controller;

import br.com.fiap.financafacil.model.Transacao;
import br.com.fiap.financafacil.service.TransacaoService;
import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/transacoes")
public class TransacaoServlet extends HttpServlet {
    private TransacaoService transacaoService;

    @Override
    public void init() throws ServletException {
        try {
            transacaoService = new TransacaoService();
        } catch (SQLException e) {
            throw new ServletException("Erro ao inicializar o serviço de transações.", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");

        try {
            List<Transacao> transacoes = transacaoService.listarTransacoes();
            request.setAttribute("transacao", transacoes);
            request.getRequestDispatcher("transacoes.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException("Erro ao listar transações.", e);
        }



        switch (acao) {
            case "editar":
                editar(request, response);
                break;
            case "remover":
                remover(request, response);
                break;
            case "pesquisar":
                pesquisar(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");

        switch (acao) {
            case "adicionar":
                adicionar(request, response);
                break;
            case "editar":
                editarPost(request, response);
                break;
            default:
                response.sendRedirect("transacoes");
                break;
        }
    }

    private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Transacao> transacoes = transacaoService.listarTransacoes();
            request.setAttribute("transacao", transacoes);
            request.getRequestDispatcher("transacoes.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException("Erro ao listar transações.", e);
        }
    }

    private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idTransacao = Integer.parseInt(request.getParameter("id"));
        try {
            Transacao transacao = transacaoService.buscarTransacaoPorId(idTransacao);
            request.setAttribute("transacao", transacao);
            request.getRequestDispatcher("edittransacao.jsp").forward(request, response);
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            throw new ServletException("Erro ao buscar transação para edição.", e);
        }
    }


    private void remover(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idTransacao = Integer.parseInt(request.getParameter("id"));
        try {
            transacaoService.removerTransacao(idTransacao);
            response.sendRedirect("transacoes");
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            throw new ServletException("Erro ao remover transação.", e);
        }
    }


    private void pesquisar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        try {
            List<Transacao> transacoes = transacaoService.pesquisarTransacoes(keyword);
            request.setAttribute("transacao", transacoes);
            request.getRequestDispatcher("transacoes.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException("Erro ao pesquisar transações.", e);
        }
    }

    private void adicionar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String valorStr = request.getParameter("valor");
            String idContaStr = request.getParameter("idConta");

            Double valor = (valorStr != null && !valorStr.isEmpty()) ? Double.parseDouble(valorStr) : 0.0;

            Integer idConta = (idContaStr != null && !idContaStr.isEmpty()) ? Integer.parseInt(idContaStr) : 0;

            String tipo = request.getParameter("tipo");
            String metodo = request.getParameter("metodo");
            String categoria = request.getParameter("categoria");
            String descricao = request.getParameter("descricao");

            Transacao transacao = new Transacao(valor, tipo, metodo, categoria, descricao, idConta);
            transacaoService.adicionarTransacao(transacao);

            response.sendRedirect("transacoes");
        } catch (SQLException | NumberFormatException e) {
            throw new ServletException("Erro ao adicionar transação.", e);
        }
    }


    private void editarPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idTransacao = Integer.parseInt(request.getParameter("id"));
        try {
            Double valor = Double.parseDouble(request.getParameter("valor"));
            String tipo = request.getParameter("tipo");
            String metodo = request.getParameter("metodo");
            String categoria = request.getParameter("categoria");
            String descricao = request.getParameter("descricao");
            Integer idConta = Integer.parseInt(request.getParameter("idConta"));

            Transacao transacao = new Transacao(idTransacao, valor, tipo, metodo, categoria, descricao, null, idConta);
            transacaoService.atualizarTransacao(transacao);

            response.sendRedirect("transacoes");
        } catch (SQLException | NumberFormatException e) {
            throw new ServletException("Erro ao editar transação.", e);
        }
    }
}
