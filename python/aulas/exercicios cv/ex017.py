from math import sqrt

co = int(input('Qual o cateto oposto ao angulo? '))
ca = int(input('Qual o cateto adjacente ao agulo? '))
hip = (ca * ca) + (co * co)
hipo = sqrt(hip)
print('O valor da hipotenusa do triangulo retangulo é ', hipo)
  
"""
from math import hypot
hip = hypot(co ,ca)
"""