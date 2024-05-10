def fatorial(x, show):
    '''
    -> Calcula o fatorial de um número.
    :param x: número a ser calculado.
    :param show: (opcional) mostrar ou não a conta.
    :param return: O valor fatorial de um número x
    '''
    from math import factorial
    
    if show == True:
        for c in range(x, 1, -1):
            print(f'{c} x ', end='')
        print('1 = ', end='')
        
    return f'{factorial(x)}'
    
    
print(fatorial(5, show=True))
help(fatorial)