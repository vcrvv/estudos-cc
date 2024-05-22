def area(x, y):
    area = x * y
    print(f'A área de um terreno {x}x{y} é de {area:.1f}m2.')
    

l = float(input('Qual a largura do terreno em (m)? '))
c = float(input('Qual o comprimento do terreno em (m)?  '))
area(l, c)    