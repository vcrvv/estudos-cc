def voto(i):
    from datetime import date
    ano_atual = date.today().year
    idade = ano_atual - i
    
    if idade < 16:
        return f'Com {idade} anos. NÃO VOTA'
    
    elif 18 > idade >= 16 or idade >= 60:
        return f'Com {idade} anos. VOTO OPCIONAL'
        
    else:
        return f'Com {idade} anos. VOTO OBRIGATÓRIO'



print(voto(int(input('Nasceu em que ano? '))))

