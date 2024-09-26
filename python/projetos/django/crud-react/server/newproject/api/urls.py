from django.urls import path
from .views import *

urlpatterns = [
    path('books/', get_books, name='get_books'),
    path('books/create', create_book, name='create_book'),
    path('books/<int:pk>', book_detail, name='book_detail')
]
