import random
print('Sortear a ordem de apresentação dos estudantes!')
e1 = (input('Estudante 1: '))
e2 = (input('Estudante 2: '))
e3 = (input('Estudante 3: '))
lista = [e1, e2, e3]
random.shuffle(lista)
print('A ordem de apresentação sorteada foi {}'.format(lista))
