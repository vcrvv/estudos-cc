print('Descubra se as retas podem formar um triangulo!')
r1 = float(input('Comprimento da primeira reta: '))
r2 = float(input('Comprimento da segunda reta: '))
r3 = float(input('Comprimento da terceira reta: '))
#
if r1 < (r2 + r3) and r2 < (r3 + r1) and r3 <(r1 + r2):
    print('É possivel formar um triangulo!')
else:
    print('Náo é possivel formar um triangulo')
    
