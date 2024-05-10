from django.shortcuts import render

def Entrar(request):
    return render(request, 'entrar.html')

def Registrar(request):
    return render(request, 'registrar.html')

def Inicio(request):
    return render(request, 'inicial.html')

def Add_transacao(request):
    return render(request, 'add_transacao.html')