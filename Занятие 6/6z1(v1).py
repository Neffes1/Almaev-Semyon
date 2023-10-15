text = "Аптеку позабудь ты для венков лавровых И не мори больных, но усыпляй здоровых."
words = text.split()
count = 0
for word in words:
if word.startswith("е") or word.startswith("Е"):
count += 1
print("Количество слов, начинающихся с буквы 'е'", count)
