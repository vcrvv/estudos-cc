from flask import Flask, render_template, request
from weather_api import *

app = Flask(__name__)

@app.route('/', methods=['GET', 'POST',])
def home():
    if request.method == 'POST':
        city = request.form
        cidade = city['cidade']
        info = saber_tempo(saber_coordenadas(cidade))
        return render_template('home.html', info=info)
    else:
        return render_template('home.html')


if __name__ == '__main__':
    app.run(debug=True) 