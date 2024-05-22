# ler nome e duas notas e guardar em uma lista composto
# depois mostrar boletim com a média de todos os alunos
# e permitir que mostre a nota individual


ficha = list()

while True:
    nome = input('Nome: ')
    nota1 = float(input('Nota 1: '))
    nota2 = float(input('Nota 2: '))
    media = (nota1 + nota2) / 2
    ficha.append([nome, [nota1, nota2], media])
    
    res = input('Quer continuar? [S/N] ').upper()
    if res in 'N':
        break
    
print(f'{'NO.':<4}{'NOME':<10}{'MÉDIA':>8}')

for i, a in enumerate(ficha):
    print(f'{i:<4}{a[0]:<10}{a[2]:>8.1f}')
    
while True:
    opc = int(input('Mostrar notas de qual estudante? (999 interrompe): '))
    if opc == 999:
        print('Finalizado')
        break
    if opc <= len(ficha) - 1:
        print(f'Notas de {ficha[opc][0]} são {ficha[opc][1]}')
######