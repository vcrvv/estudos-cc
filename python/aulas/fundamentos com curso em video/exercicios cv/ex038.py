num1 = int(input('Digite o primeiro número: '))
num2 = int(input('Digite o segundo número: '))
if num1 > num2:
    print('O primeiro número é o maior. '.format(num1))
elif num2 > num1:
    print('O segundo número é o maior. '.format(num2))
else:
    print('Não exite valor maior. Os dois são iguais.')