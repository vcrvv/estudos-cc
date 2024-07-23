from random import randint
print('Adivinhe o número de 0 a 10')
m = randint(1, 10)
tentativas = 0
n = 0
while n != m:
    n = int(input('Maquina: Digite um número de 1 a 10: '))
    tentativas += 1
    if n != m: 
        print('nope.')
print('Voce acertou!! \nE precisou de {} tentativas. '.format(tentativas))


