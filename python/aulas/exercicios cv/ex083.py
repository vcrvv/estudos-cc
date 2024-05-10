#verificar a posição de parenteses na expressão

exp = input('Digite um expressão: ')

nump1 = exp.count(')')
posi1 = exp.index(')')
nump2 = exp.count('(')
posi2 = exp.index('(')

if nump2 != nump1 and posi1 < posi2:
    print('A expressão esta com os parenteses incorretos.')
    
if nump2 == nump1:
    print('Os parenteses estão corretos.')
