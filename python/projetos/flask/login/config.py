from datetime import timedelta
import os, secrets


# SQLALCHEMY_DATABASE_URI = \
#     '{SGBD}://{usuario}:{senha}@{servidor}/{database}'.format(
#         SGBD='mysql+mysqlconnector',
#         usuario='root',
#         senha='root',
#         servidor='localhost',
#         database='mydb5'
#     )

SQLALCHEMY_DATABASE_URI = 'sqlite:///db.sqlite'
SQLALCHEMY_TRACK_MODIFICATIONS = False

SECRET_KEY = os.environ.get('FLASK_SECRET_KEY') or secrets.token_hex(16)

SESSION_COOKIE_SECURE = True  # Só envia cookies por HTTPS
SESSION_COOKIE_HTTPONLY = True  # Previne acesso ao cookie via JavaScript
PERMANENT_SESSION_LIFETIME = timedelta(minutes=30)  # Sessão expira em 30 minutos
