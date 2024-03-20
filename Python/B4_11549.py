# 11549 Identifying tea
n = int(input())
arr = list(map(int, input().split()))
cnt = 0
for i in range(5):
    if arr[i] == n:
        cnt += 1
print(cnt)