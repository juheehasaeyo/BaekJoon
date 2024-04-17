# 4796 캠핑
idx = 1
while True:
    l, p, v = map(int, input().split())
    if l == p == v == 0:
        break
    if v % p > l:
        print("Case " + str(idx) + ": " + str(v // p * l + l))
    else:
        print("Case " + str(idx) + ": " + str(v // p * l + (v % p)))
    idx += 1