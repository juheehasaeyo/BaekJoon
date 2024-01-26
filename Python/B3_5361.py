# 5361 전투 드로이드 가격
n = int(input())
sum = 0
for i in range(1, n+1):
    a, b, c, d, e = list(map(int, input().split()))
    sum = a*350.34 + b*230.90 + c*190.55 + d*125.30 + e*180.90
    dollar = "$"
    res = f"{sum:.2f}"
    print(dollar + res)