<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Entrar na Conta</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="resources/static/entrar.css"/>

  </head>

  <body>
    <section>
      <div class="card fat">
        <div>
          <img src="resources/icones/Component 1.svg"/>
          <img src="resources/icones/FinançaFacil.svg"/>
        </div>
        <header>
          <h2 class="card-title mb-0">Entrar na Conta</h2>
        </header>

        <form action="entrar" method="POST" class="my-login-validation">
          <div class="form-group-sm mb-4">
            <label for="email">E-mail</label>
            <input id="email" type="email" class="form-control" name="email" required placeholder="email@email.com"/>
          </div>

          <div class="form-group-sm mb-4">
            <label for="senha">Senha</label>
            <input id="senha" type="password" class="form-control" name="senha" required placeholder="*****"/>
          </div>

          <div class="form-group-sm mb-4">
            <button type="submit" class="btn btn-primary btn-block">Entrar</button>
          </div>

          <c:if test="${not empty erro}">
            <div class="alert alert-danger">
                ${erro}
            </div>
          </c:if>
          <c:if test="${param.erro != null}">
            <div class="alert alert-danger" role="alert">
              Usuário ou senha incorretos. Tente novamente.
            </div>
          </c:if>

          <c:if test="${param.sucesso != null}">
            <div class="alert alert-success" role="alert">
              Cadastro realizado com sucesso! Faça o login.
            </div>
          </c:if>

          <div class="mt-4 text-center">Não possui uma conta?
            <a href="cadastro">Criar aqui</a>
          </div>
        </form>
      </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
