<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Histórico de Investimentos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/static/style.css"/>"/>
  </head>
  <body>
    <%@include file="header.jsp" %>
    <div class="container">
      <h2 class="card-title mb-0" style="margin-top: 20px;">Investimentos</h2>

      <div class="container" style=" display: flex; align-content: baseline; align-items: center; padding: 20px 0px 20px 0px;">
        <form action="historicoInvestimentos" method="GET">
          <input type="text" class="form-control" name="busca" id="inputBusca" placeholder="palavra-chave"/>
          <button type="submit" class="btn btn-primary ms-2">Buscar</button>
          <a href="addInvestimento.jsp" class="btn btn-success ms-2">Criar</a>
        </form>
      </div>


      <c:if test="${not empty erro}">
        <div class="alert alert-danger mt-3">
          ${erro}
        </div>
      </c:if>
      <c:if test="${not empty sucesso}">
        <div class="alert alert-success mt-3">
          ${sucesso}
        </div>
      </c:if>


      <div class="formulario" style="min-height: 336px; max-width: none; padding: 0px">
        <div class="table-container">
          <c:forEach var="investimento" items="${investimentos}">
            <div class="card cartao-transacao">
              <div class="container-flex">
                <div class="coluna-flex">
                  <div class="categoria">${investimento.categoria}</div>
                  <div class="informacoes-transacao">
                    <span>${investimento.tipoTransacao}</span>
                  </div>
                </div>
                <div class="coluna-flex" style="text-align: right;">
                  <div class="valor">R$ ${investimento.valor}</div>
                  <div class="data-hora">${investimento.dataHora}</div>
                </div>
              </div>
            </div>
          </c:forEach>
        </div>
      </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
