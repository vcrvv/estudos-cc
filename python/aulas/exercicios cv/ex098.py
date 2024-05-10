from time import sleep

def lin():
    print('=' * 45)
    
def contagem(i, f, p):
    if p < 0:
        p = p * -1
    
    print(f'Contagem de {i} até {f} de {p} em {p}')
    
    if p == 0:
        p = 1
        
    if i > f:
        p = p * -1
    
    for n in range(i, f, p):
        print(n, end=' ')
        sleep(0.2)
        
    print('FIM!')

lin()
print('Contagem de 1 até 10 de 1 em 1')
for n in range(1, 11):
    print(n, end=' ')
    sleep(0.2)
print('FIM!') 
lin()

print('Contagem de 10 até 0 de 2 em 2')
for n2 in range(10, -1, -2):
    print(n2, end=' ')
    sleep(0.2)
print('FIM!')
lin()

print('Agora é a sua vez de personalizar a contagem!')
inicio = int(input('Início: '))
fim = int(input('Fim: '))
passo = int(input('Passo: '))
lin()
contagem(inicio, fim, passo)
