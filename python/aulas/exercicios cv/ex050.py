s = 0
cont = 0
for num in range(1, 6):
    num = int(input('Digite um número: '))
    if num % 2 == 0:
        s += num
        cont += 1 #conta e retorna o número de vezes que o bloco executou
print('A soma dos {} números pares é: {}'.format(cont , s))