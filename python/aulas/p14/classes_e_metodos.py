# Classes
# Sintaxe

class Vendedor():  # posso usar em uma biblioteca e importar no meu código principal com "import"
    def __init__(self, nome):
        self.nome = nome
        self.vendas = 0
    
    
    def vendeu(self, vendas):
        self.vendas = vendas
    
    
    def bateu_meta(self, meta):
        if self.vendas > meta:
            print(f'{self.nome} bateu a meta!')
            
        else:
            print(f'{self.nome} não bateu a meta!')
            
            

vendedor1 = Vendedor(input('Nome: '))
vendedor1.vendeu(int(input('Quanto vendeu? ')))
vendedor1.bateu_meta(int(input('Qual é a meta? ')))

vendedor2 = Vendedor('Castos')
vendedor2.vendeu(700)
vendedor2.bateu_meta(800)