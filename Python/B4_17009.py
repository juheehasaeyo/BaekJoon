# 17009 Winning Score
a = [0] * 3
b = [0] * 3
a[0] = int(input()) * 3
a[1] = int(input()) * 2
a[2] = int(input())
b[0] = int(input()) * 3
b[1] = int(input()) * 2
b[2] = int(input())
if sum(a) > sum(b):
    print("A")
elif sum(a) < sum(b):
    print("B")
else:
    print("T")