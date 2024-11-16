<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Adicionar Investimento</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/static/style.css"/>"/>
  </head>
  <body>

    <jsp:include page="header.jsp" />

    <div class="container mt-3 d-flex justify-content-center align-items-center">
      <div class="formulario">
        <header>
          <h2 class="card-title mb-0">Novo Investimento</h2>
          <p>Preencha os campos para adicionar</p>
        </header>

        <form method="post" action="">
          <div class="details personal">
            <div class="fields">
              <div class="input-field" style="width: 120px">
                <label for="valor">Valor</label>
                <input id="valor" name="valor" type="number" placeholder="Valor" required />
              </div>

              <div class="input-field" style="width: 120px">
                <label for="taxa">Taxa (%)</label>
                <input id="taxa" name="taxa" type="number" step="0.01" placeholder="Taxa (%)" required />
              </div>

              <div class="input-field" style="width: 100%">
                <label for="titulo">Título</label>
                <input id="titulo" name="titulo" type="text" placeholder="Título" required />
              </div>

              <div class="input-field">
                <label for="dataini">Data Inicial</label>
                <input id="dataini" name="dataini" type="date" placeholder="Data Inicial" required />
              </div>

              <div class="input-field">
                <label for="datafinal">Data Final</label>
                <input id="datafinal" name="datafinal" type="date" placeholder="Data Final" required />
              </div>
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
