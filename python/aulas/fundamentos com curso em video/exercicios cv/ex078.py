####
num = []
maior = menor = 0

for n in range(1, 6):
    num.append(int(input('Digite um valor: ')))
    num = num
    
maior = max(num)
menor = min(num)

print(f'O maior valor é {maior} nas posições ', end='')
for i, v in enumerate(num):
    if v == maior:
        print(f'{i}... ', end='')
print()
print(f'O menor valor é {menor} nas posições ', end='')
for i, v in enumerate(num):
    if v == menor:
        print(f'{i}... ', end='')
print()

##33