# listas parte 2
#listas dentro de listas

pessoas = [['Renata', 25], ['Thaíssa', 19], ['Julia', 20]]
#             0       1        0       1       0      1
#                0               1                 2
print(pessoas)
print(pessoas[0][0])
print(pessoas[1][1])
print(pessoas[2][0])
print(pessoas[1])
print('-' * 50)

pessoas = list()
galera = list()

pessoas.append('Eliza')
pessoas.append(40)

print(pessoas)

galera.append(pessoas[:])

print(galera)

pessoas[0] = 'Maria'
pessoas[1] = 22

galera.append(pessoas[:])

print(pessoas)
print(galera)