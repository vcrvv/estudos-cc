#C I E N C I A S   D A      C  O  M  P  U  T  A  Ç  A  O
#0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22

#string - cadeia de caracteres
frase = 'Ciencias da Computação' 
#FATIAMENTO
print(frase[0])
print(frase[:8]) #Ciencias
print(frase[12:22:2]) #c m u a ã
print(frase[12:]) #Computação
print(frase[12::3]) #C  p  a  o

#ANÁLISE
print(len(frase)) #tamanho
print(frase.count('a')) #contagem de caracteres
print(frase.count('a',0,8)) #contagem especifica
print(frase.find('da')) #encontrar na string
print('da' in frase) #verificar se esta na string  True ou False
print(frase.replace('Computação','Computaria')) #substituir
print(frase.upper()) #tudo em maiusculo
print(frase.lower()) #tudo em minusculo
print(frase.capitalize()) #só a primeira palavra começa com maiuscula
print(frase.title()) #todo palavra começa com maiusculo
print(frase.strip()) # retira espaços desnecessarios
print(frase.lstrip()) # retira espaços desnecessarios na esquerda
print(frase.rstrip()) # retira espaços desnecessarios na direita
print(frase.split()) #separa entre os espaços para formar strings 
print('-'.join(frase)) #junta as strings
