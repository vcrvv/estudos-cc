from django.shortcuts import render
from .models import Livro

# Create your views here.
def index(request):
    return render(request, 'home.html')


def livros(request):
    novo_livro = Livro()
    novo_livro.titulo = request.POST.get('titulo')
    novo_livro.autor = request.POST.get('autor')
    novo_livro.ano = request.POST.get('ano')
    novo_livro.save()
    
    livros = {
        'livros':Livro.objects.all()
    }
    
    return render(request, 'livros.html', livros)
    