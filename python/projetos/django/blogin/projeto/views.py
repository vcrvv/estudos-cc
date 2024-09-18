from django.shortcuts import render
from .models import Usuario, Nota
from .forms import *
from django.contrib.auth.decorators import login_required


def home(request):
    notas = Nota.objects.all()
    notasform = NotaForm()
    
    if request.method == 'POST':
        novaNota = Nota(titulo = request.POST['titulo'], nota = request.POST['nota'])
        novaNota.save()
        
    return render(request, 'home.html', {'notas':notas, 'notasform': notasform})


def login(request):
    return render(request, 'login.html')


def register(request):
    formusuario = UsuarioForm()
    return render(request, 'register.html',  {'formusuario':formusuario})


# notas = Nota.objects.select_related('usuario').all()
    
#     if request.method == 'POST':
#         novaNota = Nota(titulo = request.POST['titulo'], nota = request.POST['nota'])
#         novaNota.save()    
        
#     return render(request, 'home.html', {'notas':notas})

