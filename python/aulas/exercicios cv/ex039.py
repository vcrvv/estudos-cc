print('='*40 )
print('ALISTAMENTO')
print('='*40 )
from datetime import date
ano_alistar = date.today().year - 18 #para sempre estar atualizado

nascimento = int(input('Que ano voce nasceu? '))
if nascimento == ano_alistar:
    print('Esta na hora de se alistar.')
elif nascimento < ano_alistar:
    print('Passou da hora de se alistar.')
    tempo_passou = ano_alistar - nascimento
    print('Voce passou {} ano(s) do prazo'.format(tempo_passou))
else:
    print('Ainda não chegou no prazo.')
    tempo_falta = nascimento - ano_alistar
    print('Ainda falta {} ano(s).'.format(tempo_falta))
