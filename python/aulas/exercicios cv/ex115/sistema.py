from lib.interface import *
from lib.arquivo import *
from time import sleep

arq = 'registro.txt'

if not arquivoExiste(arq):
    criarArquivo(arq)

while True:
    resposta = menu('Ver pessoas cadastradas.', 'Cadastrar nova Pessoa', 'Sair do Sistema')
    if resposta == 1:
        lerArquivo(arq)
    elif resposta == 2:
        cabeçalho('NOVO CADASTRO')
        nome = input('Nome: ')
        idade = leiaInt('Idade: ')
        cadastrar(arq, nome, idade)
    elif resposta == 3:
        cabeçalho(f'Saindo do sistema... Até logo!')
        break
    else:
        print('\033[31mERRO. Digite uma opção válida.\033[m')
    sleep(2)
