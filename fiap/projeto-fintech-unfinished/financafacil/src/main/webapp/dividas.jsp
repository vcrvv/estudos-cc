<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Histórico de Dívidas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/static/style.css"/>"/>
  </head>
  <body>
    <jsp:include page="header.jsp" />

    <div class="container">
      <div class="container" style="width: 100%">
        <h2 class="card-title mb-0 mt-3">Dívidas</h2>
        <div class="container" style="display: flex; align-items: center; padding: 20px 0px">
          <input type="text" class="form-control" id="inputBusca" placeholder="palavra-chave"/>
          <button type="button" class="botao">Buscar</button>
          <button type="button" class="botao">
            <a href="adddivida.jsp">Criar</a>
          </button>
        </div>
      </div>


      <c:forEach var="divida" items="${dividas}">
        <div class="card cartao-transacao">
          <div class="container-flex">
            <div class="coluna-flex">
              <div class="categoria">${divida.categoria}</div>
              <div class="informacoes-transacao">
                <span>${divida.tipoDivida}</span>
              </div>
            </div>
            <div class="coluna-flex" style="text-align: right">
              <div class="valor">R$ ${divida.valor}</div>
              <div class="data-hora">${divida.dataHora}</div>
            </div>
          </div>
        </div>
      </c:forEach>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
