def calculate_sum_and_count_of_positive_elements(matrix):
    N = len(matrix)  # Получаем размерность матрицы
    sum_of_positive_elements = 0
    count_of_positive_elements = 0

    for i in range(N):
        for j in range(i + 1, N):
            if matrix[i][j] > 0:
                sum_of_positive_elements += matrix[i][j]
                count_of_positive_elements += 1

    return sum_of_positive_elements, count_of_positive_elements

# Пример использования функции:
N = 3
A = [[-1, 2, 3], [4, -5, 6], [-7, 8, 9]]  # Замените эту матрицу на вашу
sum_result, count_result = calculate_sum_and_count_of_positive_elements(A)

print("Сумма положительных элементов над главной диагональю:", sum_result)
print("Число положительных элементов над главной диагональю:", count_result)
