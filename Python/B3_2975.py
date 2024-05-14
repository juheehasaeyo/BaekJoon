# 2975 Transactions
while True:
    a, letter, b = map(str, input().split())
    a = int(a)
    b = int(b)
    if a == b == 0 and letter == "W":
        break
    if letter == "D":
        res = a + b
    elif letter == "W":
        if a-b < -200:
            res = "Not allowed"
        else:
            res = a - b
    print(res)