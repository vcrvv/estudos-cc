# simulador de compras
# digite o nome e o preço do produto
# retorne o valor total, qnts produtos passram de 1000 reais e o nome e o valor do produto mais barato

print('Compras!')
opcao = ''
produtos = {}

while opcao != 'N':
    nome_produto = input('Digite o nome do produto: ')
    preco_produto = float(input('Digite o valor do produto: '))

    opcao = input('Quer continuar? [S/N]').upper()[0]
    if opcao == 'N':
        break
    
print('fim.')