from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from flask_wtf.csrf import CSRFProtect

app = Flask(__name__)
app.config.from_pyfile('config.py') 

db = SQLAlchemy(app)   
csrf = CSRFProtect(app)

from routes import *
from models import *

with app.app_context():
    db.create_all()

if __name__ == '__main__':
    app.run(debug=True)
    