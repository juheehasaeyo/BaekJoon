# 2028 자기복제수
t = int(input())
for _ in range(t):
    n = int(input())
    res = str(n * n)
    length = len(str(n))
    # 마지막 length개의 문자열을 슬라이싱
    if res[-length:] == str(n):
        print("YES")
    else:
        print("NO")