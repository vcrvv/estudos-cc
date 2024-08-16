from django.contrib import admin
from .models import *

class ListandoTarefas(admin.ModelAdmin):
    list_display = ('id', 'usuario', 'nome')
    list_display_links = ("id","nome")
    search_fields = ('usuario', "nome")
    list_per_page = 10
    

admin.site.register(listaTarefa, ListandoTarefas)

class ListandoItems(admin.ModelAdmin):
    list_display = ("listatarefa", "texto", "completado")
    list_display_links = ('listatarefa', 'texto')
    search_fields = ("listatarefa", 'texto')
    list_filter = ("listatarefa", 'completado')
    list_editable = ("completado",)
    list_per_page = 10

admin.site.register(Item)
