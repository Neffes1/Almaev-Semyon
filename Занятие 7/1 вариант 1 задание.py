def find_max_and_reverse_array():
    n = int(input("Введите размер массива: "))
    arr = []
    for i in range(n):
        element = int(input(f"Введите элемент {i + 1}: "))
        arr.append(element)
    
    max_element = max(arr)
    print(f"Максимальный элемент: {max_element}")
    
    reversed_arr = arr[::-1]
    print("Массив в обратном порядке:", reversed_arr)

# Вызов функции
find_max_and_reverse_array()
