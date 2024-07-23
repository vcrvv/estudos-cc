resp = 'S'
cont = media = soma = maior = menor = 0

while resp in 'Ss':
    num = int(input('Digite um número: '))
    soma += num
    cont += 1
    media = soma / cont
    if cont == 1:
        maior = menor = num
    else:
        if maior > num:
            maior = num
        if menor < num:
            menor = num
    resp = str(input('Quer continuar? [S/N]')).strip().upper()[0]
    
print(f'A média é {media} O Maior e o Menor número são respectivamente {maior} e {menor}')
print('cabo.')