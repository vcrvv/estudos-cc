from flask import Flask, render_template, redirect, url_for , request
from flask_migrate import Migrate
from flask_sqlalchemy import SQLAlchemy

# flask --app todo  run --debug
app = Flask(__name__)

#app.config['SQLALCHEMY_DATABASE_URI'] = ''
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///db.sqlite'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
db = SQLAlchemy(app)
migrate = Migrate(app, db)

class Task(db.Model):
    id = db.Column(db.Integer, primary_key=True) 
    title = db.Column(db.String(100))
    completed = db.Column(db.Boolean)
    
    def __repr__(self):
        return f'<title {self.id}>'
    
@app.before_request
def create_tables():
    db.create_all()
 
    
#@app.route('/', methods=['GET'])
@app.get('/')
def home():
    #tasks = db.session.query(Task).all()
    tasks = Task.query.all()
    return render_template('home.html', tasks=tasks)


@app.post('/criar')
def create():
    title = request.form.get('title')
    new_task = Task(title=title, completed=False)
    db.session.add(new_task)
    db.session.commit()
    return redirect(url_for('home'))


@app.get('/atualizar/<int:id>')
def update(id):
    task = Task.query.filter_by(id=id).first()
    task.completed = not task.completed
    db.session.commit()
    return redirect(url_for('home'))


@app.get('/excluir/<int:id>')
def delete(id):
    # task = db.session.query(Task).filter(Task.id == id).first()
    task = Task.query.filter_by(id=id).first()
    db.session.delete(task)
    db.session.commit()
    return redirect(url_for('home'))

if __name__ == '__main__':
    app.run(debug=True)