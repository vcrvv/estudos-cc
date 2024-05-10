#ler uma frase e retornar se ela é um palindromo
frase = str(input('Digite uma frase: ')).replace(' ', '')
invertida = frase[::-1]
print(invertida)
if frase == invertida:
    print('A frase é um palíndromo.')
else:
    print('A frase não é um palíndromo.')
####


#outra forma:
frase = str(input('Digite uma frase: ')).strip().upper()
palavras = frase.split()
junto = ''.join(palavras)
inverso = ''
for letra in range(len(junto) - 1, -1, -1):
    inverso += junto[letra]
print('O inverso de {} é {}'.format(junto, inverso))
if inverso == junto:
    print('A frase é um palíndromo.')
else:
    print('A frase não é um palíndromo.')