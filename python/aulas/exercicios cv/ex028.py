from random import randint
from time import sleep

print('Adivinhe o número!!')
print('Maquina: Estou pensando......')
sleep(2)
print('Maquina: Pronto!')
m = randint(1, 5)
n = int(input('Maquina: Digite um número de 1 a 5: '))
print('Maquina: hmmmm....')
sleep(2)
if n == m:
    print('Maquina: VOCE ACERTOU!! INCRIVEL!!!')
else:
    print('Maquina: Voce errou!! kkkkk eu pensei no número {} :D'.format(m))

