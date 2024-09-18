from django.db import models


class Usuario(models.Model):
    id = models.AutoField(primary_key=True)
    nome = models.CharField(max_length=50, unique=True)
    email = models.EmailField(max_length=200, unique=True)
    senha = models.CharField(max_length=100)
    
    def __str__(self) -> str:
        return self.nome
    


class Nota(models.Model):
    id = models.AutoField(primary_key=True)
    nome_usuario = models.ForeignKey(Usuario, on_delete=models.CASCADE, related_name='notas', null=True) 
    titulo = models.CharField(max_length=100, blank=True)
    nota = models.TextField()
    publicada = models.DateTimeField(auto_now_add=True)
    modificada = models.DateTimeField(auto_now=True)
    
    def __str__(self) -> str:
        return self.titulo if self.titulo else 'Sem título'
    
    
# Adicionar atraves do 'python manage.py shell':
#     from projeto.models import Usuario importar classe
#     Usuario.objects.all() Mostrar todos os objetos
#     u = Usuario(nome_usuario='', emaii='', senha='') criar objeto
#     u.save() salvar objeto
# -------------------------------------------------------------------------------------

