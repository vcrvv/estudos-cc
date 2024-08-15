from django import forms
from .models import *

class CriarNovaLista(forms.ModelForm):    
    class Meta:
        model = listaTarefa
        fields = ("nome",)


# class CriarNovaLista(forms.ModelForm):
#     class meta:
#         nome = forms.CharField(label='Nome', max_length=200)
#         check = forms.BooleanField(label='Completo')
    
