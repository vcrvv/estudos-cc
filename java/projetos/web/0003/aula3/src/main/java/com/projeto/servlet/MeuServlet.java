package com.projeto.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/meu-servlet")
public class MeuServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    PrintWriter out = resp.getWriter();
    HttpSession session = req.getSession();
    String x = "Hello, World!";
    out.println(x);
    out.println(session);
    
    req.getRequestDispatcher("servlet.html").forward(req, resp);
  }
}