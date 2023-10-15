def F(n):
    a = 1 #степень
    b = 0 #показатель
    while a * 2 <= n:
        a *= 2
        b += 1
    print(a, b)

n = int(input())

F(n)
