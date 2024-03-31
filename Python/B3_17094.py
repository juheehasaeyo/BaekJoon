# 17094 Serious Problem
s_len = int(input())
for _ in range(s_len):
    s = input()
    if s.count("2") > s.count("e"):
        print("2")
        break
    elif s.count("2") < s.count("e"):
        print("e")
        break
    else:
        print("yee")
        break