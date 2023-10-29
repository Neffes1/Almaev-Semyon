def replace_zeros_with_mean(arr):
    arr_mean = sum(arr) / len(arr)
    
    for i in range(len(arr)):
        if arr[i] == 0:
            arr[i] = arr_mean

    return arr

# Пример использования функции
my_array = [1, 2, 0, 4, 0, 6]
result_array = replace_zeros_with_mean(my_array)
print(result_array)
