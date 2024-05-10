with open('p15.txt', 'w', encoding='UTF-8') as arquivo:  # cria ou sobrescreve um arquivo
    arquivo.write('oioioio\n')


with open('p15.txt', 'a') as arquivo:  # adiciona noto conteudo ao arquivo
    arquivo.write('Olá, Mundo\n')


with open('p15.txt', 'r') as arquivo:  # apenas le o conteudo
    conteudo = arquivo.read()
    print(conteudo)


with open('p15.txt', 'r') as arquivo:
    conteudo = arquivo.readlines()  # le todas as linhas
    print(conteudo)


with open('p15.txt', 'r') as arquivo:
    linha = arquivo.readline()  # le uma linha
    print(linha)


with open('p15.txt', 'r') as arquivo:
    for linha in arquivo.readlines():
        print(linha)
