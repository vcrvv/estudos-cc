def ficha(nome, gols):
    if nome == '':
        nome = '<desconhecido>'

    if gols == '':
        gols = 0

    return f'O jogador {nome} fez {gols} gol(s) no campeonato.'
    
    
nome = input('Nome do Jogador: ')
gols = input('Número de Gols: ')
print(ficha(nome, gols))    
