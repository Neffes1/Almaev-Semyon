n=int(input("n="))
if n < 0:
    print("Факториал только для натуральных чисел")
else:
    factorial = 1
    for i in range(1, n+1):
        factorial *= i

    print("n= ", factorial)