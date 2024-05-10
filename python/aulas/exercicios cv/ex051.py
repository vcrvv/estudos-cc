#PA -> an = a1 + (n - 1) * r
#an = a1 + 9 * r
a1 = int(input('Digite o primeiro termo da progressão: '))
razao = int(input('Digite a razão da progressão: '))
an = 1
for num in range(1, 11):
    an = a1 + (num - 1) * razao
    print( an, '=', a1, '+', '(', num, '- 1)', '*', razao)
    