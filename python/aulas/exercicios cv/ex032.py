print('Descubra se um ano é bissexto')
from datetime import date
ano = int(input('Digite um ano ou digite 0 para selecionar o ao atual: '))
if ano == 0:
    ano = date.today().year
if ano % 2 == 0 and ano % 100 != 0 or ano % 400 == 0:
    print('{} é um ano bissexto'.format(ano))
else:
    print('{} não é um ano bissexto'.format(ano))
    