numex = ('zero', 'um', 'dois', 'tres', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez', 'onze', 'doze', 'treze', 'quatroze', 'quinze', 'dezesseis', 'dezessete', 'dezoito', 'dezenove', 'vinte')
while True:
    num = int(input('Digite um número de 0 a 20 e ele sera escrito por extenso: '))
    if 0 <= num <= 20:
        break
    print('Tente Novamente.', end='')
print(numex[num])