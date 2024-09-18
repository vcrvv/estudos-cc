from django.contrib import admin
from .models import Usuario, Nota

class UsuarioAdmin(admin.ModelAdmin):
    list_display = ["id", "nome", "email", "senha"]
    list_display_links = ["id"]
    search_fields = ["id", "nome", "email"]
    
admin.site.register(Usuario, UsuarioAdmin)


class NotaAdmin(admin.ModelAdmin):
    list_display = ['id', 'nome_usuario', 'titulo', 'nota', 'publicada', 'modificada']
    list_display_links = ['id']

admin.site.register(Nota, NotaAdmin)