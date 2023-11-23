def read_matrix_from_file(file_name):
    with open(file_name, 'r') as file:
        lines = file.readlines()
        matrix = [list(map(int, line.split())) for line in lines]
    return matrix

def write_results_to_file(file_name, sum_result, count_result):
    with open(file_name, 'w') as file:
        file.write(f"Сумма положительных элементов над главной диагональю: {sum_result}\n")
        file.write(f"Число положительных элементов над главной диагональю: {count_result}\n")

input_file_name = 'ФИО_группа_vvod.txt'
output_file_name = 'ФИО_группа_vivod.txt'

# Чтение матрицы из файла
A = read_matrix_from_file(input_file_name)

# Вычисление суммы и количества положительных элементов
sum_result, count_result = calculate_sum_and_count_of_positive_elements(A)

# Запись результатов в файл
write_results_to_file(output_file_name, sum_result, count_result)
