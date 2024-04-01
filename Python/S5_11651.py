# 11651 좌표 정렬하기 2
from functools import cmp_to_key

n = int(input())
xy =[]

for _ in range(n):
    x, y = map(int, input().split())
    xy.append([x,y])

def asc(x, y):
    if x[1] == y[1]:
       return x[0] - y[0]
    else:
        return x[1] - y[1]

sorted_asc = sorted(xy, key = cmp_to_key(asc))
for arr in sorted_asc:
    print(*arr)