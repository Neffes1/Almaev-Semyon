def F(n):
    a = 0
    previous = None
    while True:
        if n == 0:
            break  
        if previous is not None and n > previous:
            a += 1
        previous = n
    print(a)

n = int(input())

F(n)
