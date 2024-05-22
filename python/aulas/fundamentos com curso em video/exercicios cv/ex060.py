import math

num = int(input('Digite um número para fatorar: '))
fac = math.factorial(num)

print(f'{num}! = ', end='')

while num > 1:
    cont = num
    num = num - 1
    print(cont, end=' x ') 
    
print(f'1 = {fac}')

