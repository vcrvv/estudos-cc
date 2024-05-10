#programa para mostrar todos os números pares entre 1 e 5
for num in range(1, 50):
    if num % 2 == 0:
        print(num)

#forma mais leve:
for num in range(2, 50, 2):
    print(num, end=' ')
print('Acabou')
