print('Cadastro de Pessoas')

cont = 1
maiores = homens = femvinte = 0

while True: 
    print('='*20)
    print(f'Pessoa {cont}')
    
    cont += 1
    idade = int(input('Qual a idade: '))
    sexo = input('Qual o sexo? [M/F] ').upper().strip()[0]
    op = input('Continuar? [S/N]').upper().strip()[0]
    
    if sexo in 'Ff':  # se em sexo tiver F ou f
        if idade < 20:
            femvinte += 1
            
    if sexo in 'Mm':  # se em sexo tiver M ou m
        homens += 1
        
    if idade >= 18:
        maiores += 1
        
    if op in 'Nn':  # se em op tiver N ou n
        print(f'Pessoas maiores de idade: {maiores}')
        print(f'Homens cadastrados: {homens}')
        print(f'Mulher com menos de 20 anos: {femvinte}')
        break
    
print('Fim.')
    