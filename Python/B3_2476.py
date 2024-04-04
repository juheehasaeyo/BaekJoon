# 2476 주사위 게임
n = int(input())
max_prize = 0
for _ in range(n):
    a, b, c = map(int, input().split())

    if a==b and b==c:
        prize = 10000 + a * 1000
    elif a==b or a==c:
        prize = 1000 + a * 100
    elif b==c:
        prize = 1000 + b * 100
    else:
        prize = max(a,b,c) * 100

    if prize > max_prize:
        max_prize = prize

print(max_prize)