# 1551 수열의 변화
n, k = map(int, input().split())
a = list(map(int, input().split(",")))
for i in range(0, k):
    b = []
    for j in range(1, len(a)):
        b.append(a[j] - a[j-1])
    a = b
print(*a, sep = ",")