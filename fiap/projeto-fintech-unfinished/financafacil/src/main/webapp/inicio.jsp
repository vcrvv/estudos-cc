<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Finança Fácil</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <link rel="stylesheet" href="<c:url value="resources/static/style.css"/>"/>
</head>
<body>

<%@include file="header.jsp" %>

<div class="container mt-4">
  <div class="card cartao-financas">
    <p style="margin: 0;">Conta</p>
    <div class="container-flex">
      <div class="coluna-flex-main">
        <div class="info-card">Saldo</div>
        <h2 class="valor-card">R$ ${saldo}</h2>
      </div>
      <div class="coluna-flex-main">
        <div class="info-card">Entradas</div>
        <h2 class="valor-card">R$ ${entradas}</h2>
      </div>
      <div class="coluna-flex-main">
        <div class="info-card">Saídas</div>
        <h2 class="valor-card">R$ ${saidas}</h2>
      </div>
    </div>
  </div>

  <h4 class="card-title mt-3" style="font-size: medium;">Últimas Transações</h4>

  <c:forEach var="transacao" items="${transacoes}">
    <div class="card cartao-transacao">
      <div class="container-flex">
        <div class="coluna-flex">
          <div class="categoria">${transacao.categoria}</div>
          <div class="informacoes-transacao">
            <span>${transacao.tipoTransacao}</span>
          </div>
        </div>
        <div class="coluna-flex" style="text-align: right;">
          <div class="valor">R$ ${transacao.valor}</div>
          <div class="data-hora">${transacao.dataHora}</div>
        </div>
      </div>
    </div>
  </c:forEach>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
