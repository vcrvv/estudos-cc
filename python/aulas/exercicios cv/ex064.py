num = cont = soma = 0
num = int(input('Digite um número: [999 para sair.]'))
while num != 999:
    soma += num
    cont += 1
    num = int(input('Digite um número: [999 para sair.]'))
print(f'A soma dos {cont} números digitados é {soma}.')