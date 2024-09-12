from django import forms

class NameForm(forms.Form):
    seu_nome = forms.CharField(label='Seu nome', max_length=100)
    email = forms.EmailField(label='Seu Email', max_length=200)
    
