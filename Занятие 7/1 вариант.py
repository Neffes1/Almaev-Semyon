arr=[]
n = 5
for i in range(n):
    arr.append(input('Введите число: '))
 
print('максимальный элемент: ' + str(max(arr)))
print('обратный порядок: ' + str(list(reversed(arr))))
