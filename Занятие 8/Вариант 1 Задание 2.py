from random import randint
 
def search():
    array = [randint(-30, 30) for _ in range(randint(1, 15))]
    amount = 0                  # Сумма
    for i in array:
        amount += i
    am = amount / len(array)    # Среднее арифметическое
 
    arrays.append(array)
    amounts.append(amount)
    ams.append(am)
  
arrays = []
amounts = []
ams = []
for _ in range(2):
    search()
 
print(f"1 массив: {', '.join(map(str, arrays[0]))}"
      f"\nСумма элементов: {amounts[0]}"
      f"\nСреднеарифметическое значение: {ams[0]}"
      f"\n\n2 массив: {', '.join(map(str, arrays[1]))}"
      f"\nСумма элементов: {amounts[1]}"
      f"\nСреднеарифметическое значение: {ams[1]}")
