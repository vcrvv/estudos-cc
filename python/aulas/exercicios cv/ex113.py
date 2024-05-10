def leiaint(msg):
    while True:
        try:
            n = int(input(msg))
        except (ValueError, TypeError):
            print('ERRO: Por favor, digite um número válido.')
            continue

        except KeyboardInterrupt:
            print('Entrada de dados interrompida pelo usuário')
            return 0

        else:
            return n


def leiafloat(msg):
    while True:
        try:
            n = float(input(msg))

        except (ValueError, TypeError):
            print('ERRO: Por favor, digite um número válido.')
            continue

        except KeyboardInterrupt:
            print('Entrada de dados interrompida pelo usuário')
            return 0

        else:
            return n


n1 = leiaint('Digite um Inteiro: ')
n2 = leiafloat('Digite um Real: ')
print(f'O valor digitado foi {n1}')
