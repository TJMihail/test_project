import pyautogui
import threading
import time


def auto_type():
    # 1. Даем время скрипту запуститься
    time.sleep(2)

    # 2. ПЕРЕМЕЩАЕМ КУРСОР И КЛИКАЕМ
    # Давай прикинем: терминал обычно внизу справа.
    # Координаты зависят от твоего монитора.
    # Попробуем кликнуть в нижнюю часть экрана (например, x=600, y=900)
    pyautogui.click(600, 900)

    # 3. Печатаем и нажимаем Enter
    pyautogui.write('1')
    pyautogui.press('enter')


# Запуск
threading.Thread(target=auto_type).start()

# Основной код
user_input = int(input('Enter a number: '))
print(type(user_input))
print(2 + user_input)


user_name = int(input('What is your name'))
age = int(input('What is your age'))
travel = int(input('How much travel would you like to travel?'))
print(type(user_name))
print(type(age))
print(type(travel))




