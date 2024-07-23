num = soma = cont = 0
while True:  
    num = int(input('Digite um número: '))
    if num == 999:
        break
    cont += 1
    soma += num
print(f'A soma de todos os {cont} valores é {soma}')