# 14489 치킨 두 마리 (...)
a, b = map(int, input().split())
c = int(input())
if a + b >= 2*c:
    print(a + b - 2*c)
else:
    print(a + b)
