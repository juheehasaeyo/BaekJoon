# 9713 Sum of Odd Sequence
t = int(input())
for _ in range(t):
    n = int(input())
    sum = 0
    for i in range(n):
        if i % 2 == 1:
            sum += i
    print(sum + n)