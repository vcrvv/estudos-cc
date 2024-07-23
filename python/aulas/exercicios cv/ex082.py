num = []
nump = []
numi = []

while True:
    valor = int(input('Digite um valor: '))
    num.append(valor)
    
    if valor % 2 == 0:
        nump.append(valor)
        
    if valor % 2 == 1:
        numi.append(valor)
           
    res = input('Quer continuar? [S/N]').upper().strip()[0]
    while res not in 'SsNn' :
        print('Opção inválida. ', end='')
        res = input('Quer continuar? [S/N]').upper().strip()[0]
        
    if res == 'N':
        break

print(f'A lista completa é: {num}') 
print(f'A lista de números pares é: {nump}')
print(f'A lista de números ímpares é: {numi}')
    