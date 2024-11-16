package br.com.fiap.financafacil.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import br.com.fiap.financafacil.model.Transacao;
import br.com.fiap.financafacil.service.TransacaoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/inicio")
public class InicioServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            TransacaoService service = new TransacaoService();
            List<Transacao> ultimasTransacoes = service.obterUltimasTransacoes(10);

            request.setAttribute("ultimasTransacoes", ultimasTransacoes);
            request.getRequestDispatcher("inicio.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Map<String, Double> saldoMap = null;
        try {
            TransacaoService service = new TransacaoService();
            saldoMap = service.calcularSaldoUltimos30Dias();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        request.setAttribute("saldo", saldoMap.get("saldo"));
        request.setAttribute("entradas", saldoMap.get("entradas"));
        request.setAttribute("saidas", saldoMap.get("saidas"));
    }
}
