# import sys

# nome = 'vini'
# idade1 = 21
# idade2 = 21.9
# lista = []
# dicionario = {}
# tupla = ()

# print(f'A variavel do nome é do tipo {type(nome)} e o tamanho em é {sys.getsizeof(nome)} bytes')
# print(f'A variavel da idade 1 é do tipo {type(idade1)} e o tamanho em é {sys.getsizeof(idade1)} bytes')
# print(f'A variavel da idade 1 é do tipo {type(idade2)} e o tamanho em é {sys.getsizeof(idade2)} bytes')
# print(f'A variavel da idade 1 é do tipo {type(lista)} e o tamanho em é {sys.getsizeof(lista)} bytes')
# print(f'A variavel da idade 1 é do tipo {type(dicionario)} e o tamanho em é {sys.getsizeof(dicionario)} bytes')
# print(f'A variavel da idade 1 é do tipo {type(tupla)} e o tamanho em é {sys.getsizeof(tupla)} bytes')


# dicionario = {
#     "nome":"vinicius",
#     "sobrenome":"carvalho",
#     "idade":21,
#     "nascimento":"15/05/2002",
#     "pele":'branca',
#     "ideologia politica":"marxismo-leninismo-maoismo",
#     "ex favorita":"thais"
# }

# print(dicionario)

# for chave, valores in dicionario.items():
#     print(f'{chave.title()}: {valores}')
    
    
cadastros = {
    "usuario 1":{
        "nome":"julia",
        "idade":'20'
    },
    "usuario 2":{
        "nome":"thais",
        "idade":"20"
    }
}


for usuario, infos in cadastros.items():
    print(f"{usuario}:")
    for chaves, valores in infos.items():
        print(f'{chaves} - {valores}')       
    print()
    