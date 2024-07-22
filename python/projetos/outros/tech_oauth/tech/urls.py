from django.urls import path
from tech.views import index, membros

urlpatterns = [
    path('', index, name='index'),
    path('membros/', membros, name='membros')
]
