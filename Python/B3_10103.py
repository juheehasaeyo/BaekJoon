# 10103 주사위 게임
n = int(input())
sumcj = 0
sumsd = 0
for i in range(n):
    cj, sd = map(int, input().split())
    if cj > sd:
        sumsd += cj
    elif cj < sd:
        sumcj += sd
print(100 - sumcj)
print(100 - sumsd)
