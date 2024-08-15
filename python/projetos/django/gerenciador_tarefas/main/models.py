from django.db import models
from django.contrib.auth.models import User

class listaTarefa(models.Model):
    usuario = models.ForeignKey(User, on_delete=models.CASCADE, related_name='listatarefa', null=True)
    nome = models.CharField(max_length=200)
    
    def __str__(self):
        return self.nome
    

class Item(models.Model):
    listatarefa = models.ForeignKey(listaTarefa, on_delete=models.CASCADE)
    texto = models.CharField(max_length=300)
    completo = models.BooleanField(default=False, blank=True)
    
    def __str__(self):
        return self.texto
    