gerenciador = {}
gols = []

gerenciador['nome'] = input('Nome do jogador:')
jogos = int(input('Quantos jogos jogou?: '))

for g in range(1, jogos + 1):
    gols.append(int(input(f'Gols na partida {g}: ')))

total_gols = sum(gols)
gerenciador['gols'] = gols 
gerenciador['total'] = total_gols

print(gerenciador)

for k, v in gerenciador.items():
    print(f'O campo {k} tem o valor {v}.')
    
c = 0
for p in gols:
    print(f'Na partida {1 + c}, fez {gols[0 + c]}')
    c += 1
print(f'Foi um total de {total_gols}')


'''for i, v in enumerate{jogador['nome']}:
        print(f'Na partida {i}, fez {v} gols ')

'''