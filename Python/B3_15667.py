# 15667 2018 연세대학교 프로그래밍 경진대회
n = int(input())
for k in range(1, n+1):
    # 처음 쏜 불꽃 1개 + 갈라진 중형불꽃 k개, 중형불꽃 k개에서 갈라진 k개
    if 1 + k + k*k == n:
        print(k)
        break