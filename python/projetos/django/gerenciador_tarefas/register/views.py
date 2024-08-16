from django.shortcuts import render, redirect
from .forms import CadastroForm
from django.contrib.auth.models import User
from django.contrib.auth import logout

def cadastro(request):
    form = CadastroForm()
    
    if request.method == 'POST':
        form = CadastroForm(request.POST)
        
        if form.is_valid():
            nome = form['username'].value()
            email = form['email'].value()
            senha = form['password1'].value()
            
            usuario = User.objects.create_user(username = nome, email = email, password = senha)
            usuario.save()

            return redirect('login')
              
    return render(request, 'cadastro.html', {'form':form})

def sair(request):
    logout(request)
    return redirect('login')