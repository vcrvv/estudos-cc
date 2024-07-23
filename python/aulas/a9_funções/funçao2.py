#help()
#help(print)
#print(input.__doc__)

#docstrings são a documentação de uma determinada função, com informações e guia.

def contador(i, f, p):
    """
    -> Faz uma contagem e mostra na tela.
    :param i: inicio da contagem
    :param f: fim da contagem
    :param p: passo da contagem
    :return: sem retorno
    """
    c = 1
    while c <= f:
        print(f'{c} ', end='')
        c += p
    print(f'FIM.')

help(contador)
    
    
def funcao():
    global n1 #: é pra nao usar a variavel local e usar a global
    n1 = 4  # escopo local
    print(n1)


n1 = 2  # escopo global
funcao() 
print(n1)


def somar(a=0, b=0, c=0):
    s = a + b + c
    return s


r1 = somar(1, 5, 9)
r2 = somar(3, 8)
r3 = somar(1)

print(f'Os resultados são {r1}, {r2} e {r3}')



def par(n=0):
    if n % 2 == 0:
        return True
    else:
        return False


num = int(input('Digite um número: '))
if par(num):
    print('É par.')
    
else:
    print('Náo é par')
