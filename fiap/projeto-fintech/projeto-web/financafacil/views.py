from django.shortcuts import render


def logar(request):
    return render(request, 'entrar.html')


def registrar(request):
    return render(request, 'registrar.html')


def inicio(request):
    return render(request, 'inicial.html')