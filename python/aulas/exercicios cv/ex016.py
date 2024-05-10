from math import trunc

real = float(input('Digite um número: '))
truncr = trunc(real)
print('O número {} tem a parte inteira {}'.format(real, truncr))

#tambem
print('O numero {} tem a parte inteira {}'.format(real, int(real)))
