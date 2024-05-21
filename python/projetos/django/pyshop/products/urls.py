from django.urls import path
from . import views

urlpatterns = [
    path('', views.index), # vazio dps da barra carrega a função "index" dentro de "views"
    path('new', views.new) 
]
