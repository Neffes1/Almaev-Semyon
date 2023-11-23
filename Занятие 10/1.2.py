def swap_min_max(matrix):
    for row in matrix:
        min_element = min(row)
        max_element = max(row)
        min_index = row.index(min_element)
        max_index = row.index(max_element)
        row[0], row[min_index] = row[min_index], row[0]
        row[-1], row[max_index] = row[max_index], row[-1]

# Чтение данных из файла
input_filename = 'ФИО_группа_vvod.txt'
output_filename = 'ФИО_группа_vivod.txt'

try:
    with open(input_filename, 'r') as file:
        lines = file.readlines()
        # Преобразование строк в матрицу чисел
        matrix = [[int(num) for num in line.split()] for line in lines]

    # Вызов функции для обработки матрицы
    swap_min_max(matrix)

    # Запись результатов в файл
    with open(output_filename, 'w') as output_file:
        for row in matrix:
            output_file.write(' '.join(map(str, row)) + '\n')

    print(f"Результаты были записаны в файл '{output_filename}'")

except FileNotFoundError:
    print("Файл не найден")
except Exception as e:
    print(f"Произошла ошибка: {e}")
