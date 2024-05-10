while True:
    print('='*63)    
    valor = int(input('Voce quer a tabuada de qual número? [número negativo para sair]'))
    if valor < 0:
        break
    for n in range(1, 11):
        res = valor * n
        print(f'{valor} x {n} = {res}')
print('='*63)   
print('Fim')
    