lastName = input('What is your last name')
night = int(input('How much does one night cost in credits??'))
nights = int(input('How many nights do you plan to live?'))

total = nights * night

print('Господин', lastName,'с вас', total, 'кредитов за проживание')
