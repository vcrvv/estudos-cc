print('Descubra quantos litros de tinta voce precisa para pintar a sua parede!!')
altura = int(input('Informe a altura de sua parede: '))
largura = int(input('Informe a largura de sua parede: '))
area = altura * largura
litros = area / 2
print('Voce pode pintar uma area de {} metros quadrado com {} litros de tinta'.format(area, litros))