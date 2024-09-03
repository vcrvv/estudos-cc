

import random
from faker import Faker
from validate_docbr import CPF
from escola.models import *

import os
os.environ.setdefault('DJANGO_SETTINGS_MODULE','setup.settings')


import django
django.setup()

from django.core.management import call_command

dados = [
    ('CPOO1', 'Curso de Python Orientação à Objetos 01'),
    ('CPOO2', 'Curso de Python Orientação à Objetos 02'),
    ('CPOO3', 'Curso de Python Orientação à Objetos 03'),
    ('CDJ01', 'Curso de Django 01'),
    ('CDJ02', 'Curso de Django 02'),
    ('CDJ03', 'Curso de Django 03'),
    ('CDJ04', 'Curso de Django 04'),
    ('CDJ05', 'Curso de Django 05'),
    ('CDJRF01', 'Curso de Django REST Framework 01'),
    ('CDJRF02', 'Curso de Django REST Framework 02'),
    ('CDJRF03', 'Curso de Django REST Framework 03'),
    ('CDJRF04', 'Curso de Django REST Framework 04'),
    ('CJV01', 'Curso de Java 01'),
    ('CJV02', 'Curso de Java 02'),
    ('CJV03', 'Curso de Java 03'),
    ('CJV04', 'Curso de Java 04'),
]

niveis = ['B', 'I', 'A']

def criar_cursos():
    for codigo, descricao in dados:
        nivel = random.choice(niveis)
        Curso.objects.create(codigo=codigo, descricao=descricao, nivel=nivel)
        print("fim.")

criar_cursos()


def criando_pessoas(quantidade_de_pessoas):
    fake = Faker('pt_BR') 
    Faker.seed(10) # quantidade
    for _ in range(quantidade_de_pessoas):
        cpf = CPF() 
        nome = fake.name() # gera nome aleatorio
        email = '{}@{}'.format(nome.lower(),fake.free_email_domain())
        email = email.replace(' ', '') # retira os espaços vazios
        cpf = cpf.generate() # gera um cpf valido aleatorio
        data_nascimento = fake.date_of_birth(minimum_age=18, maximum_age=30)  # Gera uma data de nascimento aleatória entre 18 e 30 anos
        celular = "{} 9{}-{}".format(random.randrange(10, 89), random.randrange(4000, 9999), random.randrange(4000, 9999)) # celular aleatorio
        p = Estudante(nome=nome, email=email, cpf=cpf, data_nascimento=data_nascimento, celular=celular) # cria um objeto com todas as informações geradas
        p.save() # salva o objeto
    
    print('fim')
        
