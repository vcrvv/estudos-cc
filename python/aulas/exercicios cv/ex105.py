#quantida de notas
#a maior e a menor nota
#a média da turma
#a situação.  <5 = ruim.  5 < 7 razoável.  > 7 boa.


####
def notas(* n, sit=False):
    r = dict()
    r['total'] = len(n)
    r['maior'] = max(n)
    r['menor'] = min(n)
    r['média'] = sum(n) / len(n)
    
    if sit:
        if r['média'] >= 7:
            r['situação'] = 'BOA'
        elif r['média'] >= 5:
            r['situação'] = 'RAZOÁVEL'
        else:
            r['situação'] = 'RUIM'
            
    return r
    
    
res = notas(3, 7, 8, 5, 10, 7, 4, 8, 9)
print(res)

