# 13623 Zero or One
a, b, c = map(int, input().split())
if a==b and b==c:
    print("*")
elif a==b and a!=c:
    print("C")
elif a==c and b!=c:
    print("B")
else:
    print("A")