# perguntar quantos jogos quer fazer e sortear 6 números de 1 a 60 pra cada jogo

from random import randint
from time import sleep

print('Jogo da MEGA-SENA')

jogos = int(input('Quantos jogos deseja? '))

for j in range(1, jogos + 1):
    numeros = []
    cont = 0
    while True:
        num = randint(0, 60)
        if num not in numeros:
            numeros.append(num)
            cont += 1
        if cont >= 6:
            break
        
    print(f'Jogo {j}: {sorted(numeros)}')
    sleep(1)
    
print('BOA SORTE!!')