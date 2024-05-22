from random import choice

cont = 0
while True:
    num = int(input('Digite um valor: '))
    mao = input('Quer PAR ou ÍMPAR? [P/I] ').upper().strip()[0]

    maocomp = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    comp = choice(maocomp)

    resultado = comp + num
    if resultado % 2 == 0:
        resultado = 'P'
    else:
        resultado = 'I'
        
    if mao == resultado:
        print('Voce Ganhou!')
        cont += 1
    else:
        print('Voce Perdeu!')
        break

print(f'A maquina escolheu {comp} e voce escolheu {num}. A soma é {(comp + num)}')
print(f'E voce ganhou {cont} vezes.')