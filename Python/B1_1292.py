# 1292 쉽게 푸는 문제
a, b = map(int, input().split())
arr = [0]
sum = 0
for i in range(1, b+1):
    for j in range(i):
        arr.append(i)

for i in range(a, b+1):
    sum += arr[i]
print(sum)