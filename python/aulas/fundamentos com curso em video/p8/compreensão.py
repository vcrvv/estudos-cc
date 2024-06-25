# COMPREENSÃO DE LISTAS

# COM FOR - [expr for item in lista] # aplique a expressão 'expr' para cada 'item' em 'lista' 
# COMUM
lista = [] 
for item in range(10):      # para cada item no alcance de 10
    lista.append(item ** 2) # adicione a lista o item elevado a 2
    
print(lista)

# COMPRIMIDA
lista2 = [item ** 2 for item in range(10)] # lógica: aplique a potencia de 2 para cada item no alcancde de 10
print(lista2)


# COM IF - [expr for item in lista if ond ] # aplique a expressão 'expre' para cada 'item' da 'lista' caso a condição 'cond' for satisfeita
resultado = [numero for numero in range(20) if numero % 2 == 0] 
# 'resultado' só recebe 'numero' se a divisao de cada 'numero' por 2 no alcande de 20 for 0
print(resultado)


# VARIOS IF´s
resultado2 = [numero for numero in range(100) if numero % 5 == 0 if numero % 6 == 0]
# o número só será passado para lista resultado caso sua divisão por 5 E por 6 seja igual à zero
print(resultado2)


# COM IF E ELSE

