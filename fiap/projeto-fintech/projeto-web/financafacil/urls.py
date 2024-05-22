from django.urls import path
from . import views

urlpatterns = [
    path('inicio', views.inicio, name='inicio'),
    path('logar', views.logar, name='logar'), # logar dps da barra carrega a funcao "logar" em views
    path('registrar', views.registrar, name='registrar'),
    path('get_name', views.get_name, name='get_name')
]
