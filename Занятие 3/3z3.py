n=int(input('Колличество минут прошедших с начала суток='))
hours=n%(60*24)//60
minutes=n%60
print(hours,(':'), minutes)