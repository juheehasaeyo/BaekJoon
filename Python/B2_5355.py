# 5355 화성 수학
t = int(input())

for _ in range(0, t):
    arr = list(map(str, input().split()))
    res = float(arr[0])
    for i in range(1, len(arr)):
        if arr[i] == "@":
            res *= 3
        elif arr[i] == "%":
            res += 5
        elif arr[i] == "#":
            res -= 7
    print("{:.2f}".format(res))