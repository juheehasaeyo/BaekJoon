# 27110 특식 배부
n = int(input())
a, b, c = map(int, input().split())
if n <= a:
    a = n
if n <= b:
    b = n
if n <= c:
    c = n
print(a+b+c)