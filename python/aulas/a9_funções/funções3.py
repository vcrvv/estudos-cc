def get_users() -> dict[int, str]: # especifica o tipo que deve retornar. é melhor para a leitura e compreensão
    """_summary_


    Returns:
        dict[int, str]: _description_
    """
    return {1: 'bob', 2: 'isa', 3: 'lua'}


def display_users(users: dict[int, str]) -> None: # None especifica que não deve retornar nada só executar
    """_summary_

    Args:
        users (dict[int, str]): _description_
    """
    for k, v in users.items():
        print(k, v, sep=': ')


def main() -> None:
    # dicionario 'users' recebe o dicionario retornado da função 'get_users'
    users: dict[int, str] = get_users() 
    # aciona a função 'displat_users' passando o dicionario 'users' como parametro
    display_users(users)

if __name__ == '__main__': # executa main() primeiro
    main() 

