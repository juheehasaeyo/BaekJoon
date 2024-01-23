# 16673 고려대학교에는 공식 와인이 있다
c, k, p = map(int, input().split())
res = 0

for i in range(1, c+1):
    res += k*i + p*i*i

print(res)