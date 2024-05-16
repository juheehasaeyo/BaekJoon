# 14038 Tournament Selection
cnt1 = 0
cnt2 = 0
res = 0
for _ in range(6):
    n = input()
    if n == "W":
        cnt1 += 1
    elif n == "L":
        cnt2 += 1
    if cnt1 >= 5:
        res = 1
    elif cnt1 >= 3:
        res = 2
    elif cnt1 >= 1:
        res = 3
    else:
        res = -1
print(res)