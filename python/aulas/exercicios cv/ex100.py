from random import randint
from time import sleep

lista = []

def sorteia():
    print(f'Sorteando os 5 valores da lista: ', end='')
    for c in range(1, 6):
        num = randint(0, 9)
        lista.append(num)
        print(num, end=' ')
        sleep(0.2)
        
def somaPar():
    num = 0
    # for c in range(0, len(lista)):
    #     if lista[c] % 2 == 0:
    #         num += lista[c]
            
    for c in lista:
        if c % 2 == 0:
            num += c
        
    print(f'Somando os valores pares de: {lista}, temos {num}')
    

sorteia()
print()
somaPar()
        
        
