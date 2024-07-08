from django.urls import path
from livros.views import *

urlpatterns = [
    path('', lista_livros, name='lista_livros'),
    path('adicionar/', adicionar_livro, name='adicionar_livro'),
    path('deletar/<int:id>', deletar_livro, name='deletar_livro')
]
