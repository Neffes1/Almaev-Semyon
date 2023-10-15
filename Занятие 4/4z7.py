n=int(input("Введите n:"))
if n < 0:
    print("n должно быть натуральным числом")
else:
    factorial = 1
    sum = 0

    for i in range(1, n+1):
        factorial *= i
        sum += factorial

    print(sum)
