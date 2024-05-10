print('Empréstimo')
vcasa = int(input('Informe o valor do imóvel: '))
salario = int(input('Informe o seu salário: '))
anos = int(input('Em quantos anos pretende pagar? '))
meses = anos * 12
prestacao = vcasa / meses
if prestacao > (salario * 0.3):
    print('A sua prestação mensal é de R$:{:.2f} \nO valor excedeu 30% do seu salário, logo, o seu empréstimo foi NEGADO.'.format(prestacao))
else:
    print('A sua prestação mensal é de R$:{:.2f} \nO seu empréstimo foi ACEITO'.format(prestacao))
