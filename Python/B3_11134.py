# 11134 쿠키애호가
t = int(input())
for i in range(0, t):
    n, c = list(map(int, input().split()))
    if(n % c == 0):
        print(int(n / c))
    else:
        print(int(n / c + 1))