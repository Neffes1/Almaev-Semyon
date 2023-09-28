def fiba_sum(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    fib_sum = 0
    fib_prev = 0
    fib_cur = 1
    for i in range(2, n+1):
        fib_next = fib_prev + fib_cur
        fib_sum += fib_cur
        fib_prev = fib_cur
        fib_cur = fib_next
    return fib_sum
n=int(input("Ведите кол-во чисел из ряда фибаначи"))
result=fiba_sum(n)
print(result)