#CONDIÇÕES ANINHADAS
#if: (... elif: ...) else: 
#pode quantos elif precisar

horas = int(input('Que horas são? '))
if horas > 18 and horas < 5 and horas > 0:
    print('Boa Noite!')
elif horas > 12 and horas < 18:
    print('Boa Tarde!')
else:
    print('Bom Manha!')
    