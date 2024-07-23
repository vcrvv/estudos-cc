def linhas():
    print('-' * 20)

# função lambda
# sintaxe simples em uma linha. lambda dps os parametros,  ':' e a lógica da função
soma = lambda x, y: x + y
mult = lambda x, y: x * y
print(soma(10, 5), mult(10, 5))
linhas()

# com map
itens = [1, 2, 3, 4, 5]
dobro = list(map(lambda x: x * 2, itens))
print(dobro)

numeros = list(map(lambda x: x - 1, [1, 2, 3, 4, 5]))
print(numeros)

contas = [{'nome':'Vini', 'saldo':1000}, {'nome':'letica', 'saldo':1200}, {'nome':'Augustus', 'saldo':900}]
print(list(map(lambda x: x['saldo'] > 1000, contas)))
linhas()

# com reduce
from functools import reduce

soma = reduce((lambda x, y: x + y), [1, 2, 3 ,4])
print(soma)
linhas()

# com filter
lista = [1,2,3,4,5,6,7,8,9,67,43,22,12,14,78,95,43,99]
numeros_pares = list(filter(lambda x: x % 2 == 0, lista))
numeros_impares = list(filter(lambda y: y % 2 != 0, lista))
print(numeros_pares, numeros_impares)

listaa = range(-5, 5)

menor_q_zero = list(filter(lambda x: x < 0, listaa))
print(menor_q_zero)