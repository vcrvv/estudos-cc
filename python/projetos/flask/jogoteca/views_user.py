from flask import render_template, request, redirect, session, flash, url_for
from jogoteca import app
from models import Usuarios
from helpers import ForumularioUsuario
from flask_bcrypt import check_password_hash



@app.route('/register', methods=['POST', ])
def register():
    proxima = request.args.get('proxima')
    form = ForumularioUsuario()
    return render_template('register.html', proxima=proxima, form=form)

@app.route('/login')
def login():
    proxima = request.args.get('proxima')
    form = ForumularioUsuario()
    return render_template('login.html', proxima=proxima, form=form)


@app.route('/autenticar', methods=['POST', ])
def autenticar():
    form = ForumularioUsuario(request.form)
    print(form.data)
    print(form.nickname.data)
    # REFAZER LÓGICA
    try:
        usuario = Usuarios.query.filter_by(nickname=form.nickname.data)
        senha = check_password_hash(usuario.senha, form.senha.data)
        if usuario and senha:
            session['usuario_logado'] = usuario.nickname
            flash(usuario.nickname + ' logado com sucesso!')
            proxima_pagina = request.form['proxima']
            return redirect(proxima_pagina)
    except:
        flash('Não foi possível realizar o login.')
        return redirect(url_for('login'))
        


@app.route('/logout')
def logout():
    session['usuario_logado'] = None
    flash('Logout efetuado com sucesso!')
    return redirect(url_for('index'))