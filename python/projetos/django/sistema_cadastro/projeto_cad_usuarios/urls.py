from django.contrib import admin
from django.urls import path
from app_cad_usuarios import views

urlpatterns = [
    path('', views.home, name='home'),
    path('usuarios/', views.users, name='listagem_usuarios'),
    path('admin/', admin.site.urls),
]
