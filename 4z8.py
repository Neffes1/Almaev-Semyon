n=int(input("Введите натуральное число меньше девяти"))
if 1 <= n <= 9:
    for i in range(1, n+1):
        for k in range(1, i+1):
            print(k, end="")
        print()
else:
    print("ошибка")