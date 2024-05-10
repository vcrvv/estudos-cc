from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')
def home():
    Usuario = {
        'nome' : 'Vini'
    }
    return render_template('inicial.html', usuario=Usuario)

@app.route('/login')
def login():
    return render_template('login.html')

@app.route('/cadastro')
def cadastro():
    return render_template('register.html')

if __name__ == '__main__':
    app.run(debug=True)