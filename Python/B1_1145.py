# 1145 적어도 대부분의 배수
n = list(map(int, input().split()))
min_n = min(n)
while True:
    cnt = 0
    for i in n:
        # 가장 작은 수로 나누어지는 수의 개수를 cnt++
        if min_n % i == 0:
            cnt += 1
    if cnt >= 3:
        break
    min_n += 1
print(min_n)