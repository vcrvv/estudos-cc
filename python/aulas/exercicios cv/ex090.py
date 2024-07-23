aluno = dict()

aluno['nome'] = input('Nome: ')
aluno['media'] = float(input(f'Média de {aluno['nome']}: '))

situacao = ''

if aluno['media'] >= 7.0:
    aluno['situacao'] = 'Aprovado'
elif 6.0 < aluno['media'] < 7.0:
    aluno['situacao'] = 'Recuperação'
else:
    aluno['situacao'] = 'Reprovado'
    
    
print(f'Nome é igual a {aluno['nome']}')
print(f'Média é igual a {aluno['media']}')
print(f'Situação é igual a {aluno['situacao']}')

print()
#tambem
for k, v in aluno.items():
    print(f'  -{k} é igual a {v}')