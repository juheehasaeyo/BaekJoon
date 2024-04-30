# 10599 페르시아의 왕들
while True:
    a, b, c, d = map(int, input().split())
    if a == b == c == d == 0:
        break
    print((min(c - a, d - a, c - b, d - b)), (max(c - a, d - a, c - b, d - b)))