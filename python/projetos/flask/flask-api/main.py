from flask import Flask, jsonify, render_template

# flask --app main  run --debug

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('inicio.html')

@app.route('/api/usuarios', methods=['GET', 'POST'])
def usuarios():
    dados = [
        {
            'id':1,
            'nome':'vinicius',
            'idade':22
            
        },
        {
            'id':2,
            'nome':'clarice',
            'idade':21
        },
    ]
    return jsonify(dados)

    
if __name__ == '__main__':
    app.run(debug=True)
