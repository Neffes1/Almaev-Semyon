def swap_min_max(matrix):
    for row in matrix:
        min_element = min(row)
        max_element = max(row)
        min_index = row.index(min_element)
        max_index = row.index(max_element)
        row[0], row[min_index] = row[min_index], row[0]
        row[-1], row[max_index] = row[max_index], row[-1]

# Пример использования функции:
B = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

swap_min_max(B)
print(B)
