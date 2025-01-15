from flask_sqlalchemy import SQLAlchemy

db = SQLAlchemy()

class Task(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(100))
    completed = db.Column(db.Boolean, default=False)

    def __repr__(self):
        return f'<Task {self.id}: {self.title}>'

    @staticmethod
    def get_all():
        return Task.query.all()

    @staticmethod
    def create(title):
        task = Task(title=title, completed=False)
        db.session.add(task)
        db.session.commit()
        return task

    def toggle_status(self):
        self.completed = not self.completed
        db.session.commit()

    def remove(self):
        db.session.delete(self)
        db.session.commit()