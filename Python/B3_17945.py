# 17945 통학의 신
import math

a, b = map(int, input().split())
res1 = -a + math.sqrt(a*a - b)
res2 = -a - math.sqrt(a*a - b)
if res1 == res2:
    print(int(res1))
else:
    if res1 > res2:
        print((int(res2)), (int(res1)))
    else:
        print((int(res1)), (int(res2)))