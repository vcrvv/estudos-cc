#import math # é uma biblioteca de comandos
from math import sqrt, factorial #importar apenas selecionados

num = int(input('digite um número: '))
raiz = sqrt(num)
fac = factorial(num)
print('Resultado: {} e {}'.format(raiz, fac))
#ceil - arredondar p cima
#floor - arredondar p baixo

import random #usar aleatorios
num = random.randint(1, 1000)
print(num)


#importação do módulo calc.py
import calc
#solicitando valores ao usuário
valor1 = input("Digite um valor: ")
valor2 = input("Digite outro valor: ")
#armazenando a soma
soma = calc.somar(valor1, valor2)
#exibindo a soma
print("A soma é {}".format(soma))
