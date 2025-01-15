from flask import Flask
from flask_migrate import Migrate
from config import Config
from models import db
from routes import bp

app = Flask(__name__)
app.config.from_object(Config)

db.init_app(app)
Migrate(app, db)

app.register_blueprint(bp)

with app.app_context():
    db.create_all()

if __name__ == '__main__':
    app.run(debug=True)