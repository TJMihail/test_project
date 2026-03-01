categories = ("Смартфоны", "Ноутбуки", "Наушники")
stock = ["iPhone 15", "MacBook Pro"]

stock.append("AirPods")
stock.insert(0, "iPad Air")

# Выводим результаты
print("Весь список:", stock)
print("Кол-во товаров:", len(stock)) # Тут считаем именно stock
print("Последний товар:", stock[-1])
a = '-'
print(a * 40)

top_three = ("Song A", "Song B", "Song C")
playlist = ["Трек 1", "Трек 2"]
playlist.append("Трек 3")
playlist.insert(1, "Легенда")
playlist[0] = "Прослушано"
print("Весь измененный список", playlist)
print(top_three)
print("Первая песня из кортежа", top_three[0])
print("Последняя песня из списка", playlist[-1])