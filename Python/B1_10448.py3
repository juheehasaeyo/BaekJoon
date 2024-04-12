import sys

# 10448 유레카 이론
n = int(sys.stdin.readline().split()[0])

eureka_arr = []

for i in range(1, 45):
    eureka_arr.append(i*(i + 1)/2)

for _ in range(n):
    t = int(sys.stdin.readline().split()[0])
    res = 0
    for i in range(0, 44):
        for j in range(0, 44):
            for k in range(0, 44):
                if eureka_arr[i] + eureka_arr[j] + eureka_arr[k] == t:
                    res = 1

    print(res)