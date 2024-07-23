with open('teste.txt', 'w') as arquivo:
    arquivo.write('oi')

with open('teste.txt', 'r') as arquivo:
    conteudo = arquivo.read()
    print(conteudo)