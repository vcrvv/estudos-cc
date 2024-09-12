from django.shortcuts import render
from django.http import HttpResponseRedirect
from .models import Usuario

from .forms import NameForm

def home(request):
    usuarios = Usuario.objects.all() # referenciando aqui não é preciso usar o redirect após o save e o else tbm 
    
    if request.method == 'POST':
        novoUsuario = Usuario(
            nome_usuario = request.POST['nome_usuario'],
            email = request.POST['email'],
            senha = request.POST['senha']
        )
        novoUsuario.save()    
        
    return render(request, 'home.html', {'usuarios':usuarios})


def login(request):
    return render(request, 'login.html')

def register(request):
    return render(request, 'register.html')



def teste(request):
    if request.method == "POST":
        form = NameForm(request.POST)
        if form.is_valid():
            # ...
            return HttpResponseRedirect("/thanks/")
    else:
        form = NameForm()

    return render(request, "teste_form.html", {"form": form})

