<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Adicionar Transação</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/static/style.css"/>"/>
  </head>
  <body>

    <jsp:include page="header.jsp"/>

    <div class="container mt-3 d-flex justify-content-center align-items-center">
      <div class="formulario">
        <header>
          <h2 class="card-title mb-0">Nova Transação</h2>
          <p>Preencha os campos para adicionar</p>
        </header>

        <form method="post" action="transacoes?acao=adicionar">
          <div class="details personal">
            <div class="fields">
              <div class="input-field" style="width: 120px">
                <label for="valor">Valor</label>
                <input id="valor" name="valor" type="number" placeholder="Valor" required />
              </div>

              <div class="input-field" style="width: 100%">
                <label for="categoria">Categoria</label>
                <input id="categoria" name="categoria" type="text" placeholder="Categoria" required />
              </div>

              <div class="input-field" style="width: 120px">
                <div class="input-group" style="display: block">
                  <label for="tipo">Tipo</label>
                  <select class="form-select" id="tipo" name="tipo" style="width: 120px" required>
                    <option value="" selected>Escolha...</option>
                    <option value="Entrada">Entrada</option>
                    <option value="Saída">Saída</option>
                  </select>
                </div>
              </div>

              <div class="input-field" style="width: 120px">
                <div class="input-group" style="display: block">
                  <label for="metodo">Método</label>
                  <select class="form-select" id="metodo" name="metodo" style="width: 152px" required>
                    <option value="" selected>Escolha...</option>
                    <option value="Transferencia">Transferência</option>
                    <option value="PIX">PIX</option>
                    <option value="Credito">Crédito</option>
                    <option value="Debito">Débito</option>
                    <option value="Boleto">Boleto</option>
                  </select>
                </div>
              </div>

              <div class="input-field" style="width: 100%">
                <label for="descricao">Descrição</label>
                <input id="descricao" name="descricao" type="text" placeholder="Descrição" />
              </div>

              <input type="hidden" name="idConta" value="${conta.id}" required/>

            </div>
          </div>
          <button type="submit">
            <span>Adicionar</span>
          </button>
        </form>

      </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
