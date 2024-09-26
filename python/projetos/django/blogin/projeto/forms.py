from django import forms
from .models import Usuario, Nota


class UsuarioForm(forms.ModelForm):
    class Meta:
        model = Usuario
        fields = ['nome', 'email', 'senha']
        widgets = {
            'nome': forms.TextInput(attrs={'placeholder': 'Digite o seu nome'}),
            'email': forms.EmailInput(attrs={'placeholder': 'seuemail@.com'}),
            'senha': forms.PasswordInput(attrs={'placeholder': '******'}),
        }
        
        
class NotaForm(forms.ModelForm):
    class Meta:
        model = Nota
        fields = ['titulo', 'nota']
        widgets = {
            'titulo': forms.TextInput(attrs={
                'placeholder': 'Digite o titulo aqui',
                'class': 'caixa-texto'
            }),
            'nota': forms.Textarea(attrs={
                'rows': 4,
                'placeholder': 'Digite alguma nota aqui',
                'class': 'caixa-texto'
            }),
        }
