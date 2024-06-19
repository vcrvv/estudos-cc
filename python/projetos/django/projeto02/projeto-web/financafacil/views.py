from django.shortcuts import render
from django.http import HttpResponseRedirect
from .forms import NameForm


def logar(request):
    return render(request, './templates/entrar.html')


def registrar(request):
    return render(request, './templates/registrar.html')


def inicio(request):
    return render(request, './templates/inicial.html')


def get_name(request):
    # if this is a POST request we need to process the form data
    if request.method == "POST":
        # create a form instance and populate it with data from the request:
        form = NameForm(request.POST)
        # check whether it's valid:
        if form.is_valid():
            # process the data in form.cleaned_data as required
            # ...
            # redirect to a new URL:
            return HttpResponseRedirect("/thanks/")

    # if a GET (or any other method) we'll create a blank form
    else:
        form = NameForm()

    return render(request, "./templates/name.html", {"form": form})