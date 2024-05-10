# leia nome, ano de nascimento e carteira de trabalho e cadastre-os com a idade em um dicionario
#se CTPS for diferente de 0, o dicionário tambem recebra o ano de contratação e o salario
#calcula e acrescente, alem da idade, com quantos anos ira se aposentar
#30 anos de contribuição é 0 minímo

from datetime import date

atual = date.today().year

cadastro = {}

cadastro['nome'] = input('Nome: ')
ano_nascimento = int(input('Ano de nascimento: '))
cadastro['idade'] = atual - ano_nascimento

cadastro['ctps'] = int(input('Carteira de trabalho: '))

if cadastro['ctps'] != 0:
    cadastro['ano de contratacao'] = int(input('Ano de contratação: '))
    cadastro['salario'] = int(input('Salário: '))
    
cadastro['aposentadoria'] = (cadastro['ano de contratacao'] + 30) - ano_nascimento

print(cadastro)
for k, v in cadastro.items():
    print(f'{k} tem o valor {v}')
