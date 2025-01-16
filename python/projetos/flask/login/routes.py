from flask import request, session, render_template, redirect, url_for
from main import app, db
from models import User

# Criar um auth_routes separado para atenticações

# validar dados no cadastro
# senha forte
# encriptar senha antes de add no banco
# validar email

# autenticação de dados no login
# comparar senha do formulario encriptado com a senha no banco de dados
# verificar se conta existe
# mostrar mensagens de erro no login e no cadastro

# redefinir senha com email codigo enviado por email

@app.route('/', methods=['GET'])
def home():
    return render_template('home.html')    

@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':
        user = request.form
        new_user = User(
            username = user['username'],
            email = user['email'],
            password = user['password']
        )
        db.session.add(new_user)
        db.session.commit()
        
        session['username'] = user['username']
        
        return redirect(url_for('home'))
              
    return render_template('register.html')


@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        form = request.form
        user = User.query.filter_by(email = form['email']).first()
        print(user)
        
        if user.password == form['password']:
            session['username'] = user.username
            return redirect(url_for('home'))
        
    return render_template('login.html')


@app.route('/logout')
def logout():
    session['username'] = None
    return redirect(url_for('home')) 
