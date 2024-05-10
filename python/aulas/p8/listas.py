# LISTA - variavel composta
# listas são mutáveis
#[]

lista = ['Vinicius', 'Julia', 'Thaíssa', 'Letícia']  # começa com 0
        #    0           1       2         3
print(lista[0])  # mostrar com a posição

lista.pop()  # remover ultimo
lista.pop(1)  # remover por posição
lista.remove('Vinicius')

lista.append(input('Digite um nome: '))  # add na ultima posição com input
lista.insert(1, input('Digite outro nome:'))  # add com posição
lista.append('Raissa')  # add na lista
lista.insert(2, 'Gabi')

print(lista)
for nome in lista:
    print(nome)  # exibir apenas os valores, sem os colchetes, virgulas e aspas
print('='*50)

# valores fora de ordem
valores = [1, 7, 7, 19, 3, 2, 11, 15, 6, 1, 5]
# exibição da lista
print("A lista foi criada assim: {}".format(valores))
# contagem de elementos
contagem = valores.count(7)
print(f"Nessa lista o número 7 aparece {contagem} vezes")
# invertendo a lista
valores.reverse()
print(f"A lista agora está invertida: {valores}")
# ordenando a lista
valores.sort()
print(f"A lista agora está ordenada: {valores}")
# ordenada e invertida
valores.sort(reverse=True)
print(f"A lista agora está ordenada e invertida: {valores}")
# tamanho da lista
tamanho = len(valores)
print(f"A lista tem {valores} elementos")
# soma dos elementos
soma = sum(valores)
print(f"A soma dos elementos é {valores}")
