from lib.interface import *

def arquivoExiste(nome):
    try:
        a = open(nome, 'rt')
        a.close()
        return True
    except FileNotFoundError:
        return False
    

def criarArquivo(nome):
    try:
        a = open(nome, 'wt+')
        a.close()
        print(f'Arquivo {nome} criado com sucesso!')
    except:
        print('Houve um ERRO na criação do arquivo!')
        

def lerArquivo(nome):
    try:
        a = open(nome, 'rt')
    except:
        print('ERRO ao ler o arquivo!')
    else:
        cabeçalho('PESSOAS CADASTRADAS')
        for linha_arquivo in a:
            dado = linha_arquivo.split(';')
            dado[1] = dado[1].replace('\n', '')
            print(f'{dado[0]:<30}{dado[1]:>3} anos')
        a.close()



def cadastrar(arq, nome='desconhecido', idade=0):
    try:
        a = open(arq, 'at')
        a.write(f'{nome};{idade}\n')
        print(f'Novo registro de {nome} adicionado. ')
    except:
        print('Houve um ERRO na abertura ou na escrita do arquivo!')
    finally:
         a.close()