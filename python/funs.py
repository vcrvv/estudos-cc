 
set_a: set[int] = {1, 2, 3, 4, 5}
set_b: set[int] = {4, 5, 8, 9, 10}

print(set_a | set_b)
print(set_a - set_b)
print(set_b & set_b)
print(set_b ^ set_b)
 

print(nome:=input("Nome: ") or "N/A")

 
old = ['a', 'b', 'a', 'c', 'b']
new = []
for x in old:
    if x not in new:
        new.append(x)
        
print(new)
 
 
 
from collections import Counter
lista = [1, 2, 3, 4, 5, 6, 7, 8, 1]
print(Counter(lista))
 

 
import time
from itertools import cycle
sinal = [
    ('Verde', 3),
    ('Amarelo', 1),
    ('Vermelho', 3)
]
for c,s in cycle(sinal):
    print(c)
    time.sleep(s)
 

 
def faca_isso():
    print("isso")
    
def faca_aquilo():
    print("aquilo")
    
match input("Isso ou Aquilo? ").strip().lower():
    case "isso":
        faca_isso()
    case "aquilo":
        faca_aquilo()
    case _:
        print("Opção inválida.")


links = [
    "www.blabla.io",
    "www.googol.com",
    "www.youtube.com",
    "www.gov.br.org"
]
for link in links:
    print(link.removeprefix("www.").removesuffix(".com"))
    