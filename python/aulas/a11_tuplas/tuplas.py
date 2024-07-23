# TUPLA - variavel composta
# tuplas são imutáveis
#()

comidas = ('Lanche', 'Sorvete', 'Banana', 'Suco')
for c in comidas:
    print(c)
print(comidas)    
print(comidas[1])
print(comidas[-1])

a = (1, 2, 3)
b = (4, 5, 6, 7, 8)
c = a + b
print(c)
print(c.index(3))

pessoa = ('Vinicius', 21, 'M', 'caralhooooo')
print(pessoa)


numeros = (1, 2, 3, 4, 5, 6, 7, 8, 9)
for numero, valor in enumerate(numeros):
    print(f'No índice {numero}, temos o valor {valor}.')