def perguntar():
    resposta = input("""O que deseja realizar? 
                  <I> - Para Inserir um usuário 
                  <P> - Para Pesquisar um usuário 
                  <E> - Para Excluir um usuário
                  <L> - Para Listar um usuário: """).upper()
    return resposta


def inserir(dicionario):
    dicionario[input('Digite o login: ').upper()] = \
        [input('Digite o nome: ').upper(),
         input('Digite a última data de acesso: '),
         input('Qual a última estação acessada: ').upper()]


def pesquisar(dicionario, chave):
    lista = dicionario.get(chave)
    if lista is not None:
        print("Nome...........: " + lista[0])
        print("Último acesso..: " + lista[1])
        print("Última estação.: " + lista[2])


def excluir(dicionario, chave):
    if dicionario.get(chave) is not None:
        del dicionario[chave]
    print("Objeto Eliminado")


def listar(dicionario):
    for chave, valor in dicionario.items():
        print("Objeto......")
        print("Login: ", chave)
        print("Dados: ", valor)


def chamarmenu():
    print('-' * 40)
    escolha = int(input("""Digite: < 1 > para registrar ativo
        < 2 > para persistir em arquivo
        < 3 > para exibir ativos armazenados: """))
    print('-' * 40)
    return escolha



def registrar(dicionario):
    resp = "S"
    while resp == "S":
        dicionario[input("Digite o número patrimonial: ")] = [
            input("Digite a data da última atualização: "),
            input("Digite a descrição: "),
            input("Digite o departamento: ")]
        resp = input("Digite <S> para continuar.").upper()
    print('-' * 40)


def persistir(dicionario):
    with open("inventario.csv", "a") as inv:
        for chave, valor in dicionario.items():
            inv.write(chave + ";" + valor[0] + ";" + valor[1] + ";" + valor[2] + ""+ '\n')
    print('-' * 40)
    return "Persistido com sucesso"



def exibir():
    with open("inventario.csv", "r") as inv:
        linhas = inv.readlines()
        print('-' * 40)
    return linhas
