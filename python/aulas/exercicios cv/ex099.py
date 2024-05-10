from random import randint


def maior(lst):
    print(f'O maior valor é {max(sorted(lst))}')


lista = []
randint(1, 9)
for n in range(1, randint(1, 9)):
    lista.append(randint(1, 9))

print(f'A lista contém os valores {lista}')
maior(lista)
print('=' * 40)


# outra forma usando despacoteador

def maior(*num):
    cont = maior = 0
    print(f'\nAnalisando os valores...')
    for valor in num:
        print(f'{valor} ', end='')
        if cont == 0:
            maior = valor
        else:
            if valor > maior:
                maior = valor

        cont += 1
    print(f'Foram informados {cont} valores ao todo.')
    print(f'O maior valor informado foi {maior}.')


maior(1, 2, 3, 4, 5, 6)
maior(1, 2, 3)
maior(1, 2)
maior(1)
maior()
