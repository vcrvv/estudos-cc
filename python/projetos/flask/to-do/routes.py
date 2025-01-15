from flask import Blueprint, render_template, redirect, url_for, request
from models import Task

bp = Blueprint('tasks', __name__)

@bp.get('/')
def home():
    #tasks = db.session.query(Task).all()
    tasks = Task.get_all()
    return render_template('home.html', tasks=tasks)

@bp.post('/criar')
def create():
    title = request.form.get('title')
    Task.create(title)
    return redirect(url_for('tasks.home'))

@bp.get('/atualizar/<int:id>')
def update(id):
    task = Task.query.get_or_404(id)
    task.toggle_status()
    return redirect(url_for('tasks.home'))

@bp.get('/excluir/<int:id>')
def delete(id):
    # task = db.session.query(Task).filter(Task.id == id).first()
    task = Task.query.get_or_404(id)
    task.remove()
    return redirect(url_for('tasks.home'))