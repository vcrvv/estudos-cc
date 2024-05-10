from flask import Flask, render_template

app = Flask(__name__)

@app.route("/")
def homepage():
    titulo = "Gestão de Usuários"
    usuarios = [
        {"nome": "Guilherme", "membro_ativo": True},
        {"nome": "Vinicius", "membro_ativo": False},
        {"nome": "Julia", "membro_ativo": True}
    ]
    return render_template("homepage.html", titulo=titulo, usuarios=usuarios)


if __name__ == "__main__":
    app.run(debug=True)