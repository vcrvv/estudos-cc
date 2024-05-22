#MODULARIZAÇÃO
#criar funções em um arquivo separado e importar as funções em outro

from uteis import numeros

num = int(input('Digite um valor: '))
fat = numeros.fatorial(num)
dob = numeros.dobro(num)
print(f'O fatorial de {num} é {fat}')
print(f'O dobro de {num} é {dob}')