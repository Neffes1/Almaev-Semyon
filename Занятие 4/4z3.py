a=int(input("Введите число A:")) 
b=int(input("Введите число B:")) 

if a > b:
  for i in range(a, b-1, -1):
    if i % 2 != 0:
      print(i)
else:
  print("a должно быть больше b")
