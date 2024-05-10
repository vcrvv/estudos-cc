from math import sin, cos, tan, radians
ang = int(input('Digite um angulo: '))
seno = sin(radians(ang))
coss = cos(radians(ang))
tang = tan(radians(ang))
print('O seno é {} \nO Cosseno é {} \nA tangente é {}'.format(seno, coss, tang))