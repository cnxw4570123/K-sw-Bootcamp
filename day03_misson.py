# 6.2
import random

guess_me = random.randint(1, 10)
counts = 0;
while True:
    number = int(input('give number :'))
    if number < guess_me:
        print("too low")
    elif number == guess_me:
        print('found it!')
        break
    else:
        print('oops')
    counts += 1

print(f'attempts = {counts}, guess Number = {guess_me}')