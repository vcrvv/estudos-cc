import re

class Celular:
    def __init__(self, celular):
        self.numero = celular
        
    def __str__(self):
        return self.format_numero()

    def format_numero(self):
        padrao = "([0-9]{2,3})?([0-9]{2})([0-9]{5})([0-9]{4})"
        # entre () é um grupo
        #[0-9] é o range de números de 0 a
        #{2, 3} é a quantidade de caracteres de 2 a 3
        # ? = não obrigatório
        resposta = re.search(padrao,self.numero)
        numero_formatado = "+{}({}){}-{}".format(
            resposta.group(1),
            resposta.group(2),
            resposta.group(3),
            resposta.group(4)
        )
        return numero_formatado
    

print(Celular("5569993729148"))