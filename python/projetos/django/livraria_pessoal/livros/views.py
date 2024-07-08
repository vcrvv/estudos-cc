from django.shortcuts import render, redirect
from livros.models import Livro


def lista_livros(request):
    livros = Livro.objects.all()
    return render(request, 'lista.html', {'livros': livros})

def adicionar_livro(request):
    if request.method == 'POST':
        livro = Livro(titulo = request.POST['titulo'],
                      autor = request.POST['autor'],
                      lancamento = request.POST['lancamento'],
                      descricao = request.POST['descricao'])
        livro.save()
        return redirect('lista_livros')
    return render(request, 'adicionar.html')


def deletar_livro(request, id):
     livro = Livro.objects.get(id=id)
     livro.delete()
     return redirect('lista_livros')