# 15923 욱제는 건축왕이야!!
n = int(input())
x = []
y = []
for _ in range(n):
    a, b = map(int, input().split())
    x.append(a)
    y.append(b)
print((max(x)-min(x) + max(y)-min(y))*2)