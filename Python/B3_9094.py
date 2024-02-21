# 9094 수학적 호기심
t = int(input())
for _ in range(t):
    n, m = map(int, input().split())
    cnt = 0
    for a in range(1, n):
        for b in range(a+1, n):
            left = a*a + b*b + m
            right = a*b
            if left%right == 0:
                cnt += 1
    print(cnt)