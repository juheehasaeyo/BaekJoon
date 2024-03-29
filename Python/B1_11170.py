# 11170 0의 개수
t = int(input())
for i in range(0, t):
    n, m = map(int, input().split())
    cnt = 0
    for i in range(n, m+1):
        zero = str(i)
        cnt += zero.count("0")
    print(cnt)