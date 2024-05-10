from random import choice
print('Sortear alunos para ajudar a professora!')
e1 = str(input('Estudante 1: '))
e2 = str(input('Estudante 2: '))
e3 = str(input('Estudante 3: '))
lista = [e1, e2, e3]
es = choice(lista)
print('Estudante escolhido foi {}'.format(es))