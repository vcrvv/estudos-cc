cadastrados = []
pessoa = {}
soma_idade = 0

while True:
    pessoa['nome'] = input('Nome: ')
    
    while True:
        pessoa['sexo'] = input('Sexo: [M/F]').upper()[0] 
        if pessoa['sexo'] not in 'MF':
            print('Opção inválida. Tente novamente.')
        else:
            break
            
    pessoa['idade'] = int(input('Idade: '))
    
    cadastrados.append(pessoa.copy())
    soma_idade += pessoa['idade']
    
    while True:
        res = input('Continuar? [S/N]').upper()[0]
        if res in 'SN':
            break
        print('Opção inválida. Tente novamente.')
        
    if 'N' in res:
        break
    
media = soma_idade / len(cadastrados) 
print(f'O grupo tem {len(cadastrados)} pessoas')
print(f'A média de idade do grupo é de {media:5.2f} anos')
print(f'As mulheres cadastradas são: ', end='') #
for p in cadastrados:
    if p['sexo'] in 'Ff':
        print(f'{p['nome']} ', end='')
print()     
print(f'Lista de pessoas que estão com a idade acima da média: ') #
for p in cadastrados:
    if p['idade'] >= media:
        print(' ', end='')
        for k, v in p.items():
            print(f'{k} = {v}; ', end='')
        print()    