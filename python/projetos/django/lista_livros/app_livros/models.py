from django.db import models

# Create your models here.
class Livro(models.Model):
    id_livro = models.AutoField(primary_key=True)
    titulo = models.TextField(max_length=100, default='')
    autor = models.TextField(max_length=100, default='')
    ano = models.IntegerField(default='')
