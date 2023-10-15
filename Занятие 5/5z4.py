def F(x, y)
    a = 1
    while x < y:
        x = x + x * 0.10
        a += 1
    print(a)

x = float(input())
y = float(input())

F(x, y)
