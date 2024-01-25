# 23348 스트릿 코딩 파이터
a, b, c = list(map(int,input().split()))
n = int(input())
max = 0
for i in range(0, n):
    sum = 0
    for j in range(0, 3):
        one, no_look, phone = list(map(int,input().split()))
        sum += one*a + no_look*b + phone*c
    if(sum > max):
        max = sum

print(max)