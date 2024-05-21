from django.urls import path
from . import views

urlpatterns = [
    path('logar', views.logar), # logar dps da barra carrega a funcao "logar" em views
    path('registrar', views.registrar),
    path('inicio', views.inicio)
]
