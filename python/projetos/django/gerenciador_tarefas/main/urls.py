from django.urls import path
from . import views

urlpatterns = [
    path('<int:id>', views.index, name="index"),
    path('', views.inicio, name='home'),
    path('criar/', views.criar, name='criar'),
]
