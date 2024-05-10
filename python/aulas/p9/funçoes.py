# FUNÇÕES - usado para excutar umm bloco de comando qnd queremos varias vezes(ROTINA)
# pode ser chamada inúmeras vezes


def soma(a, b):   # a=0  -> parametro opcional
    s = a + b
    print(s)
    
    
soma(4, 5)  # pode ser a=4, b=5 ou b=5, a=4


#empacotamendo de parametros
def contador(* num):  # num é pra usar quantos elementos for recebido
    print(num)
    
    
contador(1, 2, 3, 4)
contador(0, 9, 4)


#com listas
def dobra(lst):  # usando listas na chamada
    pos = 0      # variavel de escopo local. só vai funcionar aqui
    while pos < len(lst):
        lst[pos] *= 2
        pos += 1


valores = [1, 2, 3, 4, 5, 6]  # variaveis de escopo global. funciona em tudo
dobra(valores)
print(valores)

# soma com varios valores
def soma(* valores):
    s = 0
    for num in valores:
        s += num
    print(f'A soma é {s}')


soma(4, 6, 8)
