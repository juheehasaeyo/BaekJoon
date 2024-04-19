# 4562번 No Brainer
n = int(input())
for _ in range(n):
    x, y = map(int, input().split())
    if x >= y:
        print("MMM BRAINS")
    else:
        print("NO BRAINS")