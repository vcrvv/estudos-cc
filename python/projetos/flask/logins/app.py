from flask import Flask
from flask_sqlalchemy import SQLAlchemy
import mysql.connector
from flask_wtf import FlaskForm
from wtforms import StringField, SubmitField, PasswordField, validators


app = Flask(__name__)
app.config.from_pyfile('config.py')
db = SQLAlchemy(app)

conc = mysql.connector.connect(
    host='127.0.0.1',
    user='root',
    password='admin'
)

cursor = conc.cursor()

class ForumularioUsuario(FlaskForm):
    nickname = StringField('Nickname', [validators.data_required(), validators.length(min=1, max=8)])
    senha = PasswordField('Senha', [validators.data_required(), validators.length(min=1, max=100)])
    login = SubmitField('Login')


class Usuarios(db.Model):
    usuario = db.Column(db.String(45), primary_key=True)
    email = db.Column(db.String(45), nullable=False)
    senha = db.Column(db.String(45), nullable=False)

    def __repr__(self):
        return '<Name %r>' % self.name


if __name__ == '__main__':
    app.run()