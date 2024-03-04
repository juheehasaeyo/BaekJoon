# 2506 점수계산
n = int(input())
arr = list(map(int, input().split()))
cnt = 0
res = 0
for i in range(n):
    if arr[i] == 1:
        cnt += 1
        res += cnt
    else:
        cnt = 0
print(res)