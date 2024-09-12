from django.contrib import admin
from .models import Usuario


class UsuarioAdmin(admin.ModelAdmin):
    list_display = ("id", "nome_usuario", "email")
    list_display_links = ("id")
    search_fields = ("id", "nome_usuario", "email")
    ordering = ('id',)

admin.site.register(Usuario)