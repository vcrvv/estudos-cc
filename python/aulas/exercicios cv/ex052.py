#se é número primo
#numero primo e um numero divido por 1 e por ele mesmo
num = int(input('Digite um número: '))
if num > 1 and num % num == 1 and num % 1 == num:
    print('É primo.')
else:
    print('Não é primo.')