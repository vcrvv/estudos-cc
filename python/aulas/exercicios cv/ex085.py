# digitar sete valores em uma lista única que mantenha separado os valores impares e pares. e no final mostrar eles em ordem crescente

num = [[], []]
valor = 0
for c in range(1, 8):
    valor = int(input(f'Digite o {c}valor: '))
    if valor % 2 == 0:
        num[0].append(valor)
    else:
        num[1].append(valor)
        
print(f'Os valores pares são: {sorted(num[0])}')
print(f'Os valores ímpares são: {sorted(num[1])}')

##