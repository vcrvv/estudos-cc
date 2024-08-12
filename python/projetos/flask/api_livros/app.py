# API - É um lugar para disponibilizar  recursos e/ou funcionalidades
# 1. Objetivo - criar uma api que disponibiliza a consulta, criacção, edição e exclusão de livros
# 2. URL base - localhhost (server)
# 3. Endpoints
# - localhost/livros (GET)
# - localhost/livros (POST)
# - localhost/livros/id (GET)
# - localhost/livros/id (PUT)
# - localhost/livros/id (DELETE)
# 4. Quais recursos - Livros
from flask import Flask, jsonify, request

app = Flask(__name__)

livros = [
    {
        'id': 1,
        'título': 'O Manifesto Comunista',
        'autor': 'Karl Marx'
    },
    {
        'id': 2,
        'título': 'Imperialismo: Fase Superior do Capitalismo',
        'autor': 'Vladimir Lenin'
    },
    {
        'id': 3,
        'título': 'Citações do Presidente Mao Tsetung',
        'autor': 'Mao Tsetung'
    }
]


# consultar todos
@app.route('/livros', methods=['GET'])
def obter_livros():
    return jsonify(livros)


# consultar (id)
@app.route('/livros/<int:id>', methods=['GET'])
def obter_livro_p_id(idn):
    for livro in livros:
        if livro.get('id') == idn:
            return jsonify(livro)


# editar
@app.route('/livros/<id:id>', methods=['PUT'])
def editar_livro_p_id(idn):
    livro_alterado = request.get_json()
    for indice, livro in enumerate(livros):
        if livro.get('id') == idn:
            livros[indice].update(livro_alterado)
            return jsonify(livros[indice])


# criar
@app.route('/livros', methods=['POST'])
def incluir_livro():
    novo_livro = request.get_json()
    livros.append(novo_livro)


# excluir
@app.route('/livros/<int:id>', methods=['DELETE'])
def excluir_livro(idn):
    for indice, livro in enumerate(livros):
        if livro.get('id') == idn:
            del livros[indice]

    return jsonify(livros)


app.run(port=5000, host='localhost', debug=True)
