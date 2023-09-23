a=int(input('Первое число='))
b=int(input('Второче число='))
c=int(input('Третье число='))
if a<b:
    if a<c:
        y=a
    else:
        y=c
else:
    if b<c:
        y=b
    else:
        y=c
print('Наименьшее:',y)