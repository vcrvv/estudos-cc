#
sexo = input('Qual o seu sexo? [F/M] ').strip().upper()[0]
while sexo != 'F' and sexo != 'M':
    print('Opção inválida. Tente novamente')
    sexo = input('Qual o sexo? [F/M] ').strip().upper()[0]
if sexo == 'M':
    print('Masculino')
if sexo == 'F':
    print('Feminino')

#while sexo not in 'FfMm'    tambem é uma solução