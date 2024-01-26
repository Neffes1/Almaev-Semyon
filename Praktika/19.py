import os
import re
import tkinter as tk
from tkinter import filedialog, Label, Entry, Button, Text, Scrollbar, Listbox, END

def search_text_in_files(directory, search_text):
    file_list = []
    for root, dirs, files in os.walk(directory):
        for file in files:
            file_path = os.path.join(root, file)
            if os.path.isfile(file_path):
                try:
                    with open(file_path, 'r', encoding='utf-8') as f:
                        contents = f.read()
                        if re.search(search_text, contents):
                            file_list.append(file_path)
                except Exception as e:
                    print(f"Ошибка поиска {file_path}: {e}")
    return file_list

def browse_button():
    filename = filedialog.askdirectory()
    directory_entry.delete(0, END)
    directory_entry.insert(0, filename)

def search_button():
    search_directory = directory_entry.get()
    text_to_search = search_text_entry.get()
    result_files = search_text_in_files(search_directory, text_to_search)
    result_listbox.delete(0, END)
    for file in result_files:
        result_listbox.insert(END, file)

root = tk.Tk()
root.title("Поиск фаила по тексту")

directory_label = Label(root, text="Путь:")
directory_label.grid(row=0, column=0)

directory_entry = Entry(root, width=50)
directory_entry.grid(row=0, column=1)

browse_button = Button(root, text="Выбрать", command=browse_button)
browse_button.grid(row=0, column=2)

search_text_label = Label(root, text="Текст:")
search_text_label.grid(row=1, column=0)

search_text_entry = Entry(root, width=50)
search_text_entry.grid(row=1, column=1)

search_button = Button(root, text="Поиск", command=search_button)
search_button.grid(row=1, column=2)

result_label = Label(root, text="Найденные Фаилы:")
result_label.grid(row=2, column=0)

result_listbox = Listbox(root, width=100)
result_listbox.grid(row=3, column=0, columnspan=3)

scrollbar = Scrollbar(root, orient="vertical", command=result_listbox.yview)
scrollbar.grid(row=3, column=3, sticky="ns")
result_listbox.configure(yscrollcommand=scrollbar.set)

root.mainloop()
