# f strings
from datetime import datetime

now: datetime = datetime.now()
print(f'{now:%d.%m.%y (%H:%M:%S)}')
print(f'{now:%c}')
print(f'{now:%I%p}')

print()

n: int = 1234567

print(f'{n:_}')
print(f'{n:,}')
print(f'{n:.2f}')
print(f'{n:.0f}')
print(f'{n:,.3f}')

print()

a:int = 1
b:int = 2

print(f'{a + b = }')

print()

t: str = 'var'

print(f'{t:>20}:')
print(f'{t:<20}:')
print(f'{t:^20}:')
print(f'{t:_>20}:')
print(f'{t:#<20}:')
print(f'{t:-^20}:')
print(f'{t = }')
