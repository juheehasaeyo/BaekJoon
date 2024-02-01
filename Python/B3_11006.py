# 11006 남욱이의 닭장
t = int(input())
for i in range(0, t):
    n, m = map(int, input().split())
    u = 2*m - n
    r = n - m
    print(u, r)