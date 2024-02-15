# 5724 파인만
while True:
    n = int(input())
    if n == 0:
        break
    res = 0
    # 1부터 n까지 반복
    for i in range(n+1):
        # 서로 다른 정사각형의 개수에 현재 숫자의 제곱 더해주기
        res += i*i
    print(res)