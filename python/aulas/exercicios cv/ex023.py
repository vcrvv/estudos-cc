num = int(input('Informe um numero de 0 a 9999: '))
u = num // 1 % 10
d = num // 10 % 10
c = num // 100 % 10
m = num // 1000 % 10
print(' Unidade: {}\n Dezena: {}\n Centena: {}\n Milhar: {}'.format(u, d, c, m))
#