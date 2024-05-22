from utilidadesCuV import moeda

num = float(input('Digite o preço: R$: '))
print(f'A metade de {moeda.moeda(num)} é {moeda.metade(num, True)}')
print(f'O dobro de {moeda.moeda(num)} é {moeda.dobrar(num, True)}')
print(f'Aumentando 10%, temos {moeda.aumentar(num, 10, True)}')
print(f'Reduzindo 15%, temos {moeda.reduzir(num, 15, True)}')