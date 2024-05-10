from django.urls import path
from . import views

urlpatterns = [
    path('entrar', views.Entrar),
    path('registrar', views.Registrar),
    path('inicio', views.Inicio),
    path('adicionar_transacao', views.Add_transacao)
]

