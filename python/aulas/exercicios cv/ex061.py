
p1  = int(input('Digite o primeiro termo da progressão: '))
r = int(input('Digite a razão da progressão: '))
n = 0
while n < 10:
    n = n + 1
    res = p1 + n * r
    print(res, '=', p1, '+', '(', n, '- 1)', '*', r)

