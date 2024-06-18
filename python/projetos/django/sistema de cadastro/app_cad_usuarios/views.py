from django.shortcuts import render
from .models import Usuario


def home(request):
    return render(request, 'usuarios/home.html')


def users(request):
    # Salva os dados da tela para o banco de dados. 
    novo_usuario = Usuario()
    novo_usuario.nome = request.POST.get('nome') # a variavel 'nome' do banco de dados 'Usuario' recebe a informação POST de 'nome'
    novo_usuario.idade = request.POST.get('idade')
    novo_usuario.save() # salvar os dados da tela no banco de dados
    
    # Exibir todos os usúarios já cadastrados em uma nova página
    usuarios = {
        'usuarios':Usuario.objects.all()
    }
    
    # Retornar os dados para a página de listagem de usuários
    return render(request, 'usuarios/usuarios.html', usuarios)
    