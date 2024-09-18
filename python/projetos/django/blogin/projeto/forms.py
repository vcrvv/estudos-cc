from django import forms
from .models import Usuario, Nota


class UsuarioForm(forms.ModelForm):
    class Meta:
        model = Usuario
        fields = "__all__"
        
        
class NotaForm(forms.ModelForm):
    class Meta:
        model = Nota
        fields = ['titulo', 'nota']
