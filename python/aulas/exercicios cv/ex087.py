matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
pares = scol = mai =  0

for l in range(0, 3):
    for c in range(0, 3):
        matriz[l][c] = int(input(f'Digite um valor para [{l}, {c}]: '))
        
        if matriz[l][c] % 2 == 0:
            pares += matriz[l][c]
            
for l in range(0, 3):
    for c in range(0 , 3):
        print(f'[{matriz[l][c]:^5}]', end='')
    print()
    
for l in range(0, 3):
    scol += matriz[l][2]
    
for c in range(0, 3):
    if c == 0 or matriz[1][c] > mai:
        mai = matriz[1][c]
    
    
print(f'A soma dos valores pares é {pares}')
print(f'A soma dos valores da terceira coluna  é {scol} ')
print(f'O maior número da segunda linha é {mai}')

#a soma de todos os valores pares
# a soma dos valores da coluna 3
# o maior valor da segunda linha
#############