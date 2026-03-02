# 1. Создаем персонажа
hero = {
    "name": "Aragorn",
    "stats": (10, 8, 5),          # Кортеж (Сила, Ловкость, Интеллект)
    "inventory": ["Меч", "Зелье"]  # Список предметов
}

# 2. Достаем силу (индекс 0 в кортеже stats)
power = hero["stats"][0]
print(f"Сила героя: {power}")

# 3. Добавляем предмет в список инвентаря
hero["inventory"].append("Щит")

# 4. Меняем имя
hero["name"] = "Strider"

# 5. Удаляем ключ
del hero["stats"]

print(hero)

a = '-'
print(a * 40)

student = {
    "Имя": "Михаил",
    "Курсы": ["Python", "Базы данных", "Тестирование"],
    "Контакты": ("puzirev.misha@gmail.com", "+79685120497")
}

print(student["Курсы"][1]) # Выведет: Базы данных
student["Курсы"].append("Дизайн")
student["Имя"] = "Михаил Профи"

# Сначала печатаем контакт, пока он есть
print(student["Контакты"][0])

# А уже ПОТОМ удаляем
del student["Контакты"]

# Печатаем весь словарь, чтобы увидеть, что "Контактов" больше нет
print(student)

a = '-'
print(a * 40)

store = {
"phones": ["iPhone", "Samsung"],
"brands": {"Apple", "Google"},
"status": ("Open", 9, 21)
}
store["phones"].append("Xiaomi")
store["brands"].add("Samsung")
#store["status"][1] = "10" Кортежи не изменяемы
del store["status"]
print(store)

