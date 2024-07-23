# gerar 5 números aleatórios em uma tupla e mostrar o maior e o menor

from random import randint
numeros = (randint(0,9), randint(0,9), randint(0,9), randint(0,9), randint(0,9), )
print('Os valores sorteados foram: ', end='')
for n in numeros:
    print(f'{n} ', end='')
print(f'\nO maior  valor sorteado foi: {max(numeros)}')
print(f'\nO menor valor sorteado foi: {min(numeros)}')

##3