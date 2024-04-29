# 6763 Speed fines are not fine!
limit = int(input())
speed = int(input())

if speed <= limit:
    print("Congratulations, you are within the speed limit!")
else:
    fine = 0
    if 1 <= speed - limit <= 20:
        print('You are speeding and your fine is $100.')
    elif 21 <= speed - limit <= 30:
        print('You are speeding and your fine is $270.')
    else:
        print('You are speeding and your fine is $500.')