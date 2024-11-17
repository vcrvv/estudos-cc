<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<nav class="navbar sticky-top navbar-expand-sm">
    <div class="container">
        <div class="logo">
            <a class="navbar-brand" href="#">
                <img src="../icones/Component 1 branco.svg" alt="logo finançafacil"/>
            </a>
        </div>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarContent">
            <a class="linkhist" href="inicio.jsp"><p>Inicio</p></a>
            <a class="linkhist" href="transacoes.jsp"><p>Transações</p></a>
            <a class="linkhist" href="investimentos.jsp"><p>Investimentos</p></a>
            <a class="linkhist" href="dividas.jsp"><p>Dívidas</p></a>
            <a class="linkhist" id="linksair" href="sair.jsp"><p>Sair</p></a>
          </div>

        <div class="headerProfile d-lg-flex">
            <p>User</p>
            <a class="navbar-brand" href="#">
                <img src="../icones/usuario.svg" alt="Usuario"/>
            </a>
            <a href="#"><p>Sair</p></a>
        </div>
    </div>
</nav>

