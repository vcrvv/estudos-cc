from django.db import models


class Usuario(models.Model):
    id = models.AutoField(primary_key=True, null=False)
    nome_usuario = models.CharField(max_length=50, null=False)
    email = models.EmailField(max_length=200, null=False)
    senha = models.CharField(max_length=100, null=False)
    
    def __str__(self) -> str:
        return self.nome_usuario
    

class Nota(models.Model):
    nome_usuario = models.ForeignKey(Usuario, on_delete=models.CASCADE)
    titulo = models.CharField(max_length=100, blank=True)
    nota = models.CharField(max_length=516)
    
    

# Adicionar atraves do 'python manage.py shell':
#     from projeto.models import Usuario importar classe
#     Usuario.objects.all() Mostrar todos os objetos
#     u = Usuario(nome_usuario='', emaii='', senha='') criar objeto
#     u.save() salvar objeto
    