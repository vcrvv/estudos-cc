#CONDIÇÕES
n1 = float(input('Digite sua primeira nota: '))
n2 = float(input('Digite sua segunda nota: '))
m = (n1 + n2) / 2
print('Sua média é {}'.format(m))
#simplificado
#print('Voce passou!! :))))' if m >= 6.0 else 'Voce reprovou! :(((')
if m >= 6.0:
    print('Voce passou!! :))))')
else:
    print('Voce reprovou... :((((')
