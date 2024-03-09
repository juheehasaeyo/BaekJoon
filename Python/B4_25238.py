# 25238 가희와 방어율 무시
a, b = map(int,input().split())
minus = a*b/100
num = a - minus
if num >= 100:
    print("0")
else:
    print("1")