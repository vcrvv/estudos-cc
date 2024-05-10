from random import randint

lista = []

print('Valores sorteados:')
for x in range(1, 5):
    num = randint(0, 9)
    print(f'O jogador{x} tirou {num}')
    # Criar um dicionário separado para cada jogador
    jogador = {'Jogador': x, 'Dado': num}
    lista.append(jogador)

# Ordenar a lista com base nos valores dos dados em ordem decrescente
lista.sort(key=lambda jogador: jogador['Dado'], reverse=True)

print('\nTabela de Classificação:')
for i, jogador in enumerate(lista, start=1):
    print(f'{i}o.:  Jogador{jogador["Jogador"]} com {jogador["Dado"]}')
    
##

    
