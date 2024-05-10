#ler nome idade e sexo de 4 pessoas 
#retornar a média das idades
#o nome do homem mais velho
#e quantas mulheres tem menos de 20 anos
#------------------------------------
somaidade = 0
mediaidade = 0
maioridadehomem = 0
nomevelho = 0
totmulher = 0
for p in range(1, 5):
    print('--------{} PESSOA-------- '.format(p))
    nome = str(input('Nome: ')).strip()
    idade = int(input('Idade: '))
    sexo = str(input('Sexo [M/F] ')).strip()
    somaidade += idade
    if p == 1 and sexo in 'Mm':
        maioridadehomem = idade
        nomevelho = nome
    if sexo in 'Mm' and idade > maioridadehomem:
        maioridadehomem = idade
        nomevelho = nome
    if sexo in 'Ff' and idade < 20:
        totmulher += 1   
mediaidade = somaidade / 4
print('-----RESULTADO-----')
print(f'A média de idade do grupo é {mediaidade}')
print('O homem mais velho tem {} anos e se chama {}'.format(maioridadehomem, nomevelho))
print(f'Ao todo são {totmulher}')