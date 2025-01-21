from django.contrib import messages
from django.contrib.auth.hashers import make_password, check_password 
from django.shortcuts import render, redirect
from .forms import *
from .models import *


def home(request):
    return render(request, 'home.html')

    
def register(request):
    form = RegisterForm()
    
    if request.method == 'POST':
        form = RegisterForm(request.POST) # recebo os dados do POST do formulario
        
        if form.is_valid(): # valida formulario e envia cleaned_data's
            username = form.cleaned_data['username']
            email = form.cleaned_data['email']
            password = form.cleaned_data['password']
            
            hashed_password = make_password(password) # criptografa a senha
            
            # novo objeto da classe modelo User, passando dados limpos e senha criptografada
            new_user = User(username=username, email=email, password=hashed_password) 
            new_user.save() # salvo no banco
            
            return redirect('login')
        
    return render(request, 'register.html', {'form':form})


def login(request):
    form = LoginForm()

    if request.method == 'POST':
        form = LoginForm(request.POST) # recebe dados do POST do formulario
        
        if form.is_valid(): # valida dados do formulario 
            username = form.cleaned_data['username']
            password = form.cleaned_data['password']
            
            try:
                user = User.objects.get(username=username) # busca usuario no banco de dados
                
                if check_password(password, user.password): # compara senhas
                    request.session['user_id'] = user.id 
                    request.session['username'] = user.username
                    
                    messages.success(request, f'Bem-vindo, {user.username}!')
                    
                    return redirect('home')
                else:
                    messages.error(request, 'Senha incorreta')
            except User.DoesNotExist:
                messages.error(request, 'Usuário não encontrado')
                   
            
    return render(request, 'login.html', {'form':form})
    

def logout(request):
    request.session.pop('user_id', None)
    request.session.pop('username', None)
    messages.info(request, 'Você foi desconectado com sucesso')
    return redirect('home')


def formularios(request):
    return render(request, 'formulariostestes.html')