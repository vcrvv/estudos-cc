print('Descubra seu IMC')
# imc = peso / altura * 2
peso = float(input('Informe o seu peso: '))
altura = float(input('Informe a sua altura: '))
alt = altura / 100
print(alt)
imc = peso / (alt ** 2)
if imc < 18.5:
    print('O seu imc é {:.2f} e voce esta Abaixo do Peso Ideal.'.format(imc))
elif imc > 18.5 and imc < 25:
    print('O seu imc é {:.2f} e voce esta no Peso Ideal.'.format(imc))
elif imc > 25 and imc < 30:
    print('O seu imc é {:.2f} e voce esta na linha de Sobrepeso.'.format(imc))
elif imc > 30 and imc < 40:
    print('O seu imc é {:.2f} e voce esta na linha da Obesidade.'.format(imc))
else:
    print('O seu imc é {:.2f} e voce esta na linha da Obesidade Mórbida.'.format(imc))
