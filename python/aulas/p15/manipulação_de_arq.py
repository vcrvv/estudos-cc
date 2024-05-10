# oMANIPULÇÃO DE ARQUIVOS

open('caminho', 'comando')
# w -abrir arquivo no modo escrita. caso ja exista, ela sera sobrescrito
# r - abrir arquivo no modo leitura apenas
# a - adicionar conteúdo no arquivo
# x - abrir arquivo no modo exclusivo
# t - abrir arquivo apenas como string
# r+ - leitura  + escrita
# pode combinar
# + = para atualizar

# read()  - ler arquivo
# readline() - ler uma linha
# readlines()  - ler por linhas
# close()	fecha o arquivo
# detach()	Returns the separated raw stream from the buffer
# fileno()	Returns a number that represents the stream, from the operating system's perspective
# flush()	Flushes the internal buffer
# isatty()	Returns whether the file stream is interactive or not
# readable()	Returns whether the file stream can be read or not
# seek()	Change the file position
# seekable()	Returns whether the file allows us to change the file position
# tell()	Returns the current file position
# truncate()	Resizes the file to a specified size
# writable()	Returns whether the file can be written to or not
# write()	Writes the specified string to the file
# writelines()	Writes a list of strings to the file

#
with open('p15.txt', 'w') as arquivo:  # cria ou sobrescreve um arquivo
    arquivo.write('\noioioio')

with open('p15.txt', 'a') as arquivo:  # adiciona noto conteudo ao arquivo
    arquivo.write('\nOlá, Mundo"')

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
