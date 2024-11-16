<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar sticky-top navbar-expand-sm">
    <div class="container">
        <div class="logo">
            <a class="navbar-brand" href="#">
                <img src="<c:url value="resources/icones/Component 1 branco.svg"/>" alt="logo finançafacil"/>
            </a>
        </div>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarContent">
            <a class="linkhist" href="inicio"><p>Inicio</p></a>
            <a class="linkhist" href="transacoes"><p>Transações</p></a>
            <a class="linkhist" href="investimentos"><p>Investimentos</p></a>
            <a class="linkhist" href="dividas"><p>Dívidas</p></a>
            <a class="linkhist" id="linksair" href="sair"><p>Sair</p></a>
          </div>

        <div class="headerProfile d-lg-flex">
            <p>${usuario}</p>
            <a class="navbar-brand" href="#">
                <img src="<c:url value="resources/icones/usuario.svg"/>
            </a>
            <a href="sair"><p>Sair</p></a>
        </div>
    </div>
</nav>

