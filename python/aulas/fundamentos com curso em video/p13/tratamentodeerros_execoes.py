#TRATAMENTO DE ERROS

# try:
#     OPERAÇÃO # operação principal
# except (nome do erro): 
#     FALHOU
# except (nome do erro): # exeçoes ou erros
#     FALHOU
# except (nome do erro): 
#     FALHOU
# else:   
#     DEU CERTO  # vai aparecer se o codigo der certo
# finally:
#     CERTO/FALHA  # vai aparecer se falhou ou não


try:
    a = int(input('Numerador: '))
    b = int(input('Denominador: '))
    c = a / b
    
except (ValueError, TypeError):
    print('Tivemos um problema com os tipos de dados que voce digitou.')

except ZeroDivisionError:
    print('Não é possivel dividir um número por 0.')

except KeyboardInterrupt:
    print('O usuario preferiu não informar os dados.')
    
except Exception as erro:
    print(f'O erro encontrado foi {erro.__cause__}')

else:
    print(f'O resultado é {c:.2f}')

finally:
    print('Volte sempre! Muito Obrigado!')