#jokenpo
print('PEDRA, PAPEL E TESOURA!!')
import random
from time import sleep
mao = input('Escolha sua mão ').upper()
maomaquina = ['PEDRA', 'PAPEL', 'TESOURA']
maquina = random.choice(maomaquina)
print('jo.....')
sleep(1.5)
print('ken.....')
sleep(1.5)
print('PO')
sleep(0.8)
print('A Maquinha escolheu {}'.format(maquina))
print('Voce escolheu {}'.format(mao))
if maquina == mao:
    print('O jogo EMPATOU!!')
elif maquina == 'PEDRA' and mao == 'TESOURA':
    print('A Maquina GANHOU!!')
elif maquina == 'TESOURA' and mao == 'PAPEL':
    print('A Maquina GANHOU!!')
elif maquina == 'PAPEL' and mao == 'PEDRA':
    print('A Maquina GANHOU!!')
elif mao == 'PEDRA' and maquina == 'TESOURA':
    print('Voce GANHOU!!')
elif mao == 'TESOURA' and maquina == 'PAPEL':
    print('Voce GANHOU!!')
elif mao == 'PAPEL' and maquina == 'PEDRA':
    print('Voce GANHOU!!')
 


