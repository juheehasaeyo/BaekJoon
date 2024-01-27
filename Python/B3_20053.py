# 20053 최소, 최대 2
t = int(input())
for i in range(0, t):
    n = int(input())
    num = list(map(int, input().split()))
    print(min(num), max(num))