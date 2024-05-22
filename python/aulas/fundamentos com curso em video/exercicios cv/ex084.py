#ler nome e peso de varias pessoas e por dentro de outra lista
#mostrar qnts pessoas foram cadastradas. 
#listagem com as pessoas mais pesadas e as mais leves

lista = []
pessoa = []
maior = menor = 0
while True:
    pessoa.append(str(input('Nome: ')))
    pessoa.append(float(input('Peso: ')))
    if len(lista) == 0:
        maior = menor = pessoa[1]
    else: 
        if maior < pessoa[1]:
            maior = pessoa[1]
        if menor > pessoa[1]:
            menor = pessoa[1]
    lista.append(pessoa[:])
    pessoa.clear()
    res = input('Continuar? [S/N]').upper().strip()[0]
    if 'N' in res:
        break
print(lista)
print(f'Pessoas cadastradas: {len(lista)}')
print(f'O maior peso foi de: {maior}Kg')
print(f'O menor peso foi de: {menor}Kg')

##
