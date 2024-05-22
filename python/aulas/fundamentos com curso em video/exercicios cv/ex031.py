print('Descubra o valor da passagem!')
dist = int(input('Qual a distanica em Km? '))
if dist <= 200:
    valor = dist * 0.5    
else:
    valor = dist * 0.45
print('O valor da passagem é R$:{}'.format(float(valor)))