# DICIONÁRIOS
# {}
dados = dict()
dados = {
    'nome':'Pedro',
    'idade':'25'
    }

print(dados)
print(dados['nome'])
print(dados['idade'])
print(dados.get('nome'))

dados['sexo'] = 'M'
print(dados)

del dados['idade']
print(dados)

print()

filme = {
    'titulo':'Duna',
    'ano':'2021',
    'diretor':'denis villeneuve'
    }

print(filme)
print(filme.values())
print(filme.keys())
print(filme.items())

print()

for key, value in filme.items():
    print(f'O {key} é {value}')