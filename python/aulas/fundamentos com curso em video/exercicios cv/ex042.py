print('Descubra se é triangulo e qual é')
r1 = float(input('Digite a primeira reta: '))
r2 = float(input('Digite a segunda reta: '))
r3 = float(input('Digite a terceira reta: '))
if r1 < (r2 + r3) and r2 < (r3 + r1) and r3 <(r1 + r2):
    print('É possivel formar um triangulo')
    if r1 == r2 == r3:
        print('É um triangulo Equilatero')
    elif r1 == r2 or r1 == r3 or r2 == r3:
        print('É um triangulo Isósceles')
    elif r1 != r2 != r3:
        print('É um triangulo Escaleno')
else:
    print('Náo é possivel formar um triangulo')