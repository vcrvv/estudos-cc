print('Calcule o valor a ser pago!')
valor = int(input('Digite o valor do produto: '))
forma = input(' 1 - Cartão de Crédito \n 2 - Dinheiro/Cheque \n Qual vai ser a forma de pagamento? ')
#cartao de crédito
if forma == '1':
    metodo = input(' 1 - A Vista \n 2 - Parcelado \n Como deseja pagar? ')
    if metodo == '1':
        #a vista
        precof = valor * 0.95
        print('O valor final do produto é R${}'.format(precof))
    if metodo == '2':
        #parcelado
        qntsx = int(input('Em quantas vezes deseja parcelar? '))
        if qntsx <= 2:
            print('O valor final do produto é R${}'.format(valor))
            parcelas = valor / qntsx
            print('Sera pago mensalmente R${}'.format(parcelas))
        else:
            precof = valor * 1.2
            print('O valor final do produto é R${}'.format(precof))
            parcelas = precof / qntsx 
            print('Sera pago mensalmente R${}'.format(parcelas))
#dinheiro
if forma == '2':
   precof = valor * 0.8
   print('O valor final do produto é R${}'.format(precof)) 
print('Agradeçemos a compra!! :)')
            
    
