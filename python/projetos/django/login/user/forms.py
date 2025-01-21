from django import forms
from .models import *
from django.core.exceptions import ValidationError
from django.contrib.auth.password_validation import validate_password


class UserForm(forms.Form): # na mão
    username = forms.CharField(max_length=50, label='Usuário')
    email = forms.EmailField()
    password = forms.CharField(max_length=256, min_length=8, label='Senha')
    confirmPassword = forms.CharField(max_length=256, min_length=8, label='Confirmar Senha')
    
    
    # def clean_password(self):
    #     senha = self.cleaned_data.get('password')
        
    #     if not validate_password(senha):
    #         raise ValidationError("A senha não atende aos requisitos de segurança.")
        
    #     return senha
    
    def clean(self):
        cleaned_data = super().clean()  # Obtém os dados limpos
        senha = cleaned_data.get('password')
        confirmar_senha = cleaned_data.get('confirmPassword')

        if senha != confirmar_senha:
            self.add_error('confirmPassword', 'As senhas não coincidem.')

        return cleaned_data
    
    
    
class UserForm2(forms.ModelForm): # cria um formulario a partir de um Model
    class Meta: 
        model = User
        fields = ['username', 'email', 'password'] # ou '__all__'
        widgets = {
            'username': forms.TextInput(attrs={'placeholder': 'Digite seu nome'}),
            'email': forms.EmailInput(attrs={'placeholder': 'Email@exemplo.com'}),
            'password': forms.PasswordInput(attrs={'label': 'Senha'})
        }
