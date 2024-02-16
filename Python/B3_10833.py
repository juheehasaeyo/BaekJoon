# 10833 사과
t = int(input())
sum = 0
for i in range(0, t):
    student, apple = map(int, input().split())
    res = apple % student
    sum += res
print(sum)