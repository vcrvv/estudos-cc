
from utilidadesCuV import moeda

num = float(input('Digite o preço: R$: '))
print(f'A metade de {num} é {moeda.metade(num)}')
print(f'O dobro de {num} é {moeda.dobrar(num)}')
print(f'Aumentando 10%, temos {moeda.aumentar(num, 10)}')
print(f'Reduzindo 15%, temos {moeda.reduzir(num, 15)}')