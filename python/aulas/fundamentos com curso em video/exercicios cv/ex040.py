print('Resultado final')
nota1 = float(input('Digite a primeira nota: '))
nota2 = float(input('Digite a segunda nota: '))
media = (nota1 + nota2) / 2
if media < 5.0:
    print('Sua média é {} e voce esta REPROVADO'.format(media))
elif media > 5.0 and media < 6.9:
    print('Sua média é {} e voce esta de RECUPERAÇAO'.format(media))
else:
    print('Sua média é {} e voce esta APROVADO'.format(media))