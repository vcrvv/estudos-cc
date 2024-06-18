from django.db import models


# Models é o objeto python que represetam uma tabela no banco de dados
# ira transformar o codigo pytthon em codigo sql e criar o banco de dados
class Usuario(models.Model):
    id_usuarios = models.AutoField(primary_key=True)
    nome = models.TextField(max_length=255)
    idade = models.IntegerField()

