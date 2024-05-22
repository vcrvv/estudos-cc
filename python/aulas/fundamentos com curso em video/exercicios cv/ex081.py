lista = []
while True:
    lista.append(int(input('Digite um valor: ')))
    res = input('Quer continuar? [S/N]').upper().strip()[0]
    while res not in 'SsNn':
        print('Opção inválida. ', end='')
        res = input('Quer continuar? [S/N]').upper().strip()[0]
    if res == 'N':
        break
print(f'Ao todo foram digitados {len(lista)} números')
print(f'A lista ordenada decrescente {sorted(lista, reverse=True)}')
if 5 in lista:
    print('O valor faz parte da lista!')
else:
    print('O valor não faz parte da lista!')
