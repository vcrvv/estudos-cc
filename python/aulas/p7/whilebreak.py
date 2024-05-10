'''while True: # faz a estrutura que estiver dentro ser executada para sempre
    break # para o looping'''

n = 0
while n != 999:  # while com flag.  flag = sinaliza quando parar.  no caso o flag é a condição "999"
    n = int(input('Digite um número: '))
    

# while com break
n = s = 0
while True:  # executa o bloco infinitamente
    n = int(input('Digite um número: '))
    if n == 999:
        break # quebra e sai do bloco executando o proximo 
    s += n
print(f'Soma:{s}')

while variavel not in 'Xx':  # enquanto em variavel nao tiver X ou x
while variavel in 'Xx':  # enquanto em variavel tiver X ou x