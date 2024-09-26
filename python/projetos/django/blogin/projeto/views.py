from django.shortcuts import redirect, render
from .forms import *
from .models import Usuario, Nota
from django.contrib.auth import logout, login as auth_login
from django.contrib import messages
from django.contrib.auth.hashers import check_password, make_password


def home(request):
    notas = Nota.objects.all()
    notasform = NotaForm()
    
    if request.method == 'POST':
        if request.user.is_authenticated:
            novaNota = Nota(
                nome_usuario= request.user,  
                titulo=request.POST['titulo'],
                nota=request.POST['nota']
            )
            novaNota.save()
        messages.error(request, 'Apenas usuarios logados podem postar notas.')
        
    return render(request, 'home.html', {'notas':notas, 'notasform': notasform})


def register(request):
    formusuario = UsuarioForm()
    
    if request.method == 'POST':
        form = UsuarioForm(request.POST)
        
        if form.is_valid():
            nome = form.cleaned_data['nome']
            email = form.cleaned_data['email']
            senha = form.cleaned_data['senha']
            
            usuario = Usuario(nome = nome, email = email, senha = make_password(senha))
            usuario.save()
            
            return redirect('login')
            
    return render(request, 'register.html',  {'formusuario':formusuario })


def login(request):
    formusuario = UsuarioForm()
    
    if request.method == 'POST':
        nome = request.POST['nome']
        senhaa = request.POST['senha']
    
        try:
            usuario = Usuario.objects.get(nome=nome)
            if check_password(senhaa, usuario.senha):
                auth_login(request, usuario)
                return redirect('home')
            else:
                messages.error(request, 'Senha incorreta. Tente novamente.')
            
        except Usuario.DoesNotExist:
            messages.error(request, 'E-mail não cadastrado.')
        
    return render(request, 'login.html', {'formusuario': formusuario})


def sair(request):
    logout(request)
    return redirect('home')
    