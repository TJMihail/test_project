my_fruits = {"яблоко", "банан", "апельсин"}
your_fruits = {"апельсин", "киви", "банан"}

# 1. Пересечение (&) — что есть у обоих?
common = my_fruits & your_fruits 
# Результат: {'банан', 'апельсин'}

# 2. Разность (-) — что есть у меня, чего нет у тебя?
only_mine = my_fruits - your_fruits 
# Результат: {'яблоко'}

# 3. Объединение (|) — все уникальные фрукты вместе
all_fruits = my_fruits | your_fruits 
# Результат: {'яблоко', 'банан', 'апельсин', 'киви'}
print(common)
print(only_mine)
print(all_fruits)

a = '-'
print(a * 40)

player_1 = {"Первая кровь", "Мастер", "Исследователь"}
player_2 = {"Исследователь", "Легенда", "Первая кровь"}
common = player_1 & player_2
only_mine = player_2 - player_1
player_1.add("Торговец")
all_player = player_1 | player_2
print(common)
print(only_mine)
print(all_player)