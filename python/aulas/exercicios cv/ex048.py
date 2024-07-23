s = 0
for num in range(1, 500):
    if num % 2 == 1 and num % 3 == 0:
        s += num
print('A soma é {}'.format(s))