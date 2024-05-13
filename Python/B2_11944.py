# 11944 NN
n, m = map(int, input().split())
n_str = str(n)
if len(n_str) * n >= m:
    print((n_str * n)[:m])
else:
    print(n_str * n)