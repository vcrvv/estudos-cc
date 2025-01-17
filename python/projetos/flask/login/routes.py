from flask import request, session, render_template, redirect, url_for, flash
from main import app, db, bc
from models import User 

# Criar um auth_routes separado para atenticações
# redefinir senha com email codigo enviado por email

@app.route('/', methods=['GET'])
def home():
    return render_template('home.html')    

@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':
        user = request.form
        
        username = user['username']
        email = user['email']
        password = user['password']
        confirmPassword = user['confirmPassword']
        
        if not all([username, email, password, confirmPassword]):
            flash('Todos os campos são obrigatórios')
            return redirect(url_for('register'))
        
        if User.query.filter_by(username = username).first():
            flash("Nome de usuario já cadastrado.")
            return redirect(url_for('register'))
        
        if User.query.filter_by(email=email).first():
            flash("Email já cadastrado.")
            return redirect(url_for('register'))
                 
        if password != confirmPassword:        
            flash("Senhas incompatíveis")
            return redirect(url_for('register'))
        
        new_user = User(
            username = username,
            email = email,
            password = bc.generate_password_hash(password))
        
        db.session.add(new_user)
        db.session.commit()
        
        session['username'] = username
        
        flash("Conta criada com sucesso!", 'success')
        return redirect(url_for('home'))
                
                     
    return render_template('register.html')


@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        form = request.form
        
        user = User.query.filter_by(email = form['email']).first()
        
        if user:
            if bc.check_password_hash(user.password, form['password']):
                session['username'] = user.username
                flash('Login realizado com sucesso! :)', "success")
                return redirect(url_for('home'))
            
            flash("Senha incorreta.")
        else:
            flash("Email não encontrado.")
            
    return render_template('login.html')


@app.route('/logout')
def logout():
    session.clear()
    flash("Deslogou com sucesso.", "success")    
    return redirect(url_for('home')) 
