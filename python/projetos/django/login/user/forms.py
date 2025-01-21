from django import forms
from .models import *


class RegisterForm(forms.Form):
    username = forms.CharField(max_length=50, label='Usuário')
    email = forms.EmailField()
    password = forms.CharField(max_length=256, min_length=8, label='Senha', 
                               widget=forms.PasswordInput())
    confirmPassword = forms.CharField(max_length=256, min_length=8, label='Confirmar Senha', 
                                      widget=forms.PasswordInput())
    
    
    def clean_email(self):
        email = self.cleaned_data.get('email')
        
        if User.objects.filter(email=email).exists():
            self.add_error(None, 'Este email já esta em uso.')
        
        return email
    
    
    def clean_confirmPassword(self):
        cleaned_data = super().clean()
         
        senha = cleaned_data.get('password')
        confirmar_senha = cleaned_data.get('confirmPassword')

        if senha != confirmar_senha:
            self.add_error(None,'As senhas não coincidem.')

        return confirmar_senha
    
    
class LoginForm(forms.Form):
    username = forms.CharField(max_length=50, label='Usuário')
    password = forms.CharField(max_length=256, min_length=8, label='Senha')
    
    
# class UserForm2(forms.ModelForm): # cria um formulario a partir de um Model
#     class Meta: 
#         model = User
#         fields = ['username', 'email', 'password'] # ou '__all__'
#         widgets = {
#             'username': forms.TextInput(attrs={'placeholder': 'Digite seu nome'}),
#             'email': forms.EmailInput(attrs={'placeholder': 'Email@exemplo.com'}),
#             'password': forms.PasswordInput(attrs={'label': 'Senha'})
#         }
