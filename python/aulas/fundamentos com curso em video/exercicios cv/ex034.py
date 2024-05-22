print('Calcule o seu aumento salarial!!')
salario = float(input('Qual o seu salario? '))
if salario <= 1250:
    aumento = salario * 0.15
    print('O seu aumento é de R${}'.format(aumento))
    print('E o seu novo salario é de {}'.format(salario + aumento))
else:
    aumento = salario * 0.10
    print('O seu aumento é de R${}'.format(aumento))
    print('E o seu novo salario é de {}'.format(salario + aumento))