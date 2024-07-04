from django.urls import path
from approjeto.views import *

urlpatterns = [
    path('emp', emp),
    path('show', show),
    path('edit/<int:id>', edit),
    path('update/<int:id>', update),
    path('delete/<int:id>', destroy),
]
