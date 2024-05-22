print('Analisador de velocidade')
vel = float(input('Digite a velocidade do veiculo: '))
if vel <= 80:
    print('A velocidade esta abaixo do limite. Não há multa.')
else:
    print('A velocidade ultrapassou o limite. Havera multa.')
    multa  = 7 * (vel - 80)
    print('O valor da multa é R$:{} '.format(multa))