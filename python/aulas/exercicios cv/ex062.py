
p1  = int(input('Digite o primeiro termo da progressão: '))
r = int(input('Digite a razão da progressão: '))
n = 0
total = 0
mais = 10
while mais != 0:
    total = total + mais    
    while n < total:
        n = n + 1
        res = p1 + n * r
        print(res, end=' -> ')
    print('Pausa')
    mais = int(input('Quantos a mais voce quer mostrar? [0 para sair.]'))
print('FIM.')
