num = int(input('Digite um número para comverter: '))
opcao = input(' 1 - Binário \n 2 - Octal\n 3 - Hexadecimal\n')
if opcao == '1':
    res = format(num, "b")
    print(res)
elif opcao == '2':
    res = format(num, "o")
    print(res)
elif opcao == '3':
    res = format(num, "x")
    print(res)
