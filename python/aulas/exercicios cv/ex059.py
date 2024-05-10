valor1 = int(input('Digite o primeiro valor: '))
valor2 = int(input('Digite o segundo valor: '))
alt = 0
while alt != 5:
    print("""===================================    
    [1]MAIOR
    [2]SOMA
    [3]MULTIPLICAÇÃO
    [4]NOVOS NÚMEROS
    [5]SAIR DO PROGRAMA""")
    alt = int(input('Escolha como prosseguir: '))
    if alt == 1:
        if valor1 > valor2:
            maior = valor1
        else:
            maior = valor2
        print(f'Entre os valores {valor1} e {valor2}, o número {maior} é o maior.')
    elif alt == 2:
        res = valor1 + valor2
        print(f'A soma de {valor1} e {valor2} é {res}.')    
    elif alt == 3:
        res = valor1 * valor2
        print(f'O resultado da multiplicação de {valor1} por {valor2} é {res}.')
    elif alt == 4:
        print('Informe novos valores: ')
        valor1 = int(input('Digite o primeiro valor: '))
        valor2 = int(input('Digite o segundo valor: '))
    elif alt == 5:
        print()
    else:
        print('Opção inválida. Tente novamente')
print('Programa terminado.')    