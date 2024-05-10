def metade(n, frm=False):
    if frm == True:
        return f'R${(n / 2):.2f}'
    else:
        return n / 2


def dobrar(n, frm=False):
    if frm == True:
        return f'R${(n * 2):.2f}'
    else:
        return n * 2


def aumentar(n, a, frm=False):
    if frm == True:
        return f'R${(n * ((100 + a) / 100)):.2f}'
    else:
        return n * ((100 + a) / 100)


def reduzir(n, a, frm=False):
    if frm == True:
        return f'R${(n * ((100 - a) / 100)):.2f}'
    else:
        return n * ((100 - a) / 100)


def moeda(n):
    return f'R${n:.2f}'


def resumo(v, a, d):
    print('=' * 31)
    print('        RESUMO DO VALOR')
    print('=' * 31)
    print(f'Preço analisado: {v:>13.2f}')
    print(f'Dobro do preço: {(v * 2):>14.2f}')
    print(f'Metade do preço: {(v/2):>13.2f}')
    print(f'{a}% de aumento: {(v * ((100 + a) / 100)):>14.2f}')
    print(f'{d}% de redução: {(v * ((100 - d) / 100)):>14.2f}')
    print('=' * 31)
    

