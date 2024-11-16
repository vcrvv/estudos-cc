<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Editar Transação</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/static/style.css"/>"/>
</head>
<body>

<jsp:include page="header.jsp" />

<div class="container mt-3">
    <h2>Editar Transação</h2>
    <form method="post" action="transacoes">
        <input type="hidden" name="action" value="editar" />
        <input type="hidden" name="id" value="${transacao.idTransacao}" />

        <div class="mb-3">
            <label for="valor" class="form-label">Valor</label>
            <input type="number" class="form-control" id="valor" name="valor" value="${transacao.valor}" required />
        </div>
        <div class="mb-3">
            <label for="categoria" class="form-label">Categoria</label>
            <input type="text" class="form-control" id="categoria" name="categoria" value="${transacao.categoria}" required />
        </div>
        <div class="mb-3">
            <label for="tipo" class="form-label">Tipo</label>
            <select class="form-control" id="tipo" name="tipo" required>
                <option value="Entrada" ${transacao.tipo == 'Entrada' ? 'selected' : ''}>Entrada</option>
                <option value="Saída" ${transacao.tipo == 'Saída' ? 'selected' : ''}>Saída</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="metodo" class="form-label">Método</label>
            <select class="form-control" id="metodo" name="metodo" required>
                <option value="Transferencia" ${transacao.metodo == 'Transferencia' ? 'selected' : ''}>Transferência</option>
                <option value="PIX" ${transacao.metodo == 'PIX' ? 'selected' : ''}>PIX</option>
                <option value="Credito" ${transacao.metodo == 'Credito' ? 'selected' : ''}>Crédito</option>
                <option value="Debito" ${transacao.metodo == 'Debito' ? 'selected' : ''}>Débito</option>
                <option value="Boleto" ${transacao.metodo == 'Boleto' ? 'selected' : ''}>Boleto</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="descricao" class="form-label">Descrição</label>
            <input type="text" class="form-control" id="descricao" name="descricao" value="${transacao.descricao}" />
        </div>

        <button type="submit" class="btn btn-primary">Salvar alterações</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
