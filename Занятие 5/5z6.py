def F(n):
    a = 0 #кол-во элементов последовательности
    b = 0 #сумма элементов последовательности
    while True:
        if n == 0:
            break
        b += n
        a += 1
    print(b/a)

n  = int(input())

F(n)
