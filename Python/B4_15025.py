# 15025 Judging Moose
l, r = map(int, input().split())
if l == r:
    if l == 0:
        print("Not a moose")
    else:
        print("Even", l * 2)
elif l > r:
    print("Odd", l * 2)
else:
    print("Odd", r * 2)