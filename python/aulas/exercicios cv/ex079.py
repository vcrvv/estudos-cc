numeros = list()
while True:
    n = int(input('Digite um valor: '))
    if n not in numeros:
        numeros.append(n)
        print('Valor adicionado com sucesso. ')
    else:
        print('Valor duplicado! Não vou adicionar. ')
    r = str(input('Quer adicionar? [S/N]'))
    if r in 'Nn':
        break
numeros.sort()
print(f'Voce digitou os valores {numeros}')
#########