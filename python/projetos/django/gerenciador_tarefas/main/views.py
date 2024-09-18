from django.shortcuts import render, redirect
from django.http import HttpResponse, HttpResponseRedirect
from .models import *
from .forms import *
from django.contrib.auth.decorators import login_required


def index(request, id):
    ls = listaTarefa.objects.get(id=id)

    if ls in request.user.listatarefa.all():
        if request.method == 'POST':
            print(request.POST)
            
            if request.POST.get("salvar"):
                for item in ls.item_set.all():
                    if request.POST.get("c" + str(item.id)) == 'clicado':
                        item.completo = True
                    else:
                        item.completo = False
                        
                    item.save()
                    
            elif request.POST.get('novoItem'):
                txt = request.POST.get("textoItem")
                if len(txt) > 2:
                    ls.item_set.create(texto=txt, completo=False)
                else:
                    print('invalid')
                    
        return render(request, 'lista.html', {"ls":ls})
    
    return render(request, 'inicio.html', {'ls':ls})


def inicio(request):
    return render(request, 'inicio.html')


def criar(request):
    if request.user.is_authenticated:
        if request.method == 'POST':
            form = CriarNovaLista(request.POST)
            
            if form.is_valid():
                n = form.cleaned_data['nome']
                t = listaTarefa(nome=n)
                t.save()
                request.user.listatarefa.add(t)
                
            return HttpResponseRedirect(f"/{t.id}")
        
        else:
            form = CriarNovaLista()
            
        return render(request, 'criar.html', {'form':form})
    
    return redirect('login')
