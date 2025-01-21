from django.contrib.auth.hashers import make_password
from django.shortcuts import render, redirect
from .models import *
from .forms import *


def home(request):
    return render(request, 'home.html')

def login(request):
    form = UserForm()
    # Lógica para validar login
    
    return render(request, 'login.html', {'form':form})
    
def register(request):
    form = UserForm()
    
    if request.method == 'POST':
        form = UserForm(request.POST) # recebo os dados do POST do formulario
        
        if form.is_valid(): # valido formulario e recebo cleaned_data's
            username = form.cleaned_data['username']
            email = form.cleaned_data['email']
            password = form.cleaned_data['password']
            
            hashed_password = make_password(password) # criptografo a senha
            
            # novo objeto da classe modelo User, passando dados limpos e senha criptografada
            new_user = User(username=username, email=email, password=hashed_password) 
            new_user.save() # salvo no banco
            
            return redirect('login')
        
    return render(request, 'register.html', {'form':form})

def logout(request):
    return render(request, 'home.html')


def formularios(request):
    form1 = UserForm()
    form2 = UserForm2()
    return render(request, 'formulariostestes.html', {'form1':form1, 'form2':form2})