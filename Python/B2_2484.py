# 2484 주사위 네개
n = int(input())
max_prize = 0
for i in range(n):
    a, b, c, d = sorted(map(int, input().split()))
    if a == b == c == d: # 1
        reward = 50000 + a * 5000
    elif a == b == c or b == c == d: # 2
        reward = 10000 + b * 1000
    elif a == b and c == d: # 두 개씩 같은 경우
        reward = 2000 + (a * 500) + (c * 500)
    elif a == b or b == c: # 두 개가 같은 경우
        reward = 1000 + (b * 100)
    elif c == d: # 두 개가 같은 경우
        reward = 1000 + (c * 100)
    else:
        reward = max(a, b, c, d) * 100

    max_prize = max(max_prize, reward)

print(max_prize)