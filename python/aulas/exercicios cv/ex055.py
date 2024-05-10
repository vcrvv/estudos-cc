####
p1 = float(input('Digite o peso: '))
p2 = float(input('Digite o peso: '))
p3 = float(input('Digite o peso: '))
p4 = float(input('Digite o peso: '))
p5 = float(input('Digite o peso: '))
lista = [p1, p2, p3, p4, p5]
print('O maior peso é: {}Kg'.format(max(sorted(lista))))
print('O menor peso é: {}Kg'.format(min(sorted(lista))))


#forma simplificada:
maior = 0
menor = 0
for p in range(1, 6):
    peso = float(input('Digite o peso da {} pessoa: '.format(p)))
    if p == 1:
        maior = peso
        menor = peso
    else:
        if peso > maior:
            maior = peso
        if peso < menor:
            menor = peso
print(f'O maior peso lido foi {maior}Kg')
print(f'O menor peso lido foi {menor}Kg')


#mais outra forma
list = []
for p in range(1, 6):
    peso = float(input('Digite o peso da {} pessoa: '.format(p)))
    list += [peso]
list.sort()
print(f'O maior peso lido foi o {max(list)}Kg')
print(f'O menor peso lido foi o {min(list)}Kg')