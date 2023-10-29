import re

def count_words_starting_with_e(text):
    word_pattern = r'\b[её]\w*\b'
    matches = re.findall(word_pattern, text, flags=re.IGNORECASE)
    
    return len(matches)

text = "Дана строка с русскоязычным текстом. Найти слова, начинающиеся с буквы е (или ё)."
result = count_words_starting_with_e(text)
print("Количество слов, начинающихся с 'е' или 'ё':", result)

# Вызов функции
main()
