<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Cadastro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/static/cadastro.css"/>"/>
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css"/>
  </head>
  <body>
    <div class="container">
      <div class="formulario">
        <div>
          <img src="<c:url value="/resources/icones/Component 1.svg"/>" alt="" />
          <img src="<c:url value="/resources/icones/FinançaFacil.svg"/>" alt="" />
        </div>
        <header>
          <h2 class="card-title mb-0">Cadastrar-se</h2>
        </header>

        <form action="cadastro" method="POST">
          <div class="form first">
            <div class="details personal">

              <div class="fields">
                
                <div class="input-field">
                  <label>Nome Completo</label>
                  <input name="nome" type="text" placeholder="Digite o seu nome" required/>
                </div>

                <div class="input-field">
                  <label>Email</label>
                  <input name="email" type="email" placeholder="Digite o seu email" required />
                </div>
                
                <div class="input-field">
                  <label>Data de Nascimento</label>
                  <input name="dataNascimento" type="date" required />
                </div>

                <div class="input-field">
                  <label>Telefone</label>
                  <input name="telefone" type="text" placeholder="(00) 00000-0000" required />
                </div>

                <div class="input-field">
                  <label>Senha</label>
                  <input name="senha" type="password" placeholder="Digite uma senha" required />
                </div>

                <div class="input-field">
                  <label>Confirmar Senha</label>
                  <input name="confirmarSenha" type="password" placeholder="Confirme a sua senha" required />
                </div>
              </div>
            </div>

            <div style="display: inline-block;">
              <button class="submit mt-3" style="margin: 25px 0 0 0" type="submit">
                <span class="btnText">Finalizar</span>
              </button>
              <div class="mt-2 text-center"> Já possui uma conta? <a href="entrar">Entrar</a>
              </div>
            </div>
          </div>
        </form>

        <c:if test="${not empty erro}">
          <div class="alert alert-danger">
            ${erro}
          </div>
        </c:if>
        <c:if test="${not empty sucesso}">
          <div class="alert alert-success">
            ${sucesso}
          </div>
        </c:if>
        
      </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
